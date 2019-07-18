package Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        double oddSum = 0d;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0d;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for(int a = 1; a <= number; a++){
            double digit = Double.parseDouble(input.nextLine());
            if(a % 2 != 0){
                oddSum += digit;
                if(oddMin > digit){
                    oddMin = digit;
                }
                if(oddMax < digit){
                    oddMax = digit;
                }
            }
            else if(a % 2 == 0){
                evenSum += digit;
                if(evenMin > digit){
                    evenMin = digit;
                }
                if(evenMax < digit){
                    evenMax = digit;
                }
            }

        }

        System.out.printf("OddSum=%s,%n", df.format(oddSum));
        if(oddMin == Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        }
        else{
            System.out.printf("OddMin=%s,%n", df.format(oddMin));
        }
        if(oddMax == Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        }
        else{
            System.out.printf("OddMax=%s%n", df.format(oddMax));
        }

        System.out.printf("EvenSum=%s,%n", df.format(evenSum));
        if(evenMin == Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        }
        else{
            System.out.printf("EvenMin=%s,%n", df.format(evenMin));
        }
        if(evenMax == Integer.MIN_VALUE){
            System.out.println("EvenMax=No,");
        }
        else{
            System.out.printf("EvenMax=%s%n", df.format(evenMax));
        }
    }
}
