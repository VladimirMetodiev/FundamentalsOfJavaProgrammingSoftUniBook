package Loops;

import java.util.Scanner;

public class Axe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int upRows = 0; upRows < num; upRows++) {
            for (int airLeft = 1; airLeft <= 3 * num; airLeft++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int body = 1; body <= upRows; body++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int airRight = 2 * num - 2 - upRows; airRight >= 1; airRight--) {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int rows = 0; rows < num / 2; rows++) {
            for (int handle = 1; handle <= 3 * num; handle++) {
                System.out.print("*");
            }
            System.out.print("*");
            for (int body = 1; body <= num - 1; body++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int right = 1; right <= num - 1; right++) {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int downRows = 0; downRows < num / 2 - 1; downRows++) {
            for (int airDown = 3 * num - downRows; airDown >= 1; airDown--) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int body = 1; body <= num - 1 + 2 * downRows; body++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int right = num - 1 - downRows; right >= 1; right--) {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int leftBottom = 1; leftBottom < 3 * num - num / 2 + 2; leftBottom++) {
            System.out.print("-");
        }
        for (int middleBottom = 1; middleBottom <= num + 1 + (num / 2 - 1) * 2; middleBottom++) {
            System.out.print("*");
        }
        for (int rightBottom = 1; rightBottom < 5 * num - (3 * num - num / 2) - (num + 1 + (num / 2 - 1) * 2); rightBottom++) {
            System.out.print("-");
        }
    }
}


