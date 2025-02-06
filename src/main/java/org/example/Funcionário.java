package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionário extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    public Funcionário(String nome, LocalDate dataDeNascimento, BigDecimal salario, String funcao)
    {
        super(nome, dataDeNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }
    public BigDecimal getSalario(){
        return salario;
    }
    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString(){
        return super.toString() + ", Salario " + salario + ", Função: " + funcao;
    }
}
