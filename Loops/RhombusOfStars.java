package Loops;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int rowUp = 1; rowUp <= num; rowUp++) {
            for (int space = num - rowUp; space > 0 ; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column <= rowUp; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int rowDown = 1; rowDown <= num - 1; rowDown++) {
            for (int space = 0; space < rowDown; space++) {
                System.out.print(" ");
            }
            for (int column = num - rowDown; column > 0; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
