package handler;

import model.Candidato;
import model.experiencia.abstrato.Experiencia;
import model.titulo.abstrato.Titulo;

public class ProvaTituloHandler extends BaseHandler {

    @Override
    public void handle(Candidato candidato) {
        int pontuacao = 0;
        for (Experiencia experiencia : candidato.getExperiencias()) {
            pontuacao += experiencia.getPontuacaoTotal();
        }

        for (Titulo titulo : candidato.getTitulos()) {
            pontuacao += titulo.getPontuacao();
        }

        candidato.setPontuacaoTitulos(pontuacao);

        System.out.println(candidato.getNome() + " | Nota prova de titulos -> "
                + candidato.getPontuacaoTitulos());

        System.out.println(candidato.getNome() + " | Nota final -> " + candidato.getPontuacaoTotal());
    }

}
