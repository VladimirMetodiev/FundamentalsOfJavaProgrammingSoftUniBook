package Loops;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int digit = Integer.parseInt(input.nextLine());

        for (int row = 0; row < digit; row++) {
            System.out.print("$");
            for (int column = 1; column <= row; column++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}



//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int digit = Integer.parseInt(input.nextLine());
//
//        for (int row = 1; row <= digit; row++) {
//            for (int column = 1; column <= row; column++) {
//                System.out.print("$ ");
//            }
//            System.out.println();
//        }
//    }