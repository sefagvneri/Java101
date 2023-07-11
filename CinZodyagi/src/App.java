import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Enter your year of birth: ");
        year = sc.nextInt();

        year = year % 12;

        switch (year) {
            case 0:
                System.out.println("Your chinese zodiac sign: Monkey.");
                break;
            
            case 1:
                System.out.println("Your chinese zodiac sign: Rooster.");
                break;

            case 2:
                System.out.println("Your chinese zodiac sign: Dog.");
                break;

            case 3:
                System.out.println("Your chinese zodiac sign: Pig.");
                break;

            case 4:
                System.out.println("Your chinese zodiac sign: Mouse.");
                break;

            case 5:
                System.out.println("Your chinese zodiac sign: Ox.");
                break;

            case 6:
                System.out.println("Your chinese zodiac sign: Tiger.");
                break;

            case 7:
                System.out.println("Your chinese zodiac sign: Rabbit.");
                break;
        
            case 8:
                System.out.println("Your chinese zodiac sign: Dragon.");
                break;

            case 9:
                System.out.println("Your chinese zodiac sign: Snake.");
                break;
                
            case 10:
                System.out.println("Your chinese zodiac sign: Horse.");
                break;

            case 11:
                System.out.println("Your chinese zodiac sign: Sheep.");
                break;
        }
        
    }
}
