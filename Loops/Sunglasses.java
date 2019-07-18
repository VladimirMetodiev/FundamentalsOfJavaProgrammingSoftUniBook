package Loops;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int firstRowLeft = 0; firstRowLeft < 2 * num; firstRowLeft++) {
            System.out.print("*");
        }
        for (int firstRowMiddle = 0; firstRowMiddle < num; firstRowMiddle++) {
            System.out.print(" ");
        }
        for (int firstRowRight = 0; firstRowRight < 2 * num; firstRowRight++) {
            System.out.print("*");
        }
        System.out.println();

        for (int middleRows = 1; middleRows <= num - 2; middleRows++) {
            System.out.print("*");
            for (int left = 0; left < 2 * num - 2; left++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int middle = 0; middle < num; middle++) {
                if(Math.ceil((num - 2) / 2.0) == middleRows){
                    System.out.print("|");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for (int right = 0; right < 2 * num - 2; right++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int lastRowLeft = 0; lastRowLeft < 2 * num; lastRowLeft++) {
            System.out.print("*");
        }
        for (int lastRowMiddle = 0; lastRowMiddle < num; lastRowMiddle++) {
            System.out.print(" ");
        }
        for (int lastRowRight = 0; lastRowRight < 2 * num; lastRowRight++) {
            System.out.print("*");
        }
    }
}
