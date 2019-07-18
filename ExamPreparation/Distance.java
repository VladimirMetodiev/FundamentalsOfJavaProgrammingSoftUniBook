package ExamPreparation;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed = Integer.parseInt(input.nextLine());
        int min1 = Integer.parseInt(input.nextLine());
        int min2 = Integer.parseInt(input.nextLine());
        int min3 = Integer.parseInt(input.nextLine());

        double distance1 = speed * min1 / 60.0;
        double distance2 = speed * 1.1 * min2 / 60.0;
        double distance3 = speed * 1.1 * 0.95 * min3 / 60.0;

        double totalDistance = distance1 + distance2 + distance3;

        System.out.printf("%.2f", totalDistance);
    }
}
