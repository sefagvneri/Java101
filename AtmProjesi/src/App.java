import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String userName, password;
        int balance = 3000;
        int right = 3;
        int select;
        Scanner sc = new Scanner(System.in);
        

       while(right > 0){
            System.out.println("Username: ");
            userName = sc.nextLine();
            System.out.println("Password: ");
            password = sc.nextLine();

            if(userName.equals("sefagvneri") && password.equals("123")){
                System.out.println("Hello, welcome to the XX Bank.");
                do{
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Balance\n" +
                            "4-Exit");
                    
                    System.out.println("Select the action: ");
                    select = sc.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Amount of money: ");
                            int price = sc.nextInt();
                            balance+=price;

                            break;
                        case 2:
                            System.out.println("The amount of money you want to withdraw: ");
                            int price1 = sc.nextInt();
                             if(price1 > balance){
                                System.out.println("Unsuccessful transaction because the money you want to withdraw is higher than the money in your balance:");
                            }
                            else {
                            balance-=price1;
                            }
                        case 3: 
                            System.out.println("Your balance " + balance);
                            break;
                    }
                }while(select!=4);

                System.out.println("See you again: ");
                break;
            }
            else {
                right--;
                System.out.println("Wrong username or wrong password. Try again. ");
                if(right==0){
                    System.out.println("Your account is blocked. ");
                }
                else {
                    System.out.println("Your remaining right: " + right);
                }
            }
       }
    
    }
}
