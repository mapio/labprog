import java.util.ArrayList;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        int p = 0;
        Posizione[] tutte = new Posizione[100];
        for (int riga = 0; riga < 10; riga++)
            for (int colonna = 0; colonna < 10; colonna++)
                tutte[p++] = new Posizione(riga, colonna);

        Scanner s = new Scanner(System.in);
        Griglia g = new Griglia();

        while (s.hasNext()) g.aggiungi(Nave.parseNave(s.next()));

        ArrayList<Posizione> occupate = new ArrayList<Posizione>();
        ArrayList<Posizione> libere = new ArrayList<Posizione>();
        for (p = 0; p < 100; p++) {
            if (g.colpita(tutte[p])) System.out.println("Colpita prima dei colpi: " + tutte[p]);
            if (g.affondata(tutte[p])) System.out.println("Affondata prima dei colpi: " + tutte[p]);
            if (g.occupata(tutte[p]))
                occupate.add(tutte[p]);
            else
                libere.add(tutte[p]);
        }
        if (occupate.size() + libere.size() != 100)
            System.out.println("Non torna il conto delle posizioni libere: " + libere.size());
        for (p = 0; p < 100; p++) g.colpisci(tutte[p]);
        int colpite = 0, affondate = 0;
        for (Posizione pos : occupate) {
            if (!g.colpita(pos))
                System.out.println("Non colpita dopo i colpi: " + pos);
            else
                colpite++;
            if (!g.affondata(pos))
                System.out.println("Non affondata dopo i colpi: " + pos);
            else
                affondate++;
        }
        if (occupate.size() != colpite || occupate.size() != affondate)
            System.out.println("Non tornano i conti!");
        if (!g.tutteAffondate()) System.out.println("Ma non sono tutte affondate!");
        System.out.printf("Occupate: %d, libere: %d, colpite: %d, affondate: %d.\n",
            occupate.size(), libere.size(), colpite, affondate);
    }
}
