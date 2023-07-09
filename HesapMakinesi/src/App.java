import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int n1,n2,select;

        System.out.println("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        n2 = sc.nextInt();

        System.out.println("1: Addition \n2: Subtraction \n3: Multiplication\n4: Division");
        select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println(n1+n2);
                
                break;
            
            case 2:
                System.out.println(n1-n2);

                break;
            
            case 3:
                System.out.println(n1*n2);

                break;
            case 4:
                if(n2!=0){
                    System.out.println(n1/n2);
                }
                else if(n2==0){
                    System.out.println("Bir sayı 0'a bölünemez.");
                }

                break;
                
            default:
                break;
        }
        
    }
}
