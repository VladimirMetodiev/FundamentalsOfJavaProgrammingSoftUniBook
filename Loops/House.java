package Loops;

import java.util.Scanner;

public class House {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int roof = 1; roof <= num - num / 2; roof++) {
            for (int space1 = (num - num / 2) - roof; space1 > 0 ; space1--) {
                System.out.print("-");
            }

            if(num % 2 == 0){
                for (int i = 1; i <= 2 * roof; i++) {
                    System.out.print("*");
                }
            }
            else if(num % 2 != 0){
                for (int i = 1; i <= 2 * roof - 1; i++) {
                    System.out.print("*");
                }
            }

            for (int space2 = (num - num / 2) - roof; space2 > 0 ; space2--) {
                System.out.print("-");
            }

            System.out.println();
        }

        for (int walls = 1; walls <= Math.floor(num / 2); walls++) {
            System.out.print("|");
            for (int middle = 1; middle <= num - 2; middle++) {
                System.out.print("*");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
