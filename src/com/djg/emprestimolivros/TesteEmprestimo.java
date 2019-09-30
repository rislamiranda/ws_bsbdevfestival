package com.djg.emprestimolivros;

import java.time.LocalDate;

public class TesteEmprestimo {

    public static void main(String [] args){
        Livro livro1 = new Livro("A Hora da Estrela", "Clarice Lispector");
        Usuario usuario1 = new Usuario("Risla Lopes Miranda", "Rua Oito");

        Emprestimo emprestimo1 = new Emprestimo(usuario1, livro1, LocalDate.of(2019, 9, 15));

        emprestimo1.imprimeEmprestimo();
    }
}
