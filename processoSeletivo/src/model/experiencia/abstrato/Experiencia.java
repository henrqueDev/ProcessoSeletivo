package model.experiencia.abstrato;

public abstract class Experiencia {
    private final String nome;
    private final int pontuacaoMaxima;
    private final int periodos;

    public Experiencia(String nome, int periodos, int pontuacaoMaxima) {
        this.nome = nome;
        this.pontuacaoMaxima = pontuacaoMaxima;
        this.periodos = periodos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacaoTotal() {
        return Math.min(periodos, pontuacaoMaxima);
    }

}
