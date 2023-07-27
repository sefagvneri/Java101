import java.util.Arrays;

public class App {
    static void transpoz(int[][] matris) {
        int row = matris[0].length;
        System.out.println("Transpoz: ");
        for(int i = 0; i<row; i++) {
            for (int j=0; j<matris.length; j++) {
                System.out.print(" " + matris[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        
        int[][] matris = {{1,2,3}, {4,5,6}};
        System.out.println(matris.length);
        for(int i = 0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        transpoz(matris);
    }
}
