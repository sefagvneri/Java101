import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        double pear = 2.14f, apple = 3.54f, tomato = 1.11f, banana = 0.95f, aubergine = 5f;
        double kg,total = 0;

        System.out.println("How many kilos of apple? ");
        kg = input.nextDouble();
        total = kg*apple;

        System.out.println("How many kilos of pear? ");
        kg = input.nextDouble();
        total += kg*pear;

        System.out.println("How many kilos of tomato? ");
        kg = input.nextDouble();
        total += kg*tomato;

        System.out.println("How many kilos of banana? ");
        kg = input.nextDouble();
        total += kg*banana;

        System.out.println("How many kilos of aubergine? ");
        kg = input.nextDouble();
        total += kg*aubergine;

        System.out.println("Total amount: " + total);

    }
}
