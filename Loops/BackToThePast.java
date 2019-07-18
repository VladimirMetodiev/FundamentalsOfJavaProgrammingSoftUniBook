package Loops;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inheritedMoney = Double.parseDouble(input.nextLine());
        int years = Integer.parseInt(input.nextLine());

        int age = 18;

        for (int i = 1800; i <= years; i++) {
            if(i % 2 == 0){
                inheritedMoney -= 12000;
            }
            else{
                inheritedMoney = inheritedMoney - (12000 + 50 * age);
            }
            age++;
        }

        if(inheritedMoney >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        }
        else{
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }
    }
}
