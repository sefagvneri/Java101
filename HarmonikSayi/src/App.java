import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int val;
        double result = 0.0;

        System.out.println("Enter the value: ");
        val = sc.nextInt();

        for (int i=1; i<=val; i++){
            result += (1.0/i);
        }

        System.out.println( "Harmonic series of the number " + val + " : " + result);
    }
}
