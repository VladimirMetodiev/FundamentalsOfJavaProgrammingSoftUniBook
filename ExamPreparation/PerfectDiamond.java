package ExamPreparation;

import java.util.Scanner;

public class PerfectDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for (int upSpace = 1; upSpace <= number - 1; upSpace++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int rows = 1; rows <= number - 1; rows++) {
            for (int space = number - 1 - rows; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int column = 0; column < rows; column++) {
                System.out.print("*-");
            }
            System.out.println("*");
        }

        for (int downRows = number - 1; downRows >= 1; downRows--) {
            for (int space = 1; space <= number - downRows; space++) {
                System.out.print(" ");
            }
            for (int column = downRows - 1; column >= 1; column--) {
                System.out.print("*-");
            }
            System.out.println("*");
        }
    }
}
