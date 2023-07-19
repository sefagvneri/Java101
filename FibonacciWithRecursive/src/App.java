import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int value = sc.nextInt();

        System.out.println(fibonacci(value));
    }

    static int fibonacci(int value) {
        
        if (value == 1 || value == 2) {
            return 1;
            
        }

        return value = fibonacci(value-1) + fibonacci(value-2);

    }
}
