package model;

import java.util.Set;

import model.experiencia.abstrato.Experiencia;
import model.titulo.abstrato.Titulo;

public class Candidato {
    private final String rg;
    private final String nome;
    private final int pontuacaoDesempenho;
    private final Set<Titulo> titulos;
    private final Set<Experiencia> experiencias;
    private boolean classificado;
    private int pontuacaoTitulos;

    public Candidato(String rg, String nome, Set<Titulo> titulos,
            Set<Experiencia> experiencias, int pontuacaoDesempenho) {
        this.rg = rg;
        this.nome = nome;
        this.titulos = titulos;
        this.experiencias = experiencias;
        this.pontuacaoDesempenho = pontuacaoDesempenho;
        this.classificado = false;
    }

    public String getRG() {
        return this.rg;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPontuacaoDesempenho() {
        return Math.min(this.pontuacaoDesempenho, 100);
    }

    public Set<Titulo> getTitulos() {
        return this.titulos;
    }

    public Set<Experiencia> getExperiencias() {
        return this.experiencias;
    }

    public boolean isClassificado() {
        return this.classificado;
    }

    public void classificar() {
        this.classificado = true;
    }

    public int getPontuacaoTitulos() {
        return Math.min(pontuacaoTitulos, 75);
    }

    public void setPontuacaoTitulos(int pontuacaoTitulos) {
        this.pontuacaoTitulos = pontuacaoTitulos;
    }

    public int getPontuacaoTotal() {
        return this.getPontuacaoDesempenho() + this.getPontuacaoTitulos();
    }

    @Override
    public String toString() {
        return this.nome + "| RG:" + this.rg;
    }
}
