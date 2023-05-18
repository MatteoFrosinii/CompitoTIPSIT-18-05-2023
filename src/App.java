public class App {
    public static void main(String[] args) throws Exception {
        Pista p = new Pista();
        for (int i = 0; i < 8; i++) {
            Amico a = new Amico(Integer.toString(i), p);
            a.start();
        }
    }
}
