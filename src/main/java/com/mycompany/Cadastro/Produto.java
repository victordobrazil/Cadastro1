/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Cadastro;

/**
 *
 * @author victor.haalves2
 */
public class Produto {
    
    private String nome;
    private String descricao;
    private Double Quantidade;
    private Double preco;
    
    
    public Produto(String nome, String descricao, Double Quantidade, Double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.Quantidade = Quantidade;
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the quantidade
     */
    public Double getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade
     */
    public void setQuantidade(Double Quantidade) {
        this.Quantidade = Quantidade;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
