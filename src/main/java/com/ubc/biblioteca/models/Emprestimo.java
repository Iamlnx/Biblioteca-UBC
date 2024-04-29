// Classe para pegar e devolver os livros da biblioteca
package com.ubc.biblioteca.models;

import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private int id_livro;
    private int id_usuario;
    private LocalDate data_retirada;
    private LocalDate data_devolucao;

    public Emprestimo() {}

    public void cadastrarEmprestimo(int id, int id_livro, int id_usuario, LocalDate data_retirada, LocalDate data_devolucao) {
        this.id = id;
        this.id_livro = id_livro;
        this.id_usuario = id_usuario;
        this.data_retirada = data_retirada;
        this.data_devolucao = data_devolucao;

    }

    public void listarInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("ID do livro: " + this.id_livro);
        System.out.println("Usuario: " + this.id_usuario);
        System.out.println("Data de retirada: " + this.data_retirada);
        System.out.println("Data de devolucao: " + this.data_devolucao);
    }

}





