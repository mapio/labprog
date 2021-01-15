import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            Pacchetto p = Pacchetto.parsePacchetto(s.nextLine());
            System.out.println(p);
        }
    }
}
