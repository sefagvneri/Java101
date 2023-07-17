import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        n = sc.nextInt();

        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < (n*2 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
                System.out.println(" ");
        }
    }
    

}
