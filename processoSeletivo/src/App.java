import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import db.Database;
import handler.Handler;
import handler.ProvaDesempenhoHandler;
import handler.ProvaTituloHandler;
import model.Candidato;

public class App {
    public static void main(String[] args) throws Exception {
        Database banco = new Database();
        List<Candidato> candidatos = new ArrayList<Candidato>(banco.getAllCandidatos());
        Handler provaDesempenho = new ProvaDesempenhoHandler();
        Handler provaTitulo = new ProvaTituloHandler();

        provaDesempenho.setNext(provaTitulo);
        for (Candidato candidato : candidatos) {
            provaDesempenho.handle(candidato);
        }

        candidatos.sort(Comparator.comparing(Candidato::getPontuacaoTotal).reversed());

        for (Candidato candidato : candidatos) {
            System.out.println();
            System.out.println((candidatos.indexOf(candidato) + 1) + "° Lugar - " + candidato.getNome() + " - "
                    + candidato.getPontuacaoTotal() + " pontos");
        }
    }
}
