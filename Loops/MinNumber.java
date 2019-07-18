package Loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int digit = 0;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= number; i++) {
            digit = Integer.parseInt(input.nextLine());
            if(digit < minNumber) {
                minNumber = digit;
            }
        }

        System.out.println(minNumber);
    }
}
