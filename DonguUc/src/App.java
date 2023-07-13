import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        int n;

        System.out.println("Enter the limit number : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i*=4) {
            System.out.println("Pow's of 4 : " + i + " ");
        }

        for (int i = 1; i <= n; i*=5) {
            System.out.println("Pow's of 5 : " + i + " ");
        }
    }
}
