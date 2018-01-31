package lab2;
import java.util.Scanner;
public class Statistics {
    public static void main(String[] args) { stdinStats(); }

    public static void stdinStats() {
        System.out.println("Enter length of sequence:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter number of values:");
        if (x < 1) {
            System.out.println("Invalid number of numbers");
            return;
        }
        double sum = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < x; i++) {
            System.out.println("Please enter a number:");
            double y = input.nextDouble();
            if (y < min)
                min = y;
            if (y > max)
                max = y;
            sum += y;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / x);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
