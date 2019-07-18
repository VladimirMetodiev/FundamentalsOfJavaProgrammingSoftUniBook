package Loops;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for(int a = 1; a <= 2 * number; a++){
            int digit = Integer.parseInt(input.nextLine());
            if(a <= number){
                leftSum += digit;
            }
            else{
                rightSum += digit;
            }
        }

        if(leftSum == rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        }
        else{
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}
