package Loops;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int digit = 0;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            digit = Integer.parseInt(input.nextLine());
            sum += digit;
        }

        System.out.println(sum);
    }
}
