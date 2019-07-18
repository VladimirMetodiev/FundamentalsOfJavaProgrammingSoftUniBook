package ExamPreparation;

import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = Double.parseDouble(input.nextLine());
        double widthOfTheFloor = Double.parseDouble(input.nextLine());
        double lengthOfTheFloor = Double.parseDouble(input.nextLine());
        double sideOfTheTriangle = Double.parseDouble(input.nextLine());
        double heightOfTheTriangle = Double.parseDouble(input.nextLine());
        double priceOfATile = Double.parseDouble(input.nextLine());
        double salary = Double.parseDouble(input.nextLine());

        double areaOfTheFloor = widthOfTheFloor * lengthOfTheFloor;
        double areaOfTheTile = sideOfTheTriangle * heightOfTheTriangle / 2.0;
        double totalTiles = Math.ceil(areaOfTheFloor / areaOfTheTile) + 5.0;
        double price = totalTiles * priceOfATile + salary;

        if(money >= price){
            System.out.printf("%.2f lv left.", money - price);
        }
        else{
            System.out.printf("You'll need %.2f lv more.", price - money);
        }
    }
}
