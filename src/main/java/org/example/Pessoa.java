package org.example;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;

    //abaixo declaramos quais são os paramêtros que atendem a classe Pessoa
    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    //Com um alt + insert colocamos os métodos getters para chamar os atributos quando necessários, já que são privados.
    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
}