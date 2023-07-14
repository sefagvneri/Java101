import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int i, n, k,total=1;

        System.out.println("Enter the number: ");
        n = sc.nextInt();
        System.out.println("Enter the exponent: ");
        k = sc.nextInt();

        for (i=1; i<=k; i++)
        {
            total*=n;
        }
        System.out.println("n^k equals: " + total);
    }
}
