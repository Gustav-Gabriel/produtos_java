/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author cris
 */

@Embeddable
public class Oferta {
    private double desconto;
    private String codigoPromocional;
    private Date validade;

    public Oferta() {
    }

    public Oferta(double desconto, String codigoPromocional, Date validade) {
        this.desconto = desconto;
        this.codigoPromocional = codigoPromocional;
        this.validade = validade;
    }

    public String getCodigoPromocional() {
        return codigoPromocional;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Date getValidade() {
        return validade;
    }

    public void setCodigoPromocional(String codigoPromocional) {
        this.codigoPromocional = codigoPromocional;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    
    
}
