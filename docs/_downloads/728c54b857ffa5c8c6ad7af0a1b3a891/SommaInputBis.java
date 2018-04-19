import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SommaInputBis {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        float somma = 0.0f;
        BufferedReader in = new BufferedReader(new FileReader(path));
        String var = null;
        while ((var = in.readLine()) != null) {
            float v = Float.parseFloat(var);
            somma += v;
        }
        in.close();
        System.out.println(somma);
    }
}
