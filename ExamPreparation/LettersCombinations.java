package ExamPreparation;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLetter = input.nextLine().toLowerCase();
        String lastLetter = input.nextLine().toLowerCase();
        String letter = input.nextLine().toLowerCase();

        char fl = firstLetter.charAt(0);
        char ll = lastLetter.charAt(0);
        char lr = letter.charAt(0);

        int counter = 0;

        for (char i = fl; i <= ll; i++) {
            for (char j = fl; j <= ll; j++) {
                for (char k = fl; k <= ll; k++) {
                    if(i != lr && j != lr && k != lr){
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        char firstLetter = input.nextLine().charAt(0);
//        char lastLetter = input.nextLine().charAt(0);
//        char letter = input.nextLine().charAt(0);
//
//        int counter = 0;
//
//        for (char i = firstLetter; i <= lastLetter; i++) {
//            for (char j = firstLetter; j <= lastLetter; j++) {
//                for (char k = firstLetter; k <= lastLetter; k++) {
//                    if(i != letter && j != letter && k != letter){
//                        System.out.printf("%c%c%c ", i, j, k);
//                        counter++;
//                    }
//                }
//            }
//        }
//        System.out.println(counter);
//    }



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        char firstLetter = input.nextLine().charAt(0);
//        char lastLetter = input.nextLine().charAt(0);
//        char letter = input.nextLine().charAt(0);
//
//        int counter = 0;
//
//        for(char i = firstLetter; i <= lastLetter; i++){
//            if(i != letter){
//                for (char j = firstLetter; j <= lastLetter; j++) {
//                    if(j != letter ){
//                        for (char k = firstLetter; k <= lastLetter; k++){
//                            if(k != letter){
//                                System.out.printf("%c%c%c ", i, j, k);
//                                counter++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(counter);
//    }



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        char firstLetter = input.nextLine().charAt(0);
//        char secondLetter = input.nextLine().charAt(0);
//        char letter = input.nextLine().charAt(0);
//
//        int counter = 0;
//
//        char[] array = new char[4];
//        array[3] = ' ';
//
//        for (char i = firstLetter; i <= secondLetter; i++) {
//            if (i != letter) {
//                array[0] = i;
//                for (char j = firstLetter; j <= secondLetter; j++) {
//                    if (j != letter) {
//                        array[1] = j;
//                        for (char k = firstLetter; k <= secondLetter; k++) {
//                            if (k != letter) {
//                                array[2] = k;
//                                System.out.print(array);
//                                counter++;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(counter);
//
//    }