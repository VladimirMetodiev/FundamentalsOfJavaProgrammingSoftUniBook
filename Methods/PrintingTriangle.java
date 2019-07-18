package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    static void printTriangle(short a){
        for (int rows = 1; rows <= a; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
        for (int rows = a - 1; rows >= 1; rows--) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short number = Short.parseShort(input.nextLine());
        printTriangle(number);
    }
}
