import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ricevitore r = new Ricevitore();
        while (s.hasNextLine()) {
            r.ricevi(Pacchetto.parsePacchetto(s.nextLine()));
            if (r.haProssimoCompleto()) System.out.print(r.prossimoCompleto());
        }
    }
}
