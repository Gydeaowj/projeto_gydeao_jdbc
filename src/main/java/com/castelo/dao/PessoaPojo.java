package com.castelo.dao;

public class PessoaPojo {

    private int id;
    private String nome;
    private String cpf;
    private int idade;

    public PessoaPojo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "PessoaPojo [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
    }

    
}
