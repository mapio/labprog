import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeraLinee {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String var = null;
        while ((var = in.readLine()) != null) {
            System.out.println(n + "\t" + var);
            n += 1;
        }
        in.close();
    }
}
