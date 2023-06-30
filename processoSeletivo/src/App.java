
import db.Database;
import edital.Edital;

public class App {
    public static void main(String[] args) throws Exception {
        Database banco = new Database();
        Edital edital = new Edital(banco);
        edital.processarAvaliacoes();
    }
}
