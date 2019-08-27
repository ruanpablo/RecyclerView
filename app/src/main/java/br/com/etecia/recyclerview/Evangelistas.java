package br.com.etecia.recyclerview;

public class Evangelistas {
    private String nome;
    private String categoria;
    private String descricao;
    private int miniatura;

    public Evangelistas(String nome, String categoria, String descricao, int miniatura) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.miniatura = miniatura;
    }

    public Evangelistas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }


}
