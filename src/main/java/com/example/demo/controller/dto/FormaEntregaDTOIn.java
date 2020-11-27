/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.FormaEntrega;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

/**
 *
 * @author cris
 */
public class FormaEntregaDTOIn {
    
    @NotEmpty
    private String nome;
    
    @PositiveOrZero
    private double precoFrete;

    public FormaEntregaDTOIn() {
    }

     public static List<FormaEntrega> parse(List <FormaEntregaDTOIn> formasIn){
        
        List<FormaEntrega> formas = new ArrayList<>();
        for(FormaEntregaDTOIn obj: formasIn){
            //Instanciar as formas de entrega
             FormaEntrega fe = new FormaEntrega( obj.getPrecoFrete(), obj.getNome());
            
            //adicionar na lista
            formas.add(fe);
            
        }
        return formas;
    }
    public FormaEntregaDTOIn(String nome, double preco_frete) {
        this.nome = nome;
        this.precoFrete = preco_frete;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }

    
   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    
   
}
