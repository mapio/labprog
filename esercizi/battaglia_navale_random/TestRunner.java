public class TestRunner {
    public static void main(String[] args) {
        int[] lunghezze = new int[args.length];
        for (int i = 0; i < args.length; i++) lunghezze[i] = Integer.parseInt(args[i]);
        final Giocatore primo = new Giocatore(lunghezze);
        final Giocatore secondo = new Giocatore(lunghezze);
        final Arbitro arbitro = new Arbitro(primo, secondo);
        System.out.println(arbitro);
        while (arbitro.haProssimoPasso()) {
            arbitro.prossimoPasso();
            System.out.println(arbitro);
        }
    }
}
