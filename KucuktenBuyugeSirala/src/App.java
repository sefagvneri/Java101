import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter the number A: ");
        a = sc.nextInt();

        System.out.println("Enter the number B: ");
        b = sc.nextInt();

        System.out.println("Enter the number C: ");
        c = sc.nextInt();

        if(a<b && a<c) {
            if (b<c){
                System.out.println("A < B < C");
            }
            else {
                System.out.println("A < C < B");
            }
        }

        else if (b<a && b<c) {
            if(a<c) {
                System.out.println("B < A < C");
            }
            else {
                System.out.println("B < C < A");
            }
       }

       else {
            if(a<b) {
                System.out.println("C < A < B");
            }
            else {
                System.out.println("C < B < A");
            }
       } 


    }
}
