import java.util.Arrays;

public class App {
    //[5, 7, 7, 9, 9, 5, 25, 25, 0, 0, 0, 0]
    static boolean IsbirDefaYaz(int[] list,int deger){
        for(int i : list){
           if(i==deger){
               return true;
           }
        }
        return false;
    }
    static void tekrarEden(int[] list){
        // int[] list1 = {5,20,7,7,9,12,9,5,25,78,36,25,20,12};
        // int[] list1 = {-,20,7,7,9,12,9,5,25,78,36,25};

        int[] yenilist =new int[list.length];
        int basla = 0;
        for (int i=0 ; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if( (i != j) && (list[i] == list[j]) && (list[j]%2==0)){     // 0. elemanla 0. olmayan tüm elemanları karşılaştır. 0. elemanın değeriyle aynı olan elemanları bul.
                    if (!IsbirDefaYaz(yenilist,list[j])){   // basla. elemanla j. eleman eşitse işlemi yap.
                        yenilist[basla++]=list[j];
                    }
                }
            }
        }
        //System.out.print(Arrays.toString(yenilist));
        System.out.print("Tekrar eden sayılar ; \n ");
        for(int deger: yenilist){
            if(deger!=0 ){
                System.out.print(deger+" , ");
            }
        }
    }

    public static void main(String[] args) {

        int[] list1 = {5,20,7,7,9,12,9,5,25,78,36,25,20,12};
        tekrarEden(list1);


    }
}