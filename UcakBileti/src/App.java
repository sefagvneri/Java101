import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        
        float price = 0.10f, aDiscount,aPrice;
        int km,age,type; 

        System.out.println("Enter the distance in KM:");
        km = sc.nextInt();

        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Enter the trip type (1 => One Direction, 2=> Round Trip). ");
        type = sc.nextInt();

        price *= km;

        if(km > 0 && age > 0 && (type == 1 || type == 2)){
            switch (type) {
            case 1:
            if(age < 12) {
                aDiscount = price - price*0.50f;
                System.out.println("Total price is = " + aDiscount);
            }
            else if(age >= 12 && age <= 24) {
                aDiscount = price - price*0.10f;
                 System.out.println("Total price is = " + aDiscount);
            }
            else if(age >=65) {
                aDiscount = price - price*0.30f;
                 System.out.println("Total price is = " + aDiscount);
            }
           else {
            System.out.println("Total price is = " + price);
           }
                
                break;
           case 2:
           if(age < 12) {
                aDiscount = price - price*0.50f;
                aPrice = (aDiscount - aDiscount *0.20f)*2;
                System.out.println("Total price is = " + aPrice);
            }
            else if(age >= 12 && age <= 24) {
                aDiscount = price - price*0.10f;
                aPrice = (aDiscount - aDiscount *0.20f) * 2;
                System.out.println("Total price is = " + aPrice);
            }
            else if(age >=65) {
                aDiscount = price - price*0.30f;
                aPrice = (aDiscount - aDiscount*0.20f)*2;
                 System.out.println("Total price is = " + aPrice);
            }
           else {
            aPrice = (price - price*0.20f)*2;
            System.out.println("Total price is = " + aPrice);
           }
            
                break;
        }
            
        }
        else {
            System.out.println("Your informations are invalid. Please check again.");
        }
        
    }
}
