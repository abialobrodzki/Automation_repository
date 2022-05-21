package pl.coderslab.debug;

public class Main04 {


    public static void main(String[] args) {
        double sum = calculateSum(new String[]{"0", "1", "1", "2", "3", "5", "8"});
        System.out.println("Sum " + sum);
    }

    private static double calculateSum(String[] input) {
        double result = 0;
        for (int i = 1; i < input.length; i++) {
            result = Integer.parseInt(input[i]);
        }
        return result;
    }
}
