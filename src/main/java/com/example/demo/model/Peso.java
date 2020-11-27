/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import javax.persistence.Embeddable;

/**
 *
 * @author gggabriel
 */
@Embeddable
public class Peso {
    private double valor;
    private EnumMedida unidadeMedidaPeso;
    
    public Peso() {  
    }

    public Peso(double valor, EnumMedida unidadeMedidaPeso) {
        this.valor = valor;
        this.unidadeMedidaPeso = unidadeMedidaPeso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EnumMedida getUnidadeMedidaPeso() {
        return unidadeMedidaPeso;
    }

    public void setUnidadeMedidaPeso(EnumMedida unidadeMedidaPeso) {
        this.unidadeMedidaPeso = unidadeMedidaPeso;
    }
}
