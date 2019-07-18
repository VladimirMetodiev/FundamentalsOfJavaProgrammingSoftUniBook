package Loops;

import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int topLeft = 1; topLeft <= num / 2; topLeft++) {
            System.out.print(".");
        }
        for (int topMiddle = 1; topMiddle <= num; topMiddle++) {
            System.out.print("#");
        }
        for (int topRight = 1; topRight <= num / 2; topRight++) {
            System.out.print(".");
        }
        System.out.println();

        for (int bodyRows = 1; bodyRows <= num - 2; bodyRows++) {
            for (int outsideLeft = 1; outsideLeft <= num / 2; outsideLeft++) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int topMiddle = 1; topMiddle <= num - 2; topMiddle++) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int outsideRight = 1; outsideRight <= num / 2; outsideRight++) {
                System.out.print(".");
            }
            System.out.println();
        }

        for (int middleLeftRow = 1; middleLeftRow <= num / 2 + 1; middleLeftRow++) {
            System.out.print("#");
        }
        for (int middleMiddleRow = 1; middleMiddleRow < 2 * num - num - 1; middleMiddleRow++) {
            System.out.print(".");
        }
        for (int middleRightRow = 1; middleRightRow <= num / 2 + 1; middleRightRow++) {
            System.out.print("#");
        }
        System.out.println();

        for (int edgeRows = 1; edgeRows <= num - 2; edgeRows++) {
            for (int outsideLeft = 1; outsideLeft <= edgeRows; outsideLeft++) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int middle = 2 * num - 3 - 2 * edgeRows; middle >= 1; middle--) {
                System.out.print(".");
            }
            System.out.print("#");
            for (int outsideRight = 1; outsideRight <= edgeRows; outsideRight++) {
                System.out.print(".");
            }
            System.out.println();
        }

        for (int bottomLeft = 1; bottomLeft <= num - 1; bottomLeft++) {
            System.out.print(".");
        }
        System.out.print("#");
        for (int bottomRight = 1; bottomRight <= num - 1; bottomRight++) {
            System.out.print(".");
        }
    }
}
