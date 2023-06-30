package handler;

import java.util.ArrayList;
import java.util.List;

import model.Candidato;

public class ProvaDesempenhoHandler extends BaseHandler {

    @Override
    public void handle(Candidato candidato) {
        System.out
                .println(candidato.getNome() + " | Nota da prova de desempenho -> "
                        + candidato.getPontuacaoDesempenho());
        if (candidato.getPontuacaoDesempenho() >= 70) {
            if (this.next != null) {
                candidato.classificar();
                this.next.handle(candidato);
            }
        } else {
            System.out.println(candidato.getNome() + " foi reprovado na prova de desempenho");
        }
    }
}
