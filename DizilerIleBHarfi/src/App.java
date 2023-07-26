public class App {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0  || j == 0 ) {
                    letter[i][j] = " * ";
                }
                else if(i == 6) {
                    letter[i][j] = " * ";
                }
                 else if ((i == 1 && j == 4) || (i == 2 && j == 3) || (i == 3 && j==2) || (i == 4 && j==3) || (i == 5 && j==4)) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = " ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}