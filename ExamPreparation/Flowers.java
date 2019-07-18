package ExamPreparation;

import java.util.Scanner;

public class Flowers {
    static double totalPrice(int f1, int f2, int f3, double p1, double p2, double p3, double h){
        double tp = (f1 * p1 + f2 * p2 + f3 *p3) * h;
        return tp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfChrysanthemums = Integer.parseInt(input.nextLine());
        int countOfRoses = Integer.parseInt(input.nextLine());
        int countOfTulips = Integer.parseInt(input.nextLine());
        String season = input.nextLine().toLowerCase();
        String yesNo = input.nextLine().toLowerCase();

        double priceOfChrysanthemums = 0.0;
        double priceOfRoses = 0.0;
        double priceOfTulips = 0.0;
        double price = 0.0;
        double holiday = 1.0;

        if(season.equals("spring") && yesNo.equals("n")){
            priceOfChrysanthemums = 2.0;
            priceOfRoses = 4.1;
            priceOfTulips = 2.5;
            holiday = 1.0;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfTulips >= 7){
                price *= 0.95;
            }
            if(countOfChrysanthemums + countOfRoses + countOfTulips > 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
        else if(season.equals("spring") && yesNo.equals("y")){
            priceOfChrysanthemums = 2.0;
            priceOfRoses = 4.1;
            priceOfTulips = 2.5;
            holiday = 1.15;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfTulips >= 7){
                price *= 0.95;
            }
            if(countOfChrysanthemums + countOfRoses + countOfTulips >= 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
        else if(season.equals("summer") && yesNo.equals("n")){
            priceOfChrysanthemums = 2.0;
            priceOfRoses = 4.1;
            priceOfTulips = 2.5;
            holiday = 1.0;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfChrysanthemums + countOfRoses + countOfTulips >= 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
        else if(season.equals("summer") && yesNo.equals("y")){
            priceOfChrysanthemums = 2.0;
            priceOfRoses = 4.1;
            priceOfTulips = 2.5;
            holiday = 1.15;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfChrysanthemums + countOfRoses + countOfTulips >= 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
        else if(season.equals("autumn") && yesNo.equals("n")){
            priceOfChrysanthemums = 3.75;
            priceOfRoses = 4.5;
            priceOfTulips = 4.15;
            holiday = 1.0;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfChrysanthemums + countOfRoses + countOfTulips >= 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
        else if(season.equals("autumn") && yesNo.equals("y")){
            priceOfChrysanthemums = 3.75;
            priceOfRoses = 4.5;
            priceOfTulips = 4.15;
            holiday = 1.15;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfChrysanthemums + countOfRoses + countOfTulips >= 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
        else if(season.equals("winter") && yesNo.equals("n")){
            priceOfChrysanthemums = 3.75;
            priceOfRoses = 4.5;
            priceOfTulips = 4.15;
            holiday = 1.0;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfRoses >= 10){
                price *= 0.9;
            }
            if(countOfChrysanthemums + countOfRoses + countOfTulips >= 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
        else if(season.equals("winter") && yesNo.equals("y")){
            priceOfChrysanthemums = 3.75;
            priceOfRoses = 4.5;
            priceOfTulips = 4.15;
            holiday = 1.15;
            price = totalPrice(countOfChrysanthemums, countOfRoses, countOfTulips, priceOfChrysanthemums, priceOfRoses, priceOfTulips, holiday);
            if(countOfRoses >= 10){
                price *= 0.9;
            }
            if(countOfChrysanthemums + countOfRoses + countOfTulips >= 20){
                price *= 0.8;
            }
            System.out.printf("%.2f", price + 2);
        }
    }
}
