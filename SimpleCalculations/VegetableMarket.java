package SimpleCalculations;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double vegetablePrice = Double.parseDouble(input.nextLine());
        double fruitPrice = Double.parseDouble(input.nextLine());
        int kilosOfVegetables = Integer.parseInt(input.nextLine());
        int kilosOfFruits = Integer.parseInt(input.nextLine());

        double amountOfVegetables = kilosOfVegetables * vegetablePrice;
        double amountOfFruits = kilosOfFruits * fruitPrice;

        System.out.println((amountOfVegetables + amountOfFruits) / 1.94);
    }
}

//Задача1: Въвеждане на данни
//Задача2: Обработване на данните
//Задача3: Извеждане на резултат

//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        DecimalFormat df = new DecimalFormat("0.##");
//
//        float vegetablePrice = Float.parseFloat(input.nextLine());
//        float fruitPrice = Float.parseFloat(input.nextLine());
//        int kilosOfVegetables = Integer.parseInt(input.nextLine());
//        int kilosOfFruits = Integer.parseInt(input.nextLine());
//
//        double amountOfVegetables = kilosOfVegetables * vegetablePrice / 1.94;
//        double amountOfFruits = kilosOfFruits * fruitPrice / 1.94;
//
//        System.out.print(df.format(amountOfVegetables + amountOfFruits));
//    }