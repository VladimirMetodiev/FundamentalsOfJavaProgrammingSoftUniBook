package ExamPreparation;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x1 = Integer.parseInt(input.nextLine());
        int y1 = Integer.parseInt(input.nextLine());
        int x2 = Integer.parseInt(input.nextLine());
        int y2 = Integer.parseInt(input.nextLine());
        int x3 = Integer.parseInt(input.nextLine());
        int y3 = Integer.parseInt(input.nextLine());

        int h = Math.abs(y1 - y2);
        int a = Math.abs(x2 - x3);

        double area = h * a / 2.0;

        System.out.println(area);
    }
}
