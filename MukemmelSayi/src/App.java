import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int val, tot=0;
        System.out.println("Enter the value: ");
        val = sc.nextInt();

        for(int i = 1; i<= val; i++){
            if(val%i == 0) {
                tot+=i;
            }
            
        }
        if(tot==val*2){
                System.out.println(val + " is a perfect number.");
            }
            else {
                System.out.println(val + " is not a perfect number. ");
            }
    }
}
