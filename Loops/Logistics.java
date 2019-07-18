package Loops;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfLoads = Integer.parseInt(input.nextLine());

        double tonsByVan = 0.0;
        double tonsByLorry = 0.0;
        double tonsByTrain = 0.0;

        double total = 0.0;
        double averageCost = 0.0;

        for (int i = 1; i <= numberOfLoads; i++) {
            int tonsOfGoods = Integer.parseInt(input.nextLine());
            if(tonsOfGoods <= 3){
                tonsByVan += tonsOfGoods;
            }
            else if(tonsOfGoods <= 11){
                tonsByLorry += tonsOfGoods;
            }
            else if(tonsOfGoods > 11){
                tonsByTrain += tonsOfGoods;
            }
        }

        total = tonsByVan + tonsByLorry + tonsByTrain;
        averageCost = (tonsByVan * 200 + tonsByLorry * 175 + tonsByTrain * 120) / total;

        tonsByVan = tonsByVan / total * 100;
        tonsByLorry = tonsByLorry / total * 100;
        tonsByTrain = tonsByTrain / total * 100;

        System.out.printf("%.2f%n", averageCost);
        System.out.printf("%.2f%%%n", tonsByVan);
        System.out.printf("%.2f%%%n", tonsByLorry);
        System.out.printf("%.2f%%%n", tonsByTrain);
    }
}
