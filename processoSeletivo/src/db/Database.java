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
                                        new ExperienciaMagisterioIF(1),
                                        new ExperienciaGestaoAcademicaCoordenacao(1),
                                        new ExperienciaGestaoAcademicaCargoDirecao(1) }),
                                79),
                        new Candidato(
                                "2.222.222",
                                "Jão",
                                Set.of(new Titulo[] { new TituloDoutor() }),
                                Set.of(new Experiencia[] {
                                        new ExperienciaMagisterioIF(2),
                                        new ExperienciaGestaoAcademicaCoordenacao(2),
                                        new ExperienciaGestaoAcademicaCargoDirecao(2) }),
                                89),
                        new Candidato(
                                "3.333.333",
                                "Chico Melancia",
                                Set.of(new Titulo[] { new TituloDoutor() }),
                                Set.of(new Experiencia[] {
                                        new ExperienciaMagisterioIF(3),
                                        new ExperienciaGestaoAcademicaCoordenacao(3) }),
                                70),
                        new Candidato(
                                "4.444.444",
                                "Carla",
                                Set.of(new Titulo[] { new TituloDoutor() }),
                                Set.of(new Experiencia[] {
                                        new ExperienciaMagisterioIF(2) }),
                                99),
                        new Candidato(
                                "5.555.555",
                                "Fabiana",
                                Set.of(new Titulo[] { new TituloDoutor() }),
                                Set.of(new Experiencia[] {
                                        new ExperienciaGestaoAcademicaCoordenacao(5) }),
                                69))));

    }

    public Set<Candidato> getAllCandidatos() {
        return this.candidatos;
    }

}
