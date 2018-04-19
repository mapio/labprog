import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SommaInput {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        float somma = 0.0f;
        Scanner in = new Scanner(new FileInputStream(path));
        while (in.hasNextFloat()) {
            float var = in.nextFloat();
            somma += var;
        }
        in.close();
        System.out.println(somma);
    }
}
