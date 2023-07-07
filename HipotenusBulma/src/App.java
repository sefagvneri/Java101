import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int a, b;
        double c, u, alan;
        

        Scanner input = new Scanner(System.in);

        System.out.println("1.kenarı giriniz: ");
        a = input.nextInt();

        System.out.println("2.kenarı giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + c);

        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Alan: " + alan);

    }
}
