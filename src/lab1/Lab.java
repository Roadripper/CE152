package lab1;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class Lab {

    public static void calcInterest() {
        System.out.println("Input balance of savings:");
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        System.out.println("Yearly rate of interest (In percent):");
        double interest = input.nextDouble();
        double rate = interest / 100.0+1;
        double c = balance*rate;
        System.out.println("Balance after 1 year:" +c);
        c = c*rate;
        System.out.println("Balance after 2 years:" +c);
        c = c*rate;
        System.out.println("Balance after 3 years:" +c);

    }
    public static void calcMeans() {
        System.out.println("Input first value:");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println("Input second value:");
        double b = input.nextDouble();
        double c = (a+b)/2;
        double d = Math.sqrt(a*b);
        double e = 2/((1/a)+(1/b));
        System.out.println("Mean:" +c);
        System.out.println("Geometric Mean:" +d);
        System.out.println("Harmonic Mean:" +e);

    }
    public static void greetName() {
        System.out.println("Enter first name:");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s = s.trim();
        System.out.println("Enter second name:");
        String t = input.next();
        t = t.trim();
        System.out.println("Hello " + s +' '+ t);

    }
    public static void escapeSeq() {
        System.out.println("\"Hello,\n World\"");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println("\t\\t|t//t/");
        String t = input.next();
        System.out.println("#\'a\\ab\\b'^");
        String r = input.next();
        System.out.println(s);
        System.out.println(t);
        System.out.println(r);

    }
    public static void ageDifference() {
        System.out.println("Enter age in years of person 1:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter remaining months of person 1:");
        int y = input.nextInt();
        System.out.println("Enter age in years of person 2:");
        int a = input.nextInt();
        System.out.println("Enter remaining months of person 2:");
        int b = input.nextInt();
        int c = Math.abs(x - a);
        int d = Math.abs(y-b);
        System.out.println("The age difference is " + c +' '+ "years and " + d +' '+ "months.");
    }
    public static void nextCharacters() {
        System.out.println("Enter a character:");
        Scanner input = new Scanner(System.in);
        char x = input.next().charAt(0);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);

    }
    public static void triangleArea() {
        System.out.println("Input first coordinate in the form 'x,y':");
        Scanner input = new Scanner(System.in);
        char x = input.next().charAt(0);
        char y = input.next().charAt(2);
        System.out.println(x +' '+ y);

    }
}