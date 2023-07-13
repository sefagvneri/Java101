import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int i, total=0;
        boolean isEven = true;  

        while(isEven) {
            System.out.println("Enter a number: ");
            i = sc.nextInt();
            if ( i % 2 == 1) {
                isEven = false;
            }
            if (i % 2 == 0 && i % 4 == 0) {
                total+=i;
            }
        }
            System.out.println("Total : " + total);
    }

}