package Loops;

import java.util.Scanner;

public class Stop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int topLeft = 1; topLeft <= num + 1; topLeft++) {
            System.out.print(".");
        }
        for (int topMiddle = 1; topMiddle <= 2 * num + 1; topMiddle++) {
            System.out.print("_");
        }
        for (int topRight = 1; topRight <= num + 1; topRight++) {
            System.out.print(".");
        }
        System.out.println();

        for (int upRows = 0; upRows < num; upRows++) {
            for (int left = num - upRows; left >= 1; left--) {
                System.out.print(".");
            }
            System.out.print("//");
            for (int middle = 1; middle <= 2 * num - 1 + 2 * upRows; middle++) {
                System.out.print("_");
            }
            System.out.print("\\\\");
            for (int right = num - upRows; right >= 1; right--) {
                System.out.print(".");
            }
            System.out.println();
        }

        System.out.print("//");
        for (int middleLeftRow = 1; middleLeftRow <= (4 * num - 6) / 2; middleLeftRow++) {
            System.out.print("_");
        }
        System.out.print("STOP!");
        for (int middleRightRow = 1; middleRightRow <= (4 * num - 6) / 2; middleRightRow++) {
            System.out.print("_");
        }
        System.out.println("\\\\");

        for (int downRows = 0; downRows < num; downRows++) {
            for (int left = 1; left <= downRows; left++) {
                System.out.print(".");
            }
            System.out.print("\\\\");
            for (int middle = 4 * num - 1 - 2 * downRows; middle >= 1; middle--) {
                System.out.print("_");
            }
            System.out.print("//");
            for (int right = 1; right <= downRows; right++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}



//    static void printUp(int from, int to, String sign){
//        for (int i = from; i <= to; i++) {
//            System.out.print(sign);
//        }
//    }
//    static void printDown(int from, int to, String sign){
//        for (int i = from; i >= to; i--) {
//            System.out.print(sign);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = Integer.parseInt(input.nextLine());
//
//        int from = 1;
//        int to = num + 1;
//        String symbol = ".";
//        printUp(from, to, symbol);
//
//        from = 1;
//        to = 2 * num + 1;
//        symbol = "_";
//        printUp(from, to, symbol);
//
//        from = 1;
//        to = num + 1;
//        symbol = ".";
//        printUp(from, to, symbol);
//        System.out.println();
//
//        for (int upRows = 0; upRows < num; upRows++) {
//            from = num - upRows;
//            to = 1;
//            symbol = ".";
//            printDown(from, to, symbol);
//
//            System.out.print("//");
//
//            from = 1;
//            to = 2 * num - 1 + 2 * upRows;
//            symbol = "_";
//            printUp(from, to, symbol);
//
//            System.out.print("\\\\");
//
//            from = num - upRows;
//            to = 1;
//            symbol = ".";
//            printDown(from, to, symbol);
//
//            System.out.println();
//        }
//
//        System.out.print("//");
//
//        from = 1;
//        to = (4 * num - 6) / 2;
//        symbol = "_";
//        printUp(from, to, symbol);
//
//        System.out.print("STOP!");
//
//        from = 1;
//        to = (4 * num - 6) / 2;
//        symbol = "_";
//        printUp(from, to, symbol);
//
//        System.out.println("\\\\");
//
//        for (int downRows = 0; downRows < num; downRows++) {
//            from = 1;
//            to = downRows;
//            symbol = ".";
//            printUp(from, to, symbol);
//
//            System.out.print("\\\\");
//
//            from = 4 * num - 1 - 2 * downRows;
//            to = 1;
//            symbol = "_";
//            printDown(from, to, symbol);
//
//            System.out.print("//");
//
//            from = 1;
//            to = downRows;
//            symbol = ".";
//            printUp(from, to, symbol);
//            System.out.println();
//        }
//    }