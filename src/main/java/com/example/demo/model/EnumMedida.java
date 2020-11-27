/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

/**
 *
 * @author gggabriel
 */
public enum EnumMedida {
    METRO("metro"),
    CENTIMETRO("centimetro"),
    IMPERIAL("imperial");
       
    private String descricao;

    EnumMedida(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
