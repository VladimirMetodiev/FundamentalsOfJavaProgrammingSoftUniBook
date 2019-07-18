package ComplexLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        int factorial = 1;
//
//        do {
//            factorial *= number;
//            number--;
//        }while(number >= 1);
//
//        System.out.println(factorial);
//    }