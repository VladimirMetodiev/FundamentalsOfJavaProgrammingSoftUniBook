package SimpleCalculations;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float celsius = Float.parseFloat(input.nextLine());
        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}
