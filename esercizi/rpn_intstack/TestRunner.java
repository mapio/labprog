import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        IntStack v = new IntStack();
        while (s.hasNextInt()) v.push(s.nextInt());
        while (!v.isEmpty()) System.out.println(v.pop());
    }
}
