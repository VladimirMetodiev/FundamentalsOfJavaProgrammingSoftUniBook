package SimpleCalculations;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        double area = a * b;

        System.out.println(area);
    }
}
