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
public class Tamanho {
    private double altura;
    private double largura;
    private double produndidade;
    private EnumTamanho unidadeMedidaTam;

    public Tamanho() {
    }
    
    public Tamanho(double altura, double largura, double produndidade, EnumTamanho unidadeMedidaTam) {
        this.altura = altura;
        this.largura = largura;
        this.produndidade = produndidade;
        this.unidadeMedidaTam = unidadeMedidaTam;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProdundidade() {
        return produndidade;
    }

    public void setProdundidade(double produndidade) {
        this.produndidade = produndidade;
    }

    public EnumTamanho getUnidadeMedidaTam() {
        return unidadeMedidaTam;
    }

    public void setUnidadeMedidaTam(EnumTamanho unidadeMedidaTam) {
        this.unidadeMedidaTam = unidadeMedidaTam;
    }
}
