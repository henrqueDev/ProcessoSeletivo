import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import db.Database;
import edital.Edital;
import handler.Handler;
import handler.ProvaDesempenhoHandler;
import handler.ProvaTituloHandler;
import model.Candidato;

public class App {
    public static void main(String[] args) throws Exception {
        Database banco = new Database();
        Edital edital = new Edital(banco);
        edital.processarAvaliacoes();

    }
}
