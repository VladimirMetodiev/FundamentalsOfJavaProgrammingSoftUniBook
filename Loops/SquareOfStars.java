package Loops;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number =Integer.parseInt(input.nextLine());

        for (int row = 1; row <= number; row++) {
            System.out.print("*");
            for (int column = 1; column < number; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number =Integer.parseInt(input.nextLine());
//
//        for (int row = 1; row <= number; row++) {
//            for (int column = 1; column <= number; column++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }