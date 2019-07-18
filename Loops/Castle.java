package Loops;

import java.util.Scanner;

public class Castle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        System.out.print("/");
        for(int topOfLeftTower = 1; topOfLeftTower <= num / 2; topOfLeftTower++){
            System.out.print("^");
        }
        System.out.print("\\");

        for(int topMiddle = 1; topMiddle <= num - 4; topMiddle++){
            System.out.print("_");
        }
        if(num % 2 != 0 && num > 3){
            System.out.print("_");
        }

        System.out.print("/");
        for(int topOfRightTower = 1; topOfRightTower <= num / 2; topOfRightTower++){
            System.out.print("^");
        }
        System.out.print("\\");
        System.out.println();

        for (int wall = 1; wall <= num - 3; wall++) {
            System.out.print("|");
            for (int i = 1; i <= 2 * num - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("|");
        for (int i = 1; i <= num / 2 + 1; i++) {
            System.out.print(" ");
        }
        for(int down = 1; down <= num - 4; down++){
            System.out.print("_");
        }
        if(num % 2 != 0 && num > 3){
            System.out.print("_");
        }
        for (int i = 1; i <= num / 2 + 1; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        System.out.print("\\");
        for(int bottomOfLeftTower = 1; bottomOfLeftTower <= num / 2; bottomOfLeftTower++){
            System.out.print("_");
        }
        System.out.print("/");

        for(int bottomMiddle = 1; bottomMiddle <= num - 4; bottomMiddle++){
            System.out.print(" ");
        }
        if(num % 2 != 0 && num > 3){
            System.out.print(" ");
        }

        System.out.print("\\");
        for(int bottomOfRightTower = 1; bottomOfRightTower <= num / 2; bottomOfRightTower++){
            System.out.print("_");
        }
        System.out.print("/");
    }
}


