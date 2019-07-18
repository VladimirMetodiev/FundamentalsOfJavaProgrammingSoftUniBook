package ComplexConditions;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine().toLowerCase();
        String day = input.nextLine().toLowerCase();
        float quantity = Float.parseFloat(input.nextLine());

        double price = 0.0;

        if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")){
            if(fruit.equals("banana")){
                price = quantity * 2.5;
            }
            else if(fruit.equals("apple")){
                price = quantity * 1.2;
            }
            else if(fruit.equals("orange")){
                price = quantity * 0.85;
            }
            else if(fruit.equals("grapefruit")){
                price = quantity * 1.45;
            }
            else if(fruit.equals("kiwi")){
                price = quantity * 2.7;
            }
            else if(fruit.equals("pineapple")){
                price = quantity * 5.5;
            }
            else if(fruit.equals("grapes")){
                price = quantity * 3.85;
            }
            else{
                System.out.println("error");
                return;
            }
        }
        else if(day.equals("saturday") || day.equals("sunday")){
            if(fruit.equals("banana")){
                price = quantity * 2.7;
            }
            else if(fruit.equals("apple")){
                price = quantity * 1.25;
            }
            else if(fruit.equals("orange")){
                price = quantity * 0.9;
            }
            else if(fruit.equals("grapefruit")){
                price = quantity * 1.6;
            }
            else if(fruit.equals("kiwi")){
                price = quantity * 3.0;
            }
            else if(fruit.equals("pineapple")){
                price = quantity * 5.6;
            }
            else if(fruit.equals("grapes")){
                price = quantity * 4.2;
            }
            else{
                System.out.println("error");
                return;
            }
        }
        else{
            System.out.println("error");
            return;
        }
        System.out.printf("%.2f", price);
    }
}
