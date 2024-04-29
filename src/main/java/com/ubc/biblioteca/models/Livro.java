// Classe para os livros da biblioteca
package com.ubc.biblioteca.models;

public class Livro{
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int paginas;
    private int quantidade;

    public Livro() {}

    public void cadastrarLivro(int id, String titulo, String autor, String editora, int paginas, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.quantidade = quantidade;
    }

    public void listarInfo() {
        System.out.println("ID Livro: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Paginas: " + paginas);
        System.out.println("Quantidade disponível: " + quantidade);
    }


}

