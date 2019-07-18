package SimpleCalculations;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float radian = Float.parseFloat(input.nextLine());
        double degree = radian * 360 / (2 * Math.PI);

        System.out.println(Math.round(degree));
    }
}
