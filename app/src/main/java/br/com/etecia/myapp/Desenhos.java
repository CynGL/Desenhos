package br.com.etecia.myapp;

public class Desenhos {
    private String titulo;

    private String descricao;

    private String categoria;

    private int imagem;

    //Criar o construtor com parâmetros ALT + INSERT
    //Construtor
    // para selecionar tudo: shift + tecla pra baixo


    public Desenhos(String titulo, String descricao, String categoria, int imagem) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.imagem = imagem;
    }

    //Para selecionar tudo: ALT + INSERT
    //Getter and Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
