package ComplexLoops;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int remainder = 0;
        int sum = 0;

        do {
            remainder = number % 10;
            number = number / 10;
            sum += remainder;
        }while(number > 0);

        System.out.println(sum);
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String word = input.nextLine();
//
//        int sum = 0;
//
//        for(int a = 0; a < word.length(); a++){
//            char sign = word.charAt(a);
//            switch (sign){
//                case '1':{
//                    sum += 1;
//                    break;
//                }
//                case '2':{
//                    sum += 2;
//                    break;
//                }
//                case '3':{
//                    sum += 3;
//                    break;
//                }
//                case '4':{
//                    sum += 4;
//                    break;
//                }
//                case '5':{
//                    sum += 5;
//                    break;
//                }
//                case '6':{
//                    sum += 6;
//                    break;
//                }
//                case '7':{
//                    sum += 7;
//                    break;
//                }
//                case '8':{
//                    sum += 8;
//                    break;
//                }
//                case '9':{
//                    sum += 9;
//                    break;
//                }
//                default:{
//                    break;
//                }
//            }
//        }
//
//        System.out.println(sum);
//    }