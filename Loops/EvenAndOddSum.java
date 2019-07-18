package Loops;

import java.util.Scanner;

public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for(int a = 1; a <= number; a++){
            int digit = Integer.parseInt(input.nextLine());
            if(a % 2 == 0){
                evenSum += digit;
            }
            else{
                oddSum += digit;
            }
        }

        if(evenSum == oddSum){
            System.out.printf("Yes sum = %d", evenSum);
        }
        else{
            System.out.printf("No diff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
