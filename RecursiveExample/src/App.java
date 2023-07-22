

import java.util.Scanner;

public class App {
    static void f(int x, int counter, boolean isContinue) {
        if (x <= 0) {
            isContinue = false;
        }
        System.out.println(x + " ");
        if (isContinue == true) {
            f(x - 5, counter + 1, isContinue);
        } else {
            if (counter == 0) {
                return;
            } else {
                f(x + 5, counter - 1, isContinue);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = inp.nextInt();

        f(n, 0, true);
    }
}