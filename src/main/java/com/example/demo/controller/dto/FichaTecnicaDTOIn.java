/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.EnumMedida;
import com.example.demo.model.EnumTamanho;
import com.example.demo.model.FichaTecnica;
import com.example.demo.model.Peso;
import com.example.demo.model.Tamanho;
import java.util.Date;

/**
 *
 * @author gggabriel
 */
public class FichaTecnicaDTOIn {
    private double valor;
    private String unidadeMedidaPeso;
    private double altura;
    private double largura;
    private double profundidade;
    private String unidadeMedidaTam;
    private String marca;
    private String cor;
    private Date validade;

    public FichaTecnicaDTOIn(double valor, String unidadeMedidaPeso, double altura, double largura, double profundidade, String unidadeMedidaTam, String marca, String cor, Date validade) {
        this.valor = valor;
        this.unidadeMedidaPeso = unidadeMedidaPeso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.unidadeMedidaTam = unidadeMedidaTam;
        this.marca = marca;
        this.cor = cor;
        this.validade = validade;
    }
    
    public static FichaTecnica parse(FichaTecnicaDTOIn fichaTecnica) {
        EnumTamanho enumTam = null;
        EnumMedida enumMedida = null;
        switch(fichaTecnica.getUnidadeMedidaPeso().toLowerCase()){
            case "kilo":
                enumTam = EnumTamanho.KILO;
                break;
            case "grama":
                enumTam = EnumTamanho.GRAMA;
                break;           
            case "litro":
                enumTam = EnumTamanho.LITRO;
                break;
        }
        switch(fichaTecnica.getUnidadeMedidaTam().toLowerCase()){
            case "imperial":
                enumMedida = EnumMedida.IMPERIAL;
                break;
            case "metro":
                enumMedida = EnumMedida.METRO;
                break;           
            case "centimetro":
                enumMedida = EnumMedida.CENTIMETRO;
                break;
        }
        Peso peso = new Peso(fichaTecnica.getValor(), enumMedida);
        Tamanho tamanho = new Tamanho(fichaTecnica.getAltura(), 
                                      fichaTecnica.getLargura(), 
                                      fichaTecnica.getProfundidade(), 
                                      enumTam);
        FichaTecnica nova = new FichaTecnica(peso, 
                                             tamanho, 
                                             fichaTecnica.getMarca(), 
                                             fichaTecnica.getCor(), 
                                             fichaTecnica.getValidade());
        return nova;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidadeMedidaPeso() {
        return unidadeMedidaPeso;
    }

    public void setUnidadeMedidaPeso(String unidadeMedidaPeso) {
        this.unidadeMedidaPeso = unidadeMedidaPeso;
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

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public String getUnidadeMedidaTam() {
        return unidadeMedidaTam;
    }

    public void setUnidadeMedidaTam(String unidadeMedidaTam) {
        this.unidadeMedidaTam = unidadeMedidaTam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    
}
