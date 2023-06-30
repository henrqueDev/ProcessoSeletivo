package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import model.Candidato;
import model.experiencia.ExperienciaGestaoAcademicaCargoDirecao;
import model.experiencia.ExperienciaGestaoAcademicaCoordenacao;
import model.experiencia.ExperienciaMagisterioIF;
import model.experiencia.abstrato.Experiencia;
import model.titulo.TituloDoutor;
import model.titulo.abstrato.Titulo;

public final class Database {
    private Set<Candidato> candidatos;

    public Database() {
        this.candidatos = new HashSet<Candidato>(
                new ArrayList<>(Arrays.asList(
                        new Candidato(
                                "1.111.111",
                                "Sion",
                                Set.of(new Titulo[] { new TituloDoutor() }),
                                Set.of(new Experiencia[] {
                                        new ExperienciaMagisterioIF(2),
                                        new ExperienciaGestaoAcademicaCoordenacao(2),
                                        new ExperienciaGestaoAcademicaCargoDirecao(2) }),
                                69))));

    }

    public Set<Candidato> getAllCandidatos() {
        return this.candidatos;
    }

}
