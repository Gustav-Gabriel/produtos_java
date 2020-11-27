/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

/**
 *
 * @author cris
 */
public enum Moeda {
    DOLAR("dolar"), 
    EURO("euro"), 
    REAL("real"); 
       
    private String descricao;

    Moeda(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
