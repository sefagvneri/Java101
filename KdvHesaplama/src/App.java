import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double tutar, kdvOran = 0.18;
        Scanner sc = new Scanner(System.in);
        tutar = sc.nextDouble();

        double kdvTutar = tutar*kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println(kdvliTutar);


    }
}
