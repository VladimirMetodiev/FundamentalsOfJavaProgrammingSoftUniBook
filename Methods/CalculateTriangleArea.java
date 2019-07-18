package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    static double getAreaOfTriangle(double a, double h){
        return a * h / 2.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.#########");

        double a = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());
        double area = getAreaOfTriangle(a, h);

        System.out.println(df.format(area));
    }
}
