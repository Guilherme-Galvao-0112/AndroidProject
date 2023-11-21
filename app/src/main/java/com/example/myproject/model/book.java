package com.example.myproject.model;

import java.util.Date;

public class book {
    private String titulo;
    private String autor;
    private Date dataLancamento;
    private String genero;
    private double avaliacao;

    // Construtor
    public book(String titulo, String autor, Date dataLancamento, String genero, double avaliacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    // Métodos de acesso (getters e setters)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

}
