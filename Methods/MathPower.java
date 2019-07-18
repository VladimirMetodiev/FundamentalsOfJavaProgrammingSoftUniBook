package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    static double calculatePower(double a, double p){
        return Math.pow(a, p);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.#########");

        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double result = calculatePower(a, b);

        System.out.println(df.format(result));
    }
}

