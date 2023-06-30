package handler;

import model.Candidato;

public interface Handler {

    void setNext(Handler handler);

    void handle(Candidato candidato);

}
