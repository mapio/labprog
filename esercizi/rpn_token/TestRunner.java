import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            Token t = new Token(s.next());
            System.out.println((t.isNumber() ? "V " : "O ") + t);
        }
    }
}
