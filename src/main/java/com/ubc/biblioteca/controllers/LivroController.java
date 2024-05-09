package com.ubc.biblioteca.controllers;

import com.ubc.biblioteca.models.Livro;
import org.springframework.stereotype.Controller;
import java.sql.SQLException;

@Controller
public class LivroController {

    private final Livro livroModel = new Livro();

    public String cadastrarLivro(String titulo, String autor, String editora, int paginas, int quantidade) {
        try {
            livroModel.cadastrarLivro(titulo, autor, editora, paginas, quantidade);
            return "Livro cadastrado com sucesso!";
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return "Erro ao cadastrar livro!";
        }
    }

    public String listarLivros() {
        try {
            livroModel.listarInfo();
            return "Lista de livros exibida com sucesso!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao listar livros!";
        }
    }
}
