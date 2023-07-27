import java.util.Arrays;
import java.util.Scanner;

public class App {

    static void DiziElemanlari(int n) {
        Scanner sc = new Scanner(System.in);
        int value;
        int[] list = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println(i+1 + ".element: ");
            value = sc.nextInt();
            list[i] = value;
        }
        Arrays.sort(list);
        System.out.print("Arrangement: ");
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int n = sc.nextInt();
        DiziElemanlari(n);

    }
}
