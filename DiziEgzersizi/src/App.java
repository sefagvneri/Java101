import java.util.Arrays;
import java.util.Scanner;
public class App {
    static void degereYakinKucukBuyuk(int[] liste){
        Scanner deger =new Scanner(System.in);
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        System.out.print("Sayı = ");
        int sayi = deger.nextInt();
        int min = liste[0];
        int max = liste[0];
        int index;

        for(int i:liste) {
            if (sayi < i) {
                max = i;
                System.out.println("En yakın max değer \t= " + max);
                //System.out.println(Arrays.binarySearch(liste,max));
                index = Arrays.binarySearch(liste,max)-1;
                if (sayi!= liste[index]) {
                    // System.out.println(index);
                    System.out.println("En yakın min değer \t= " + liste[index]);
                }else{
                    System.out.println("En yakın min değer \t= " + liste[index-1]);
                }
                break;
            }
        }
    }
    public static void main(String[] args) {

        int[] liste = {15,12,788,1,-1,-778,2,0};
        degereYakinKucukBuyuk(liste);

        System.out.println("----------------");

        int[] liste2 = {10,-1,8,-22,-70,54,77,-100,0};
        degereYakinKucukBuyuk(liste2);

    }
}