import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int k,i, total=0;

        System.out.println("Enter a number: ");
        k = sc.nextInt();

        for (i=0; i<=k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                
            }
        }
        System.out.println("Total : " + total);
    }
}
