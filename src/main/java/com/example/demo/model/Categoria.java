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
public enum Categoria {
    ELETRONICO("eletronico"), 
    DESPESA("despesa"), 
    ALIMENTACAO("alimentacao"), 
    ESPORTE("esporte");
       
    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
