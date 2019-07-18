package Loops;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        double percent1 = 0d;
        double percent2 = 0d;
        double percent3 = 0d;

        for(int a = 1; a <= number; a++){
            int digit = Integer.parseInt(input.nextLine());
            if(digit % 2 == 0){
                percent1++;
            }
            if(digit % 3 == 0){
                percent2++;
            }
            if(digit % 4== 0){
                percent3++;
            }
        }

        percent1 = percent1 / number * 100;
        percent2 = percent2 / number * 100;
        percent3 = percent3 / number * 100;

        System.out.printf("%.2f%%%n", percent1);
        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
    }
}
