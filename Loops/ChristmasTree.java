package Loops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int top = 1; top <= num; top++) {
            System.out.print(" ");
        }
        System.out.println(" |");

        for (int row = 1; row <= num; row++) {
            for (int space = num - row; space > 0; space--) {
                System.out.print(" ");
            }
            for (int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
