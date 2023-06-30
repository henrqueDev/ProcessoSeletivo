package handler;

import model.Candidato;

public abstract class BaseHandler implements Handler {

    protected Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public abstract void handle(Candidato candidato);

}
