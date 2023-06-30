package edital;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import db.Database;
import handler.Handler;
import handler.ProvaDesempenhoHandler;
import handler.ProvaTituloHandler;
import model.Candidato;

public final class Edital {

    Database banco;
    List<Candidato> candidatos;
    Handler provaDesempenho;
    Handler provaTitulo;

    public Edital(Database banco) {
        this.banco = banco;
        this.candidatos = new ArrayList<Candidato>(banco.getAllCandidatos());
        this.provaDesempenho = new ProvaDesempenhoHandler();
        this.provaTitulo = new ProvaTituloHandler();
    }

    public void processarAvaliacoes() {
        this.provaDesempenho.setNext(this.provaTitulo);
        for (Candidato candidato : this.candidatos) {
            this.provaDesempenho.handle(candidato);
        }

        for (Candidato candidato : new ArrayList<Candidato>(this.candidatos)) {
            if (!candidato.isClassificado()) {
                this.candidatos.remove(candidato);
            }
        }

        candidatos.sort(Comparator.comparing(Candidato::getPontuacaoTotal).reversed());

        for (Candidato candidato : candidatos) {
            System.out.println((candidatos.indexOf(candidato) + 1) + "° Lugar - " + candidato.getNome() + " - "
                    + candidato.getPontuacaoTotal() + " pontos");
        }
    }

}
