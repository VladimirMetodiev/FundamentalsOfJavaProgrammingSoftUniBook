package Loops;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int sum = 0;

        for(int a = 1; a <= number; a++){
            int digit = Integer.parseInt(input.nextLine());
            if(maxValue < digit){
                maxValue = digit;
            }
            sum += digit;
        }

        sum -= maxValue;

        if(sum == maxValue){
            System.out.printf("Yes Sum = %d", maxValue);
        }
        else{
            System.out.printf("No Diff = %d", Math.abs(maxValue - sum));
        }
    }
}
