import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Tokenizer t = new Tokenizer(s.nextLine());
        while (t.hasNextToken()) System.out.println(t.nextToken());
    }
}
