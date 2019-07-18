package ComplexLoops;

import java.util.Scanner;

public class Sequence2KPlus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= number; i = 2 * i +1) {
            System.out.println(i);
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        int digit = 1;
//
//        while(number >= digit){
//            System.out.println(digit);
//            digit = 2 * digit + 1;
//        }
//    }