import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        boolean isError = false;
        

        int month, day;

        System.out.println("Which month were you born in?");
        month = sc.nextInt();

        System.out.println("Which day were you born in?");
        day = sc.nextInt();

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            isError=true;
        }
        if(isError==false) {
        
            if ((month == 1 && day < 22) || (month == 12 && day > 21)) {
                System.out.println("You are a capricorn.");
            }

            else if((month == 1 && day > 21) || (month == 2 && day < 22)){
                System.out.println("You are an aquarius.");
            }

            else if((month == 2 && day > 20) || (month == 3 && day < 21)){
                System.out.println("You are a pisces.");
            }

            else if((month == 3 && day > 20) || (month == 4 && day < 21)){
                System.out.println("You are an aries.");
            }

            else if((month == 4 && day > 20) || (month == 5 && day < 21)){
                System.out.println("You are a taurus.");
            }

            else if((month == 4 && day > 20) || (month == 5 && day < 21)){
                System.out.println("You are a taurus.");
            }

            else if((month == 5 && day > 20) || (month == 6 && day < 22)){
                System.out.println("You are a gemini.");
            }

            else if ((month == 6 && day > 21) || (month == 7 && day < 23)) {
                System.out.println("You are a capricorn.");
            }

            else if ((month == 7 && day > 22) || (month == 8 && day < 24)) {
                System.out.println("You are a lion.");
            }

            else if ((month == 8 && day > 23) || (month == 9 && day < 24)) {
                System.out.println("You are a virgo.");
            }

            else if ((month == 9 && day > 23) || (month == 10 && day < 24)) {
                System.out.println("You are a libra.");
            }

            else if ((month == 10 && day > 23) || (month == 11 && day < 23)) {
                System.out.println("You are a scorpio.");
            }

            else if ((month == 11 && day > 22) || (month == 12 && day < 22)) {
                System.out.println("You are a sagittarius.");
            }

        
        }
        else {
            System.out.println("Invalid month or day.");
        }
    }
}
