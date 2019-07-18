package Loops;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        System.out.print("+");
        for (int up = 0; up < number - 2; up++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        for (int row = 0; row < number - 2; row++) {
            System.out.print("|");
            for (int column = 0; column < number - 2; column++) {
                System.out.print(" -");
            }
            System.out.print(" |");
            System.out.println();
        }

        System.out.print("+");
        for (int down = 0; down < number - 2; down++) {
            System.out.print(" -");
        }
        System.out.print(" +");
    }
}
