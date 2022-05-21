package pl.coderslab.debug;

public class Main05 {

   public static void main(String[] args) {
        double avg = calculateAvg(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97});
        System.out.println("AVG " + avg);
    }

    private static double calculateAvg(int[] input) {
        double result = 0;
        for (int element : input) {
            result += element;
        }
        return result;
    }
}
