package com.example.demo.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduto;
    private Long idFornecedor;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<FormaEntrega> formasEntrega;

    private String nome;
    private double preco;
    private double precoVenda;
    private String[] urlsImagens;

    @Embedded
    private Oferta oferta;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Enumerated(EnumType.STRING)
    private Moeda moeda;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_ficha_tecnica")
    private FichaTecnica fichaTecnica;

    public Produto() {
        // TODO Auto-generated constructor stub
    }

    public Produto(Long idProduto, Long idFornecedor, List<FormaEntrega> formaEntregas, String nome, double preco,
            double precoVenda, String[] urlsImagens, Categoria categoria, Moeda moeda, Oferta oferta) {
        super();
        this.idProduto = idProduto;
        this.idFornecedor = idFornecedor;
        this.formasEntrega = formaEntregas;
        this.nome = nome;
        this.preco = preco;
        this.precoVenda = precoVenda;
        this.urlsImagens = urlsImagens;
        this.oferta = oferta;
        this.categoria = categoria;
        this.moeda = moeda;
    }

    public Produto(Long idFornecedor, String nome, double preco, double precoVenda, String[] urls, List<FormaEntrega> formas, Categoria categoria, Moeda moeda, Oferta oferta, FichaTecnica fichaTecnica) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.preco = preco;
        this.precoVenda = precoVenda;
        this.urlsImagens = urls;
        this.formasEntrega = formas;
        this.categoria = categoria;
        this.moeda = moeda;
        this.oferta = oferta;
        this.fichaTecnica = fichaTecnica;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.idProduto);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.idProduto, other.idProduto)) {
            return false;
        }
        return true;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public List<FormaEntrega> getFormasEntrega() {
        return formasEntrega;
    }

    public void setFormasEntrega(List<FormaEntrega> formasEntrega) {
        this.formasEntrega = formasEntrega;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public FichaTecnica getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(FichaTecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }
}
