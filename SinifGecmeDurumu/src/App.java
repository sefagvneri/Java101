import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int turkish, math, phy, chem, mus,i=0, les=5;
        double avrg;

        System.out.println("Turkish grade? ");
        turkish = sc.nextInt();
        i = (turkish < 0 || turkish > 100) ? i=i+1: i;
        turkish = (turkish < 0 || turkish > 100) ? 0: turkish;
        

        System.out.println("Math grade? ");
        math = sc.nextInt();
        i = (math < 0 || math > 100) ? i=i+1: i;
        math = (math < 0 || math > 100) ? 0: math;
        

        System.out.println("Physic grade? ");
        phy = sc.nextInt();
        i = (phy < 0 || phy > 100) ? i=i+1: i;
        phy = (phy < 0 || phy > 100) ? 0: phy;
        

        System.out.println("Chemistry grade? ");
        chem = sc.nextInt();
        i = (chem < 0 || chem > 100) ? i=i+1: i;
        chem = (chem < 0 || chem > 100) ? 0: chem;
        

        System.out.println("Music grade? ");
        mus = sc.nextInt();
        i = (mus < 0 || mus > 100) ? i=i+1: i;
        mus = (mus < 0 || mus > 100) ? 0: mus;
        
        System.out.println(i);
        if(i<=0){
            avrg = (turkish + math + phy + chem + mus) / les;

             if(avrg>=55) {
            System.out.println("Congratulations, you graduated.");
       }
            else {
            System.out.println("You did not graduate.");
       }
        }
        else {
            les = les - i;
            avrg = (turkish + math + phy + chem + mus) / les;
             if(avrg>=55) {
            System.out.println("Congratulations, you graduated.");
       }
            else {
            System.out.println("You did not graduate.Average of values between 0 and 100 : " + avrg);
            
       }
        }
        

       
    }
}
