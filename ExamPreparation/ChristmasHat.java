package ExamPreparation;

import java.util.Scanner;

public class ChristmasHat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());


        for (int upLeft = 1; upLeft <= 2 * n - 1; upLeft++) {
            System.out.print(".");
        }
        System.out.print("/|\\");
        for (int upRight = 1; upRight <= 2 * n - 1; upRight++) {
            System.out.print(".");
        }
        System.out.println();
        for (int upLeftTwo = 1; upLeftTwo <= 2 * n - 1; upLeftTwo++) {
            System.out.print(".");
        }
        System.out.print("\\|/");
        for (int upRightTwo = 1; upRightTwo <= 2 * n - 1; upRightTwo++) {
            System.out.print(".");
        }
        System.out.println();


        for (int rows = 1; rows <= 2 * n; rows++) {
            for (int leftPoints = 2 * n - rows; leftPoints >= 1; leftPoints--) {
                System.out.print(".");
            }

            for (int middleLeft = 1; middleLeft <= rows; middleLeft++) {
                if (middleLeft == 1) {
                    System.out.print("*");
                }
                if(middleLeft > 1){
                    System.out.print("-");
                }
            }
            System.out.print("*");
            for (int middleRight = 1; middleRight <= rows; middleRight++) {
                if(middleRight > 1){
                    System.out.print("-");
                }
                if(middleRight == rows){
                    System.out.print("*");
                }
            }

            for (int rightPoints = 2 * n - rows; rightPoints >= 1; rightPoints--) {
                System.out.print(".");
            }
            System.out.println();
        }


        for (int downU = 1; downU <= 4 * n + 1; downU++) {
            System.out.print("*");
        }
        System.out.println();
        for (int downM = 1; downM <= 4 * n + 1; downM++) {
            if(downM % 2 != 0){
                System.out.print("*");
            }
            else{
                System.out.print(".");
            }

        }
        System.out.println();
        for (int downD = 1; downD <= 4 * n + 1; downD++) {
            System.out.print("*");
        }
    }
}
