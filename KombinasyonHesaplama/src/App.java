import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n, r, comb,total=1, total1=1,total2=1;

        System.out.println("Enter N and K numbers: ");
        n = sc.nextInt();
        r = sc.nextInt();

        for (int i = 1; i<=n; i++)
        {
            total *= i;
        }

        for(int i = 1; i<=r; i++)
        {
            total1 *= i;
        }

        for(int i = 1; i<=(n-r); i++)
        {
            total2 *= i;
        }

        System.out.println("C(n,r) equals:  " + total / (total1 * total2) );
    }
}
