package com.example.myproject.model;

public class movie {
    private String titulo;
    private String diretor;
    private String atoresPrincipais;
    private String genero;
    private String classificacaoCritica;
    private String faixaEtaria;
    private double avaliacao;

    // Construtor
    public movie(String titulo, String diretor, String atoresPrincipais, String genero,
                 String classificacaoCritica, String faixaEtaria, double avaliacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atoresPrincipais = atoresPrincipais;
        this.genero = genero;
        this.classificacaoCritica = classificacaoCritica;
        this.faixaEtaria = faixaEtaria;
        this.avaliacao = avaliacao;
    }

    // Métodos de acesso (getters e setters)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtoresPrincipais() {
        return atoresPrincipais;
    }

    public void setAtoresPrincipais(String atoresPrincipais) {
        this.atoresPrincipais = atoresPrincipais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassificacaoCritica() {
        return classificacaoCritica;
    }

    public void setClassificacaoCritica(String classificacaoCritica) {
        this.classificacaoCritica = classificacaoCritica;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

}

