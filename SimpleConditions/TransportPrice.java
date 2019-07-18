package SimpleConditions;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double distance = Double.parseDouble(input.nextLine());
        String partOfTheDay = input.nextLine().toLowerCase();

        double price = 0.0;

        if(distance >= 100){
            price = distance * 0.06;
        }
        else if(distance >= 20){
            price = distance * 0.09;
        }
        else{
            if(partOfTheDay.equals("day")){
                price = distance * 0.79 + 0.7;
            }
            else{
                price = distance * 0.9 + 0.7;
            }
        }

        System.out.printf("%f", price);
    }
}
