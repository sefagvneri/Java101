public class App {
    public static void main(String[] args) throws Exception {
        Fighter f1 = new Fighter("Ferguson", 17, 100, 77, 60);
        Fighter f2 = new Fighter("Diaz", 14, 115, 77, 37);

        Match lightweight = new Match(f1, f2, 70, 80);
        lightweight.run();

    }
}
