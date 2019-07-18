package ExamPreparation;

import java.util.Scanner;

public class PointOnSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = Integer.parseInt(input.nextLine());
        int second = Integer.parseInt(input.nextLine());
        int point = Integer.parseInt(input.nextLine());

        if (point >= Math.min(first, second) && point <= Math.max(first, second)) {
            System.out.println("in");
            System.out.println(Math.min(Math.abs(first - point), Math.abs(second - point)));
        }
        else{
            System.out.println("out");
            System.out.println(Math.min(Math.abs(first - point), Math.abs(second - point)));
        }
    }
}
