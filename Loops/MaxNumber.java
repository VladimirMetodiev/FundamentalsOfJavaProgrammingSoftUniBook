package Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int digit = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= number; i++) {
            digit = Integer.parseInt(input.nextLine());
            if(digit > maxNumber) {
                maxNumber = digit;
            }
        }

        System.out.println(maxNumber);
    }
}
