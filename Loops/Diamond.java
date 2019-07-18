package Loops;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int top = 1; top <= num - num / 2; top++) {
            for (int space1 = (num - num / 2) - top; space1 > 0 ; space1--) {
                System.out.print("-");
            }

            if(num % 2 == 0){
                for (int i = 1; i <= 1; i++) {
                    System.out.print("*");
                    for (int j = 1; j <= 2 * top - 2; j++) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                }
            }
            else if(num % 2 != 0){
                for (int i = 1; i <= 1; i++) {
                    if(top == 1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("*");
                        for (int j = 1; j <= 2 * top - 3; j++) {
                            System.out.print("-");
                        }
                        System.out.print("*");
                    }
                }
            }

            for (int space2 = (num - num / 2) - top; space2 > 0 ; space2--) {
                System.out.print("-");
            }

            System.out.println();
        }

        for(int bottom = 1; bottom <= num - num / 2 - 1; bottom++){
            for (int space3 = 1; space3 <= bottom; space3++) {
                System.out.print("-");
            }

            if(num % 2 == 0){
                for (int i = 0; i < 1; i++) {
                    System.out.print("*");
                    for (int j = num - 2 * bottom - 2; j >= 1; j--) {
                        System.out.print("-");
                    }
                    System.out.print("*");
                }
            }
            else if(num % 2 != 0){
                for (int i = 0; i < 1; i++) {
                    if(bottom == num - num / 2 - 1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("*");
                        for (int j = num - 2 * bottom - 2; j >= 1; j--) {
                            System.out.print("-");
                        }
                        System.out.print("*");
                    }
                }
            }

            for (int space4 = 1; space4 <= bottom; space4++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
