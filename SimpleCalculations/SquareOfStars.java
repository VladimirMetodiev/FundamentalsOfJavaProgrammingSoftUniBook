package SimpleCalculations;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());

        for (int up = 1; up <= num; up++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= num - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= num - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int down = 1; down <= num; down++) {
            System.out.print("*");
        }
    }
}
