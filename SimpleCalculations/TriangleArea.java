package SimpleCalculations;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = Float.parseFloat(input.nextLine());
        float h = Float.parseFloat(input.nextLine());

        double area = a * h / 2.0;

        System.out.printf("%.2f", area);
    }
}
