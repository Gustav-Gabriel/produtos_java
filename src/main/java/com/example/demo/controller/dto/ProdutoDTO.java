/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller.dto;

import com.example.demo.model.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cris
 */
public class ProdutoDTO {

    private Long idProduto;
    private String nome;
    private double preco;
    private double precoVenda;
    private List<FormaEntregaDTO> formasEntrega;
    private String[] urlsImagens;
    private String categoria;
    private String moeda;
    private double desconto;
    private String codigoPromocional;
    private Date validade;
    private FichaTecnicaDTO fichaTecnica;

    public static List<ProdutoDTO> parse(Iterable<Produto> produtos) {
        List<ProdutoDTO> dtos = new ArrayList<>();

        //para cada produto da lista
        for (Produto prod : produtos) {

            //instancia o ProdutoDTO e armazena na lista a ser retornada
            dtos.add(new ProdutoDTO(prod));
        }
        //retorna a lista
        return dtos;
        //outra forma de fazer com Java8
        //return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());      
    }

    public ProdutoDTO(Produto prod) {
        this.idProduto = prod.getIdProduto();
        this.nome = prod.getNome();
        this.preco = prod.getPreco();
        this.precoVenda = prod.getPrecoVenda();
        this.formasEntrega = FormaEntregaDTO.parse(prod.getFormasEntrega());
        this.urlsImagens = prod.getUrlsImagens();
        this.categoria = prod.getCategoria().getDescricao();
        this.moeda = prod.getMoeda().getDescricao();
        this.validade = prod.getOferta().getValidade();
        this.desconto = prod.getOferta().getDesconto();
        this.codigoPromocional = prod.getOferta().getCodigoPromocional();
        this.fichaTecnica = FichaTecnicaDTO.parse(prod.getFichaTecnica());
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

    public void setFormasEntrega(List<FormaEntregaDTO> formasEntrega) {
        this.formasEntrega = formasEntrega;
    }

    public List<FormaEntregaDTO> getFormasEntrega() {
        return formasEntrega;
    }

    public String[] getUrlsImagens() {
        return urlsImagens;
    }

    public void setUrlsImagens(String[] urlsImagens) {
        this.urlsImagens = urlsImagens;
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

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
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

    public FichaTecnicaDTO getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(FichaTecnicaDTO fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }
}
