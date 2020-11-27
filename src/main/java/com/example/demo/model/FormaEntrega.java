package com.example.demo.model;

import com.example.demo.controller.dto.FormaEntregaDTOIn;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FormaEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFormaEntrega;
    private double precoFrete;
    private String nome;

    public FormaEntrega() {
        // TODO Auto-generated constructor stub
    }

    public FormaEntrega(Long idFormaEntrega, double precoFrete, String nome) {
        super();
        this.idFormaEntrega = idFormaEntrega;
        this.precoFrete = precoFrete;
        this.nome = nome;
    }

    public FormaEntrega(double precoTipo, String tipo) {
        precoFrete = precoTipo;
        nome = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idFormaEntrega == null) ? 0 : idFormaEntrega.hashCode());
        return result;
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
        FormaEntrega other = (FormaEntrega) obj;
        if (idFormaEntrega == null) {
            if (other.idFormaEntrega != null) {
                return false;
            }
        } else if (!idFormaEntrega.equals(other.idFormaEntrega)) {
            return false;
        }
        return true;
    }

    public Long getIdFormaEntrega() {
        return idFormaEntrega;
    }

    public void setIdFormaEntrega(Long idFormaEntrega) {
        this.idFormaEntrega = idFormaEntrega;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
