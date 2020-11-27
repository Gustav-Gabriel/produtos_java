/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

/**
 *
 * @author cris
 */
public class ErroDTO {
    private String campoErrado;
    private String mensagemDeErro;

    public ErroDTO() {
    }

    public ErroDTO(String campoErrado, String mensagemDeErro) {
        this.campoErrado = campoErrado;
        this.mensagemDeErro = mensagemDeErro;
    }

    public String getCampoErrado() {
        return campoErrado;
    }

    public void setCampoErrado(String campoErrado) {
        this.campoErrado = campoErrado;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }
    
    
    
    
}
