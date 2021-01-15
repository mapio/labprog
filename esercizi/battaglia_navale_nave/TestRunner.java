import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        int p = 0;
        Posizione[] tutte = new Posizione[100];
        for (int riga = 0; riga < 10; riga++)
            for (int colonna = 0; colonna < 10; colonna++)
                tutte[p++] = new Posizione(riga, colonna);

        Scanner s = new Scanner(System.in);
        Nave n0 = new Nave(new Posizione(0, 0), 2, true);
        Nave n1 = Nave.parseNave("B2:3:V");
        System.out.println(n0);
        System.out.println(n1);

        while (s.hasNext()) {
            String stringa = s.next();
            Nave nave = Nave.parseNave(stringa);
            System.out.println(nave);
            int inizio = -1;
            int lunghezza = 0;
            for (p = 0; p < 100; p++) {
                if (nave.occupa(tutte[p])) {
                    nave.colpisci(tutte[p]);
                    lunghezza++;
                    if (inizio == -1) inizio = p;
                }
            }
            if (inizio == -1) {
                System.out.println("Non ho trovato " + stringa);
                continue;
            }
            if (!nave.affondata()) System.out.println("Non affondata " + stringa);
            boolean orizzontale = nave.occupa(tutte[inizio + 1]);
            String verifica = (char)('A' + tutte[inizio].colonna) + "" + (tutte[inizio].riga + 1)
                + ":" + lunghezza + ":" + (orizzontale ? 'O' : 'V');
            if (!verifica.equals(stringa))
                System.out.println("Ho letto " + stringa + ", ma ho calcolato " + verifica);
        }
    }
}
