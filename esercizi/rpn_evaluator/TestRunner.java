import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            Evaluator e = new Evaluator(s.nextLine());
            System.out.println(e.eval());
        }
    }
}
