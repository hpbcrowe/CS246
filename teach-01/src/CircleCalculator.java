import java.util.Scanner;

public class CircleCalculator {
    private static final Scanner _scanner = new Scanner( System.in );

    public double getRadius(){
        System.out.print("Please enter the radius:");
        double radius = _scanner.nextDouble();
     return radius;
    }

    public void displayCircumference(double radius){
         double circumference = Math.PI * radius * 2;
        System.out.format("\tCircumference: %.2f\n", circumference);
    }

    public void displayArea(double radius){
        double area = Math.PI * radius * radius;

        System.out.format("\tArea: %.2f\n", area);
    }

    public static void main(){
        CircleCalculator calculator = new CircleCalculator();
        double rad = calculator.getRadius();
        calculator.displayArea(rad);
        calculator.displayCircumference(rad);

    }

}
