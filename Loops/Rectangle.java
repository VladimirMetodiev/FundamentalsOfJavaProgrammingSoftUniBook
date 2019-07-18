package Loops;

import java.util.Scanner;

public class Rectangle {
    static void stars(){
        for(int column = 1; column <= 10; column++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int row = 1; row <= 10; row++){
            stars();
            System.out.println();
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        for(int row = 1; row <= 10; row++){
//            for(int column = 1; column <= 10; column++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }