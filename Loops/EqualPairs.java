package Loops;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int num1 = 0;
        int num2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int maxDiff1 = 0;
        int maxDiff2 = 0;

        for (int i = 1; i <= 2 * number; i++) {
            int digit = Integer.parseInt(input.nextLine());
            if(i % 2 != 0){
                num1 = digit;
            }
            else{
                num2 = digit;
            }
            if(i % 2 == 0){
                sum2 = sum1;
                sum1 = num1 + num2;
                if (i > 2 && sum2 != sum1) {
                    maxDiff1 = Math.abs(sum2 - sum1);
                    if(maxDiff2 < maxDiff1){
                        maxDiff2 = maxDiff1;
                    }
                }
            }
        }
        if(maxDiff2 == 0){
            System.out.printf("Yes, value=%d", sum1);
        }
        else{
            System.out.printf("No, maxdiff=%d", maxDiff2);
        }
    }
}
