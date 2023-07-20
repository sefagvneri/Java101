import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        asal();
    }

    static int asal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
        int count = 0;

        for(int i = 1; i<=value; i++){
            if(value % i == 0){
                count++;                
            }     
        }
            if(count > 2){
                    System.out.println(value + " is not prime number");
            }
            else {
                    System.out.println(value + " is prime number.");
            }
            asal();
            return 1;
    }
}
