package ComplexLoops;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = Integer.parseInt(input.nextLine());

        int number = digit;
        String prime= "Prime";

        if(digit <= 1){
            System.out.println("Not prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(digit); i++) {
            if(number % i == 0){
                prime= "Not prime";
                break;
            }
        }

        System.out.println(prime);
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int digit = Integer.parseInt(input.nextLine());
//
//        String prime= "Prime";
//        int number = digit - 1;
//        int result = 0;
//
//        if(digit <= 1){
//            System.out.println("Not prime");
//            return;
//        }
//
//        while(true){
//            result = digit % number;
//            if(number < 2){
//                break;
//            }
//            else if(number >= 2 && result == 0){
//                prime = "Not prime";
//                break;
//            }
//            number--;
//        }
//
//        System.out.println(prime);
//    }