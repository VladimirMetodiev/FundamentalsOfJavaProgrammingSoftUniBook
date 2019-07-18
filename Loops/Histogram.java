package Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number =Integer.parseInt(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.00");

        double percent1 = 0d;
        double percent2 = 0d;
        double percent3 = 0d;
        double percent4 = 0d;
        double percent5 = 0d;

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

        percent1 = percent1 / number * 100d;
        percent2 = percent2 / number * 100d;
        percent3 = percent3 / number * 100d;
        percent4 = percent4 / number * 100d;
        percent5 = percent5 / number * 100d;

        System.out.println(df.format(percent1) + "%");
        System.out.println(df.format(percent2) + "%");
        System.out.println(df.format(percent3) + "%");
        System.out.println(df.format(percent4) + "%");
        System.out.println(df.format(percent5) + "%");
    }
}
