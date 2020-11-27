/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.FormaEntrega;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cris
 */
public class FormaEntregaDTO {

  
    
    private double precoFrete;
    private String nome;

    
      static List<FormaEntregaDTO> parse(List<FormaEntrega> formaEntregas) {
        
        List<FormaEntregaDTO> formas = new ArrayList<>();
        
        for(FormaEntrega entrega: formaEntregas){
            formas.add(new FormaEntregaDTO(entrega));
        }
    
        return formas;
    }
    
    public FormaEntregaDTO(FormaEntrega forma){
        
        this.nome= forma.getNome();
        this.precoFrete = forma.getPrecoFrete();
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
