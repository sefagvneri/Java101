import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int km;
        double perkm = 2.20, ucret;
        int acilisUcreti = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç KM Yol gideceksiniz? ");
        km = input.nextInt();
        ucret = (km * perkm) + acilisUcreti;

        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("Ucretiniz: " + ucret + "TL");


    }
}
