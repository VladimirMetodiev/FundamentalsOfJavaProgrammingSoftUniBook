package SimpleCalculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TwoDRectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.#########");

        float x1 = Float.parseFloat(input.nextLine());
        float y1 = Float.parseFloat(input.nextLine());
        float x2 = Float.parseFloat(input.nextLine());
        float y2 = Float.parseFloat(input.nextLine());

        double area = Math.abs(x1 - x2) * Math.abs(y1 - y2);
        double perimeter = 2 * Math.abs(x1 - x2) + 2 * Math.abs(y1 - y2);

        System.out.println(df.format(area));
        System.out.println(df.format(perimeter));
    }
}
