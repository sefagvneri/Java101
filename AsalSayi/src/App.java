import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        for(int i = 2; i<100; i++){
            int sayi = 0;
            for(int j = 2; j<=i/2; j++){
                if(i%j==0){
                    sayi=1;
                }
            }

            if(sayi == 0){
                System.out.println(i);
            }
        }
    }
}
