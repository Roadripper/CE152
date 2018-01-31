package lab2;
import java.util.Scanner;
@SuppressWarnings("Duplicates")
public class Lab {

    public static void stateofWater() {
        System.out.println("Enter temperature:");
        Scanner input = new Scanner(System.in);
        double temp = input.nextDouble();
        if (temp >= 100)
            System.out.println("The water is gasesous at the given temperature at sea level");
        if (temp < 100)
            if (temp >= 0)
                System.out.println("The water is liquid at the given temperature at sea level");
        else
                System.out.println("The water is solid at the given temperature at sea level");
    }
    public static void TEST() {
        System.out.println("Enter mark:");
        Scanner input = new Scanner(System.in);
        double markAverage = input.nextDouble();
        String degreeClass =
        markAverage >= 70? "1":
        markAverage >= 60? "2.1":
        markAverage >= 50? "2.2":
        markAverage >= 40? "3": "FAIL";
        System.out.println(degreeClass);

    }
    public static void calcInterest() {
        System.out.println("Input balance of savings:");
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        System.out.println("Yearly rate of interest (In percent):");
        double interest = input.nextDouble();
        System.out.println("After how many years:");
        int years = input.nextInt();
        double rate = interest / 100.0+1;
        double c = balance*rate;
        int i = 1;
        while (i < years) {
            c = c*rate;
            i = i + 1;
        }
        if (years == 1)
            System.out.println("The balance after " + years +' '+"year is "+c);
        else
            System.out.println("The balance after " + years +' '+"years is "+c);

    }
    public static void isPalindromeWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.next().toLowerCase();
        int n = word.length();
        String outcome = "";
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                outcome = "not ";
                break;
            }
        }
        System.out.print(word + " is " + outcome + "a palindrome");
    }
    public static void nandTruthTable() {

    }

}
