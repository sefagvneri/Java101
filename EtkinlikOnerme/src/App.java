import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);

        int degree;
        System.out.println("Please enter the air temparature: ");
        degree = sc.nextInt();
        if(degree>5) {
            if (degree<25 && degree > 5) {
                if (degree >= 5 && degree < 15){
                    System.out.println("You can go to cinema.");
                }
                else if (degree >= 15 && degree < 25 ) {
                    System.out.println("You can go on a picnic.");
                }
             }       
                if (degree > 25){
                    System.out.println("You can go swimming.");
                }
            
        }
        else {
            System.out.println("You can go skiing.");
        }
    }
}
