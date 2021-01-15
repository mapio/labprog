import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pacchetto p = Pacchetto.parsePacchetto(s.nextLine());
        Messaggio m = new Messaggio(p);
        System.out.println(m.completo());
        System.out.print(m);
        while (s.hasNextLine()) {
            m.aggiungi(Pacchetto.parsePacchetto(s.nextLine()));
            System.out.println(m.completo());
            System.out.print(m);
        }
    }
}
