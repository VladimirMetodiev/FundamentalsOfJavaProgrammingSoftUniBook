package ExamPreparation;

import java.util.Scanner;

public class RectangleWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for (int upRow = 1; upRow <= 2 * number; upRow++) {
            System.out.print("%");
        }
        System.out.println();

        if(number % 2 != 0){
            for (int rows = 1; rows <= number / 2; rows++) {
                System.out.print("%");
                for (int i = 1; i <= 2 * number - 2; i++) {
                    System.out.print(" ");
                }
                System.out.println("%");
            }

            System.out.print("%");
            for (int rowLeft = 1; rowLeft <= number - 2; rowLeft++) {
                System.out.print(" ");
            }
            System.out.print("**");
            for (int rowRight = 1; rowRight <= number - 2; rowRight++) {
                System.out.print(" ");
            }
            System.out.println("%");

            for (int rows = 1; rows <= number / 2; rows++) {
                System.out.print("%");
                for (int i = 1; i <= 2 * number - 2; i++) {
                    System.out.print(" ");
                }
                System.out.println("%");
            }
        }
        else{
            for (int rows = 1; rows <= number / 2 - 1; rows++) {
                System.out.print("%");
                for (int i = 1; i <= 2 * number - 2; i++) {
                    System.out.print(" ");
                }
                System.out.println("%");
            }

            System.out.print("%");
            for (int rowLeft = 1; rowLeft <= number - 2; rowLeft++) {
                System.out.print(" ");
            }
            System.out.print("**");
            for (int rowRight = 1; rowRight <= number - 2; rowRight++) {
                System.out.print(" ");
            }
            System.out.println("%");

            for (int rows = 1; rows <= number / 2 - 1; rows++) {
                System.out.print("%");
                for (int i = 1; i <= 2 * number - 2; i++) {
                    System.out.print(" ");
                }
                System.out.println("%");
            }
        }

        for (int downRow = 1; downRow <= 2 * number; downRow++) {
            System.out.print("%");
        }
    }
}
