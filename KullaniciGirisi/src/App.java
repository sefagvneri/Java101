import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);

        String id,password,pass2,choose;
        int numb;

        System.out.print("Enter your ID: ");
        id = sc.nextLine();

        System.out.print("Enter your Password: ");
        password = sc.nextLine();

        if(id.equals("sefagvneri") && password.equals("123")){
            System.out.println("Successfully logged in");
        }
        else {
            System.out.println("Your password is incorrect, if you reset your password please write 'Yes' ");
            choose = sc.nextLine();
            if(choose.equals("Yes")) {
                System.out.print("Please enter your new password: ");
                pass2 = sc.nextLine();

                if(pass2.equals(password)){
                    System.out.println("Your password could not be created, please enter another password:");
                }
                else {
                    System.out.println(" Your password has been successfully reset.");
                            
                }

            }
        }


    }
}
