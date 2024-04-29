// Classe para cadastrar e remover alunos
package com.ubc.biblioteca.models;

public class Aluno{
    private int id;
    private String nome;
    private String rgm;

    public Aluno() {}

    public void cadastrar(int id, String nome, String rgm) {
        this.id = id;
        this.nome = nome;
        this.rgm = rgm;
    }

    public void listarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("RGM: " + rgm);
    }
}
