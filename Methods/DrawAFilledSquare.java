package Methods;

import java.util.Scanner;

public class DrawAFilledSquare {
    static void printRow(int number){
        for (int i = 1; i <= 2 * number; i++) {
            System.out.print("-");
        }
    }

    static void printBody(int number){
        for (int i = 1; i <= number - 2; i++) {
            System.out.print("-");
            for (int j = 1; j <= number - 1; j++)
            {
                System.out.print("\\/");
            }
            System.out.println("-");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        printRow(number);
        System.out.println();
        printBody(number);
        printRow(number);
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        for (int i = 1; i <= 2 * number; i++) {
//            System.out.print("-");
//        }
//        System.out.println();
//
//        if(number < 3){
//
//        }
//        else if(number % 2 == 0) {
//            for (int rows = 1; rows <= number / 2; rows++) {
//                System.out.print("-");
//                for (int columns = 1; columns <= number - 1; columns++) {
//                    System.out.print("\\/");
//                }
//                System.out.println("-");
//            }
//
//        }
//        else if(number % 2 != 0){
//            for (int rows = 1; rows <= (number + 1) / 2; rows++) {
//                System.out.print("-");
//                for (int columns = 1; columns <= number - 1; columns++) {
//                    System.out.print("\\/");
//                }
//                System.out.println("-");
//            }
//        }
//
//        for (int i = 1; i <= 2 * number; i++) {
//            System.out.print("-");
//        }
//    }



//    static void print(int a, String b){
//        for (int i = 1; i <= a; i++) {
//            System.out.print(b);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        String sign = "-";
//        int num = 2 * number;
//
//        print(num, sign);
//        System.out.println();
//
//        if(number < 3){
//
//        }
//        else if(number % 2 == 0) {
//            for (int rows = 1; rows <= number / 2; rows++) {
//                System.out.print("-");
//
//                sign = "\\/";
//                num = number - 1;
//                print(num, sign);
//
//                System.out.println("-");
//            }
//
//        }
//        else if(number % 2 != 0){
//            for (int rows = 1; rows <= (number + 1) / 2; rows++) {
//                System.out.print("-");
//
//                sign = "\\/";
//                num = number - 1;
//                print(num, sign);
//
//                System.out.println("-");
//            }
//        }
//
//        sign = "-";
//        num = 2 * number;
//        print(num, sign);
//    }
//}