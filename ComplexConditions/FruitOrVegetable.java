package ComplexConditions;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String food = input.nextLine().toLowerCase();

        if(food.equals("banana") || food.equals("apple") || food.equals("kiwi") || food.equals("cherry") || food.equals("lemon") || food.equals("grapes")){
            System.out.println("fruit");
        }
        else if(food.equals("tomato") || food.equals("cucumber") || food.equals("pepper") || food.equals("carrot")){
            System.out.println("vegetable");
        }
        else{
            System.out.println("unknown");
        }
    }
}




//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String food = input.nextLine().toLowerCase();
//
//        boolean isFruit = food.equals("banana") || food.equals("apple") || food.equals("kiwi") || food.equals("cherry") || food.equals("lemon") || food.equals("grapes");
//        boolean isVegetable = food.equals("tomato") || food.equals("cucumber") || food.equals("pepper") || food.equals("carrot");
//
//        if (isFruit) {
//            System.out.println("fruit");
//        } else if (isVegetable) {
//            System.out.println("vegetable");
//        } else {
//            System.out.println("unknown");
//        }
//    }
