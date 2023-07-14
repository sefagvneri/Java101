import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int tempNumber;
        int basValue;
        int result = 0;
        int basPow;
        
        for(int i = 100; i<=999; i++){
            tempNumber = i;
            result = 0;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                
                basPow = 1;
                for (int j = 1; j <= 3; j++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
                
            }
            
            if(result==i){
                System.out.println(i);
            }
           
        }
      

    }
}
