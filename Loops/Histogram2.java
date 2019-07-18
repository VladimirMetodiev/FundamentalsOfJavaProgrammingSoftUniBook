package Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Histogram2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number =Integer.parseInt(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.00");

        double percent1 = 0d;
        double percent2 = 0d;
        double percent3 = 0d;
        double percent4 = 0d;
        double percent5 = 0d;

        double maxNumber = Integer.MIN_VALUE;

        for(int a = 1; a <= number; a++){
            int digit =Integer.parseInt(input.nextLine());
            if(digit < 200){
                percent1++;
            }
            else if(digit < 400){
                percent2++;
            }
            else if(digit < 600){
                percent3++;
            }
            else if(digit < 800){
                percent4++;
            }
            else if(digit >= 800){
                percent5++;
            }
        }

        if(maxNumber < percent1){
            maxNumber = percent1;
        }
        if(maxNumber < percent2){
            maxNumber = percent2;
        }
        if(maxNumber < percent3){
            maxNumber = percent3;
        }
        if(maxNumber < percent4){
            maxNumber = percent4;
        }
        if(maxNumber < percent5){
            maxNumber = percent5;
        }

        for (int b = 1; b <= maxNumber; b++) {
            if(b <= percent1){
                System.out.print("X ");
            }
            else{
                System.out.print("  ");
            }
        }
        percent1 = percent1 / number * 100d;
        System.out.println("   " + df.format(percent1) + "%");

        for (int c = 1; c <= maxNumber; c++) {
            if(c <= percent2){
                System.out.print("X ");
            }
            else{
                System.out.print("  ");
            }
        }
        percent2 = percent2 / number * 100d;
        System.out.println("   " + df.format(percent2) + "%");

        for (int d = 1; d <= maxNumber; d++) {
            if(d <= percent3){
                System.out.print("X ");
            }
            else{
                System.out.print("  ");
            }
        }
        percent3 = percent3 / number * 100d;
        System.out.println("   " + df.format(percent3) + "%");

        for (int e = 1; e <= maxNumber; e++) {
            if(e <= percent4){
                System.out.print("X ");
            }
            else{
                System.out.print("  ");
            }
        }
        percent4 = percent4 / number * 100d;
        System.out.println("   " + df.format(percent4) + "%");

        for (int f = 1; f <= maxNumber; f++) {
            if(f <= percent5){
                System.out.print("X ");
            }
            else{
                System.out.print("  ");
            }
        }
        percent5 = percent5 / number * 100d;
        System.out.println("   " + df.format(percent5) + "%");
    }
}
