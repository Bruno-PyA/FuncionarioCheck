package org.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static List<Funcionário> funcionariosList;

    //função para inserir todos os funcionarios (na mesma ordem da tabela);
    public static void main(String[] args) {
        List<Funcionário> funcionariosList = new ArrayList<>();
        funcionariosList.add(new Funcionário("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"),
                funcionariosList.add(new Funcionário("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"),
                        funcionariosList.add(new Funcionário("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"),
                                funcionariosList.add(new Funcionário("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"),
                                        funcionariosList.add(new Funcionário("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"),
                                                funcionariosList.add(new Funcionário("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"),
                                                        funcionariosList.add(new Funcionário("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"),
                                                                funcionariosList.add(new Funcionário("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"),
                                                                        funcionariosList.add(new Funcionário("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"),
                                                                                funcionariosList.add(new Funcionário("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"),

                                                                                        //remover o funcionário "João" da lista
                                                                                        funcionariosList.removeIf(Funcionário -> Funcionário.getNome().equals("João"));

        //imprimir info.funcionario(data deve ser exibido no formato dd/mm/aaaa)e(valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.)
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat numberFormat = new DecimalFormat("#,##0.00"); ) //Escrever saída***


        //atualizar a lista com o aumento de 10% já atualizado
        funcionariosList.forEach(Funcionário -> Funcionário.setSalario(org.example.Funcionário.getSalario().multiply(new BigDecimal("1.1"))));

        // Agrupar os funcionários por função em um MAP
        Map<String, List<Funcionário>> grupoPorFuncao = funcionariosList.stream().collect(Collectors.groupingBy(Funcionário::getFuncao));
        grupoPorFuncao.forEach((funcao, lista) -> {
                    System.out.println("\n" + funcao + ":");
                    lista.forEach(System.out::println);

                    // Imprimir o total dos salários dos funcionários
                    BigDecimal totalSalarios = funcionariosList.stream()
                            .map(Funcionário::getSalario) // Mapeia cada funcionário para o seu salário
                            .reduce(BigDecimal.ZERO, BigDecimal::add); // Soma todos os salários

                    System.out.println("Total dos salários: " + numberFormat.format(totalSalarios));


                    //Imprimir os funcionários, agrupados por função.
                    Map<String, List<Funcionário>> funcionariosPorFuncao = funcionariosList.stream()
                            .collect(Collectors.groupingBy(Funcionário::getFuncao));
                    funcionariosPorFuncao.forEach((funcao, listaFuncionarios) -> {
                        System.out.println("Função: " + funcao);
                        listaFuncionarios.forEach(System.out::println);
                    });
                }
                //Imprimir os funcionários que fazem aniversário no mês 10 e 12.
                //Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
                // Imprimir a lista de funcionários por ordem alfabética.
                // Imprimir o total dos salários dos funcionários.
                //Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
    }