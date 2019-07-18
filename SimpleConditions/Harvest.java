package SimpleConditions;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vineyard = Integer.parseInt(input.nextLine());
        double yield = Double.parseDouble(input.nextLine());
        int businessGoal = Integer.parseInt(input.nextLine());
        int workers = Integer.parseInt(input.nextLine());

        double harvest = vineyard * yield * 0.4;
        double production = harvest / 2.5;
        double remainder = businessGoal - production;

        if(remainder <= 0){
            double vineLeft = production - businessGoal;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(production));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(vineLeft), Math.ceil(vineLeft / workers));

        }
        else{
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(remainder));
        }
    }
}
