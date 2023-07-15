import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i = 1; i<=n-1; i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
             for (int k = (n-i)*2-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
