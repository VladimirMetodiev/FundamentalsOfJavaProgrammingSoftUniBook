package SimpleConditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.#");

        double bonus = 0.0;

        if(number <= 100){
            bonus += 5;
        }
        else if(number > 100 && number <= 1000){
            bonus = number * 0.2;
        }
        else if(number > 1000){
            bonus = number * 0.1;
        }

        if(number % 2 == 0){
            bonus += 1;
        }

        if(number % 10 == 5){
            bonus += 2;
        }

        System.out.println(df.format(bonus));
        System.out.println(df.format(bonus + number));
    }
}
