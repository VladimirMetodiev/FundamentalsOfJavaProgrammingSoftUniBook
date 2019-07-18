package SimpleCalculations;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float r = Float.parseFloat(input.nextLine());

        double area = Math.PI * Math.pow(r, 2);
        double perimeter = 2 * Math.PI * r;

        System.out.printf("%f%n%f", area, perimeter);
    }
}
