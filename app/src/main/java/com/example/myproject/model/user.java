package com.example.myproject.model;

public class user {
        private String nome;
        private String telefone;
        private String cpf;
        private String email;

        // Construtor
        public user(String nome, String telefone, String cpf, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.cpf = cpf;
            this.email = email;
        }

        // Métodos de acesso (getters e setters)
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

}
