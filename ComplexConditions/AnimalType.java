package ComplexConditions;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String animal = input.nextLine().toLowerCase();

        switch(animal){
            case "dog":{
                System.out.println("mammal");
                break;
            }
            case "crocodile":
            case "tortoise":
            case "snake":{
                System.out.println("reptile");
                break;
            }
            default:{
                System.out.println("unknown");
                break;
            }
        }
    }
}
