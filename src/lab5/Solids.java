package lab5;

public class Solids {

         public static void main (String[] args) {
            System.out.println(Solids.volumeSphere(radius));
            System.out.println(Solids.surfaceSphere(radius));
            System.out.println(Solids.volumeCylinder(radius, height));
            System.out.println(Solids.surfaceCylinder(radius, height));
            System.out.println(Solids.volumeCone(radius, height));
            System.out.println(Solids.surfaceCone(radius,height));
        }


    public static final double radius = 5;
    public static final double height = 10;
    public static double volumeSphere(double radius) {
        double vol = (4/3)*Math.PI*Math.pow(radius,3);
        return vol;
    }
    public static double surfaceSphere(double radius) {
        double surf = 4*Math.PI*Math.pow(radius,2);
        return surf;
    }
    public static double volumeCylinder(double radius, double height) {
        double volcyl = Math.PI*Math.pow(radius,2)*height;
        return volcyl;
    }
    public static double surfaceCylinder(double radius, double height) {
        double surfcyl = 2*Math.PI*height*(radius + height);
        return surfcyl;
    }
    public static double volumeCone(double radius, double height) {
        double volcone = (1/3)*Math.PI*Math.pow(radius,2)*height;
        return volcone;
    }
    public static double surfaceCone(double radius, double height) {
        double surfcone = Math.PI*radius*(radius + Math.sqrt(Math.pow(radius,2)+Math.pow(height,2)));
        return surfcone;
    }
}



