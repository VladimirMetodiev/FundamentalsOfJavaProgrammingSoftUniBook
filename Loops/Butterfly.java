package Loops;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int row = 1; row <= num - 2; row++) {
            if(row % 2 != 0){
                for (int columnLeft = 1; columnLeft <= num - 2; columnLeft++) {
                    System.out.print("*");
                }
            }
            else if(row % 2 == 0){
                for (int columnLeft = 1; columnLeft <= num - 2; columnLeft++) {
                    System.out.print("-");
                }
            }

            System.out.print("\\ /");

            if(row % 2 != 0){
                for (int columnRight = 1; columnRight <= num - 2; columnRight++) {
                    System.out.print("*");
                }
            }
            else if(row % 2 == 0){
                for (int columnRight = 1; columnRight <= num - 2; columnRight++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int middleLeftRow = 1; middleLeftRow <= num - 1; middleLeftRow++) {
            System.out.print(" ");
        }
        System.out.println("@");

        for (int downRows = 1; downRows <= num - 2; downRows++) {
            if(downRows % 2 != 0){
                for (int columnLeft = 1; columnLeft <= num - 2; columnLeft++) {
                    System.out.print("*");
                }
            }
            else if(downRows % 2 == 0){
                for (int columnLeft = 1; columnLeft <= num - 2; columnLeft++) {
                    System.out.print("-");
                }
            }

            System.out.print("/ \\");

            if(downRows % 2 != 0){
                for (int columnRight = 1; columnRight <= num - 2; columnRight++) {
                    System.out.print("*");
                }
            }
            else if(downRows % 2 == 0){
                for (int columnRight = 1; columnRight <= num - 2; columnRight++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
