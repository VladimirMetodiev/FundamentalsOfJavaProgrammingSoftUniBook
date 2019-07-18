package SimpleCalculations;

import java.util.Scanner;

public class TrapeziumArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = Float.parseFloat(input.nextLine());
        float b = Float.parseFloat(input.nextLine());
        float h = Float.parseFloat(input.nextLine());

        double area = (a + b) * h / 2.0;
        System.out.println(area);
    }
}
