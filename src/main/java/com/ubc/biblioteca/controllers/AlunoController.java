package com.ubc.biblioteca.controllers;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;

import com.ubc.biblioteca.models.Aluno;

@Controller
public class AlunoController {

    private final Aluno alunoModel = new Aluno();

    public String cadastrarAluno(String nome, String rgm) {
        try {
            alunoModel.cadastrar(nome, rgm);
            return "Aluno cadastrado com sucesso!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao cadastrar aluno!";
        }
    }

    public String listarAlunos() {
        try {
            alunoModel.listarAlunos();
            return "Lista de alunos exibida com sucesso!";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Erro ao listar alunos!";
        }
    }
}