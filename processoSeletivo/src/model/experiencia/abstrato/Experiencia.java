package model.experiencia.abstrato;

public abstract class Experiencia {
    private final String nome;
    private final int pontuacaoDefault;
    private final int pontuacaoMaxima;
    private final int periodos;

    public Experiencia(String nome, int periodos, int pontuacaoDefault, int pontuacaoMaxima) {
        this.nome = nome;
        this.pontuacaoDefault = pontuacaoDefault;
        this.pontuacaoMaxima = pontuacaoMaxima;
        this.periodos = periodos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacaoTotal() {
        return Math.min(this.periodos * this.pontuacaoDefault, this.pontuacaoMaxima);
    }

}
