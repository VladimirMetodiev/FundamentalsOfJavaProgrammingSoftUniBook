package ExamPreparation;

import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int w = Integer.parseInt(input.nextLine());
        int m = Integer.parseInt(input.nextLine());

        double minimumCourses = Math.ceil(x / (w * m * 1.0));
        System.out.printf("%.0f", minimumCourses);
    }
}
