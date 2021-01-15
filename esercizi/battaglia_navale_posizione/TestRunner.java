public class TestRunner {
    public static void main(String[] args) {
        Posizione pos = new Posizione(0, 0);
        System.out.println(pos.riga);
        System.out.println(pos.colonna);
        for (String arg : args) System.out.println(Posizione.parsePosizione(arg));
    }
}
