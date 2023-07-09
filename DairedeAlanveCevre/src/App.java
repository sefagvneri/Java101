import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        r=input.nextInt();
        System.out.println("Dairenin merkez açısının ölçüsünü giriniz: ");
        a=input.nextInt();

        double daireDilimiAlan = (pi * (r * r) * a) / 360;
        

        System.out.println("Dairenin alanı: " + daireDilimiAlan);
        
    }
}
