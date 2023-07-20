import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        us();
    }

    static int us() {
        Scanner sc = new Scanner(System.in);
        int a, b, total = 1;
        System.out.println("Enter the base value: ");
        a = sc.nextInt();
        System.out.println("Enter the exponent");
        b = sc.nextInt();

        for(int i = 0; i<b; i++) {
            total *= a;
        }
        System.out.println("Result : " + total );
        us();
        return total;

    }
}
