import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1;

        System.out.println("Enter the value: ");
        int val = sc.nextInt();
        System.out.println(n1 + " \n" + n2);
        for (int i=1; i<val; i++){
            int n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2=n3;
        }
    }
}
