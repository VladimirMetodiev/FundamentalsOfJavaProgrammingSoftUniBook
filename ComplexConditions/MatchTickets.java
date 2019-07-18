package ComplexConditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MatchTickets {
    static String money(String category, double budget, int people){
        double remainder = 0d;
        String result = "";

        DecimalFormat df = new DecimalFormat("0.00");

        if(category.equals("vip")){
            remainder = budget - people * 499.99;
            if(remainder > 0){
                result = "Yes! You have " + df.format(remainder) + " leva left.";
            }
            else{
                result = "Not enough money! You need " + df.format(Math.abs(remainder)) + " leva.";
            }
        }
        else if(category.equals("normal")){
            remainder = budget - people * 249.99;
            if(remainder > 0){
                result = "Yes! You have " + df.format(remainder) + " leva left.";
            }
            else{
                result = "Not enough money! You need " + df.format(Math.abs(remainder)) + " leva.";
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double budget = Double.parseDouble(input.nextLine());
        String category = input.nextLine().toLowerCase();
        int people = Integer.parseInt(input.nextLine());

        if(people >= 1 && people <= 4){
            budget = budget - budget * 0.75;
            String print = money(category, budget, people);
            System.out.println(print);
        }
        else if(people > 4 && people <= 9){
            budget = budget - budget * 0.6;
            String print = money(category, budget, people);
            System.out.println(print);
        }
        else if(people > 9 && people <= 24){
            budget = budget - budget * 0.5;
            String print = money(category, budget, people);
            System.out.println(print);
        }
        else if(people > 24 && people <= 49){
            budget = budget - budget * 0.4;
            String print = money(category, budget, people);
            System.out.println(print);
        }
        else if(people > 49){
            budget = budget - budget * 0.25;
            String print = money(category, budget, people);
            System.out.println(print);
        }
    }
}
