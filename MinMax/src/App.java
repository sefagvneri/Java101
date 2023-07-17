import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int n, gs, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        System.out.println("How many numbers will you enter? ");
        n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i + ". number: ");
            gs = sc.nextInt();
            if(n==1){
                min = gs;
                max = gs;
            }
            else {
                if(max < gs){
                    max = gs;
                }
                 if(min>gs){
                    min = gs;
                }
            }
        }
            System.out.println("Max number: " + max);
            System.out.println("Min number: " + min);
    }
}
