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

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final Giocatore primo = new Giocatore(parseNavi(s.nextLine()), parseMosse(s.nextLine()));
        final Giocatore secondo = new Giocatore(parseNavi(s.nextLine()), parseMosse(s.nextLine()));
        final Arbitro arbitro = new Arbitro(primo, secondo);
        System.out.println(arbitro);
        while (arbitro.haProssimoPasso()) {
            arbitro.prossimoPasso();
            System.out.println(arbitro);
        }
    }
}
