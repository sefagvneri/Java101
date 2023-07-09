import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        double height;
        int weight;
        double index;
        
        System.out.println("Please enter your height in meters ");
        height = input.nextDouble();
        System.out.println("Please enter your weight: ");
        weight = input.nextInt();

        index = weight / (height * height);

        System.out.println("Your body mass index: " + index);

    }
}
