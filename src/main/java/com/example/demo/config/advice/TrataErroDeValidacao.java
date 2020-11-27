/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config.advice;

import com.example.demo.controller.dto.ErroDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author cris
 */
@RestControllerAdvice
public class TrataErroDeValidacao {
    
    @Autowired
    MessageSource ms;
    
    @ResponseStatus(code=HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErroDTO> obtemErros(MethodArgumentNotValidException excecao){
          
        List<ErroDTO> listaDeErros = new ArrayList<>();
        List<FieldError> erros = excecao.getBindingResult().getFieldErrors();
        
        for(FieldError e: erros){
            String mensagem = ms.getMessage(e, LocaleContextHolder.getLocale());
            ErroDTO erroOcorrido = new ErroDTO(e.getField(),mensagem );
            listaDeErros.add(erroOcorrido);
        }
        return listaDeErros;            
            
    }
}
