package model.titulo.abstrato;

public abstract class Titulo {
    private final String nome;
    private final int pontuacao;

    public Titulo(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
