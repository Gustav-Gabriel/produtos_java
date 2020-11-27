/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.FichaTecnica;
import java.util.Date;

/**
 *
 * @author gggabriel
 */
public class FichaTecnicaDTO {

    private double valor;
    private String unidadeMedidaPeso;
    private double altura;
    private double largura;
    private double profundidade;
    private String unidadeMedidaTam;
    private String marca;
    private String cor;
    private Date validade;

    public FichaTecnicaDTO(FichaTecnica fichaTecnica) {
        this.valor = fichaTecnica.getPeso().getValor();
        this.unidadeMedidaPeso = fichaTecnica.getPeso().getUnidadeMedidaPeso().getDescricao();
        this.altura = fichaTecnica.getTamanho().getAltura();
        this.largura = fichaTecnica.getTamanho().getLargura();
        this.profundidade = fichaTecnica.getTamanho().getProdundidade();
        this.unidadeMedidaTam = fichaTecnica.getTamanho().getUnidadeMedidaTam().getDescricao();
        this.marca = fichaTecnica.getMarca();
        this.cor = fichaTecnica.getCor();
        this.validade = fichaTecnica.getValidade();
    }

    static FichaTecnicaDTO parse(FichaTecnica fichaTecnica) {
        FichaTecnicaDTO fichaTecnicaDTO = new FichaTecnicaDTO(fichaTecnica);
        return fichaTecnicaDTO;
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
