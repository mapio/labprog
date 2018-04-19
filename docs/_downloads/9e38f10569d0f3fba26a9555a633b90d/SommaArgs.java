public class SommaArgs {
    public static void main(String[] args) {
        int somma = 0;
        for (String arg : args)
            somma += Integer.parseInt(arg);
        System.out.println(somma);
    }
}
