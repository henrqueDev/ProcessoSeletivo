package model;

import java.util.Set;

import model.experiencia.abstrato.Experiencia;
import model.titulo.abstrato.Titulo;

public class Candidato {
    private final String cpf;
    private final String nome;
    private final int pontuacaoDesempenho;
    private final Set<Titulo> titulos;
    private final Set<Experiencia> experiencias;
    private int pontuacaoTitulos;

    public Candidato(String cpf, String nome, Set<Titulo> titulos,
            Set<Experiencia> experiencias, int pontuacaoDesempenho) {
        this.cpf = cpf;
        this.nome = nome;
        this.titulos = titulos;
        this.experiencias = experiencias;
        this.pontuacaoDesempenho = pontuacaoDesempenho;
    }

    public String getCPF() {
        return this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacaoDesempenho() {
        return pontuacaoDesempenho;
    }

    public Set<Titulo> getTitulos() {
        return titulos;
    }

    public Set<Experiencia> getExperiencias() {
        return experiencias;
    }

    public int getPontuacaoTitulos() {
        return pontuacaoTitulos;
    }

    public void setPontuacaoTitulos(int pontuacaoTitulos) {
        this.pontuacaoTitulos = pontuacaoTitulos;
    }

    public int getPontuacaoTotal() {
        return pontuacaoDesempenho + pontuacaoTitulos;
    }

    @Override
    public String toString() {
        return "model.Candidato{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", pontuacaoDesempenho=" + pontuacaoDesempenho +
                ", titulos=" + titulos +
                ", experiencias=" + experiencias +
                ", pontuacaoTitulos=" + pontuacaoTitulos +
                ", pontuacaoTotal=" + getPontuacaoTotal() +
                '}';
    }
}
