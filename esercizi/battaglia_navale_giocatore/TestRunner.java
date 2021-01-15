import java.util.ArrayList;
import java.util.Scanner;

public class TestRunner {
    public static Posizione[] parseMosse(final String posizioni) {
        final String[] posizione = posizioni.split("\\s*,\\s*");
        final Posizione[] risultato = new Posizione[posizione.length];
        for (int i = 0; i < posizione.length; i++)
            risultato[i] = Posizione.parsePosizione(posizione[i]);
        return risultato;
    }

    public static Nave[] parseNavi(final String navi) {
        final String[] nave = navi.split("\\s*,\\s*");
        final Nave[] risultato = new Nave[nave.length];
        for (int i = 0; i < nave.length; i++) risultato[i] = Nave.parseNave(nave[i]);
        return risultato;
    }

    public static final char[] ESITI = new char[] {'M', 'C', 'A'};

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final Giocatore g = new Giocatore(parseNavi(s.nextLine()), parseMosse(s.nextLine()));
        int i = 0;
        for (;;) {
            Posizione m = g.mossa();
            if (m == null) break;
            g.esito(ESITI[i]);
            i = (i + 1) % ESITI.length;
            System.out.println(g);
        }
    }
}
