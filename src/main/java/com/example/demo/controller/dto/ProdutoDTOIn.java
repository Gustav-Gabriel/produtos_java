/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.Categoria;
import com.example.demo.model.FichaTecnica;
import com.example.demo.model.Moeda;
import com.example.demo.model.Oferta;
import com.example.demo.model.Produto;
import java.util.Date;
import javax.validation.constraints.NotNull;
import java.util.List;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

/**
 *
 * @author cris
 */
public class ProdutoDTOIn {

    @Positive
    private int idFornecedor;

    @NotNull
    @NotEmpty
    @Size(max = 200, min = 1)
    private String nome;

    @PositiveOrZero
    private double preco;

    @PositiveOrZero
    private double precoVenda;

    @Size(min = 1)
    private String[] urlsImagens;

    @Size(min = 1)
    private List<FormaEntregaDTOIn> formasEntrega;

    private String categoria;

    @NotNull
    private String moeda;

    private double desconto;
    private String codigoPromocional;
    private Date validade;
    private FichaTecnicaDTOIn fichaTecnica;

    public ProdutoDTOIn() {
    }

    public Produto parseToProduto() {

        Categoria cat = null;
        Moeda un = null;
        switch (categoria.toLowerCase()) {
            case "eletronico":
                cat = Categoria.ELETRONICO;
                break;
            case "despesa":
                cat = Categoria.DESPESA;
                break;

            case "alimentacao":
                cat = Categoria.ALIMENTACAO;
                break;

            case "esporte":
                cat = Categoria.ESPORTE;
                break;
        }

        switch (moeda.toLowerCase()) {
            case "dolar":
                un = Moeda.DOLAR;
                break;
            case "euro":
                un = Moeda.EURO;
                break;

            case "real":
                un = Moeda.REAL;
                break;

        }
        Oferta promo = new Oferta(desconto, codigoPromocional, validade);
        Produto novo = new Produto(Integer.toUnsignedLong(this.idFornecedor),
                this.nome, this.preco, this.precoVenda, this.urlsImagens,
                FormaEntregaDTOIn.parse(this.formasEntrega), cat, un, promo, 
                FichaTecnicaDTOIn.parse(fichaTecnica));

        return novo;
    }

    public ProdutoDTOIn(int idFornecedor, String nome, double preco, double precoVenda, String[] urls) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.preco = preco;
        this.precoVenda = precoVenda;
        this.urlsImagens = urls;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String[] getUrlsImagens() {
        return urlsImagens;
    }

    public void setUrlsImagens(String[] urlsImagens) {
        this.urlsImagens = urlsImagens;
    }

    public List<FormaEntregaDTOIn> getFormasEntrega() {
        return formasEntrega;
    }

    public void setFormasEntrega(List<FormaEntregaDTOIn> formasEntrega) {
        this.formasEntrega = formasEntrega;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getCodigoPromocional() {
        return codigoPromocional;
    }

    public void setCodigoPromocional(String codigoPromocional) {
        this.codigoPromocional = codigoPromocional;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public FichaTecnicaDTOIn getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(FichaTecnicaDTOIn fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }
}
