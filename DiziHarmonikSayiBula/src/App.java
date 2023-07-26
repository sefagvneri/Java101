public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0, avg;
        for (int i = 0; i < numbers.length; i++) {
            sum +=  (1/numbers[i]);
        }
        avg = numbers.length / sum;
        System.out.println(avg);
    }
}
