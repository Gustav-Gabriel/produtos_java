/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gggabriel
 */
@Entity
public class FichaTecnica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFichaTecnica;
    
    @Embedded
    private Peso peso;
    
    @Embedded
    private Tamanho tamanho;
    
    private String marca;
    private String cor;
    private Date validade;
    
    public FichaTecnica() {
    }

    public FichaTecnica(Peso peso, Tamanho tamanho, String marca, String cor, Date validade) {
        this.peso = peso;
        this.tamanho = tamanho;
        this.marca = marca;
        this.cor = cor;
        this.validade = validade;
    }

    public long getIdFichaTecnica() {
        return idFichaTecnica;
    }

    public void setIdFichaTecnica(long idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichaTecnica other = (FichaTecnica) obj;
        if (this.idFichaTecnica != other.idFichaTecnica) {
            return false;
        }
        return true;
    }
}
