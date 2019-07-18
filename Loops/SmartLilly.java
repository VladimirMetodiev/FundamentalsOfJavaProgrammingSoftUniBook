package Loops;

import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = Integer.parseInt(input.nextLine());
        double washingMachinePrice = Double.parseDouble(input.nextLine());
        int toyPrice = Integer.parseInt(input.nextLine());

        double savings = 0.0;
        int sum = 0;
        int countToys = 0;
        int a = 0;

        for (int i = 1; i <= age; i++) {
            if(i % 2 == 0){
                a = a + 10;
                sum = sum + a - 1;
            }
            else if( i% 2 != 0){
                countToys++;
            }
        }

        savings = sum + countToys * toyPrice;
        if(washingMachinePrice <= savings){
            System.out.printf("Yes! %.2f", savings - washingMachinePrice);
        }
        else{
            System.out.printf("No! %.2f", washingMachinePrice - savings);
        }
    }
}
