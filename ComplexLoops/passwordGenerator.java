package ComplexLoops;

import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int letter = Integer.parseInt(input.nextLine());

        for(int a = 1; a <= number; a++){
            for(int b = 1; b <= number; b++){
                for(char c = 'a'; c < 'a' + letter; c++){
                    for(char d = 'a'; d < 'a' + letter; d++){
                        for(int e = ((a > b) ? a : b) + 1; e <= number; e++){
                            System.out.printf("%d%d%s%s%d ", a, b, c, d, e);
                        }
                    }
                }
            }
        }
    }
}



//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//        int sign = Integer.parseInt(input.nextLine());
//
//        char letter = 'a';
//
//        switch(sign){
//            case 1:{
//                letter = 'a';
//                break;
//            }
//            case 2:{
//                letter = 'b';
//                break;
//            }
//            case 3:{
//                letter = 'c';
//                break;
//            }
//            case 4:{
//                letter = 'd';
//                break;
//            }
//            case 5:{
//                letter = 'e';
//                break;
//            }
//            case 6:{
//                letter = 'f';
//                break;
//            }
//            case 7:{
//                letter = 'g';
//                break;
//            }
//            case 8:{
//                letter = 'h';
//                break;
//            }
//            case 9:{
//                letter = 'i';
//                break;
//            }
//            default:{
//                break;
//            }
//        }
//
//        for(int a = 1; a <= number; a++){
//            for(int b = 1; b <= number; b++){
//                for(char c = 'a'; c <= letter; c++){
//                    for(char d = 'a'; d <= letter; d++){
//                        for(int e = ((a > b) ? a : b) + 1; e <= number; e++){
//                            System.out.printf("%d%d%s%s%d ", a, b, c, d, e);
//                        }
//                    }
//                }
//            }
//        }
//    }