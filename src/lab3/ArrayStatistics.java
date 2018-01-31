package lab3;
import java.util.Scanner;
public class ArrayStatistics {
    public static double sum(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i];
        return sum;
    }
    public static double mean(double[] x) {
        double mean = sum(x) / x.length;
        return mean;
    }
    public static double min(double[] x) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < x.length; i++)
            if (x[i] < min) min = x[i];
        return min;
    }
    public static double max(double[] x) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < x.length; i++)
            if (x[i] > max) max = x[i];
        return max;

    }
}
