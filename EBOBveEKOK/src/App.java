import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        int ebob = 1;
        int ekok;
        System.out.println("Enter the n1: ");
        n1 = sc.nextInt();
        System.out.println("Enter the n2: ");
        n2 = sc.nextInt();
        int i = n1;

        while(i>=1){
            
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println("EBOB of n1 and n2 : " + i);
                ekok = (n1*n2)/ebob;
                System.out.println("EKOK of n1 and n2 : " + ekok);
                break;
            }
            i--;
        }
    }
}
