package ComplexConditions;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float budget = Float.parseFloat(input.nextLine());
        String season = input.nextLine().toLowerCase();

        String typeTrip = "";
        double price = 0.0;

        if(budget <= 100){
            if(season.equals("summer")){
                typeTrip = "Camp";
                price = budget * 0.3;
            }
            else if(season.equals("winter")){
                typeTrip = "Hotel";
                price = budget * 0.7;
            }
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("%s - %.2f", typeTrip, price);
        }
        else if(budget <= 1000){
            if(season.equals("summer")){
                typeTrip = "Camp";
                price = budget * 0.4;
            }
            else if(season.equals("winter")){
                typeTrip = "Hotel";
                price = budget * 0.8;
            }
            System.out.println("Somewhere in Balkans");
            System.out.printf("%s - %.2f", typeTrip, price);
        }
        else if(budget > 1000){
            price = budget * 0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", price);
        }
    }
}
