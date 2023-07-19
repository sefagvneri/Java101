import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();

        System.out.println(isPolindrom(value));

    }

    static boolean isPolindrom(int value){

        int temp = value, reverseNumber = 0, lastNumber;
        
        while (temp!=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }

        if(value == reverseNumber){
            return true;
        }
        else {
            return false;
        }

    }
}
