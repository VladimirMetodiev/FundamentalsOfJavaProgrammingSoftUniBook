package TasksForChampions;

import java.util.Scanner;

public class FiveSpecialLetters {
    static int num(char letter){
        int digit = 0;
        switch (letter){
            case 'a':{
                digit = 5;
                break;
            }
            case 'b':{
                digit = -12;
                break;
            }
            case 'c':{
                digit = 47;
                break;
            }
            case 'd':{
                digit = 7;
                break;
            }
            case 'e':{
                digit = -32;
                break;
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = Integer.parseInt(input.nextLine());
        int lastNumber = Integer.parseInt(input.nextLine());

        String[] myArray = new String[3125];

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;

        int counter = 0;
        double weight = 0.0;
        boolean noSpecialLetters = true;

        for (char i = 'a'; i <= 'e'; i++) {
            for (char j = 'a'; j <= 'e'; j++) {
                for (char k = 'a'; k <= 'e'; k++) {
                    for (char l = 'a'; l <= 'e'; l++) {
                        for (char m = 'a'; m <= 'e'; m++) {
                            String letters = "" + i + j + k + l + m;
                            myArray[counter] = letters;
                            counter++;
                        }
                    }
                }
            }
        }

        for(int z = 0; z < 3125; z++){
            String letters = myArray[z];

            char l1 = letters.charAt(0);
            char l2 = letters.charAt(1);
            char l3 = letters.charAt(2);
            char l4 = letters.charAt(3);
            char l5 = letters.charAt(4);

            if(l5 != l4 && l5 != l3 && l5 != l2 && l5 != l1){
                n5 = num(l5);
            }
            else{
                n5 = 0;
            }

            if(l4 != l3 && l4 != l2 && l4 != l1){
                n4 = num(l4);
            }
            else{
                n4 = n5;
                n5 = 0;
            }

            if(l3 != l2 && l3 != l1){
                n3 = num(l3);
            }
            else{
                n3 = n4;
                n4 = n5;
                n5 = 0;
            }

            if(l2 != l1){
                n2 = num(l2);
            }
            else{
                n2 = n3;
                n3 = n4;
                n4 = n5;
                n5 = 0;
            }

            n1 = num(l1);

            weight = n1 + 2 * n2 + 3 * n3 + 4 * n4 + 5 * n5;

            if(weight >= firstNumber && weight <= lastNumber){
                System.out.print(myArray[z] + " ");
                noSpecialLetters = false;
            }
        }

        if(noSpecialLetters == true){
            System.out.println("No");
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int firstNumber = Integer.parseInt(input.nextLine());
//        int lastNumber = Integer.parseInt(input.nextLine());
//
//        String[] myArray = new String[3125];
//
//        int n1 = 0;
//        int n2 = 0;
//        int n3 = 0;
//        int n4 = 0;
//        int n5 = 0;
//
//        int counter = 0;
//        double weight = 0.0;
//        boolean noSpecialLetters = true;
//
//        for (char i = 'a'; i <= 'e'; i++) {
//            for (char j = 'a'; j <= 'e'; j++) {
//                for (char k = 'a'; k <= 'e'; k++) {
//                    for (char l = 'a'; l <= 'e'; l++) {
//                        for (char m = 'a'; m <= 'e'; m++) {
//                            //System.out.printf("%c%c%c%c%c ", i, j, k, l, m);
//
//                            String letters = "" + i + j + k + l + m;
//                            myArray[counter] = letters;
//                            counter++;
//                        }
//                    }
//                }
//            }
//        }
//
//        for(int z = 0; z < 3125; z++){
//            String letters = myArray[z];
//
//            char l1 = letters.charAt(0);
//            char l2 = letters.charAt(1);
//            char l3 = letters.charAt(2);
//            char l4 = letters.charAt(3);
//            char l5 = letters.charAt(4);
//
//            if(l5 != l4 && l5 != l3 && l5 != l2 && l5 != l1){
//                switch (l5){
//                    case 'a':{
//                        n5 = 5;
//                        break;
//                    }
//                    case 'b':{
//                        n5 = -12;
//                        break;
//                    }
//                    case 'c':{
//                        n5 = 47;
//                        break;
//                    }
//                    case 'd':{
//                        n5 = 7;
//                        break;
//                    }
//                    case 'e':{
//                        n5 = -32;
//                        break;
//                    }
//                }
//            }
//            else{
//                n5 = 0;
//            }
//
//            if(l4 != l3 && l4 != l2 && l4 != l1){
//                switch (l4){
//                    case 'a':{
//                        n4 = 5;
//                        break;
//                    }
//                    case 'b':{
//                        n4 = -12;
//                        break;
//                    }
//                    case 'c':{
//                        n4 = 47;
//                        break;
//                    }
//                    case 'd':{
//                        n4 = 7;
//                        break;
//                    }
//                    case 'e':{
//                        n4 = -32;
//                        break;
//                    }
//                }
//            }
//            else{
//                n4 = n5;
//                n5 = 0;
//            }
//
//            if(l3 != l2 && l3 != l1){
//                switch (l3){
//                    case 'a':{
//                        n3 = 5;
//                        break;
//                    }
//                    case 'b':{
//                        n3 = -12;
//                        break;
//                    }
//                    case 'c':{
//                        n3 = 47;
//                        break;
//                    }
//                    case 'd':{
//                        n3 = 7;
//                        break;
//                    }
//                    case 'e':{
//                        n3 = -32;
//                        break;
//                    }
//                }
//            }
//            else{
//                n3 = n4;
//                n4 = n5;
//                n5 = 0;
//            }
//
//            if(l2 != l1){
//                switch (l2){
//                    case 'a':{
//                        n2 = 5;
//                        break;
//                    }
//                    case 'b':{
//                        n2 = -12;
//                        break;
//                    }
//                    case 'c':{
//                        n2 = 47;
//                        break;
//                    }
//                    case 'd':{
//                        n2 = 7;
//                        break;
//                    }
//                    case 'e':{
//                        n2 = -32;
//                        break;
//                    }
//                }
//            }
//            else{
//                n2 = n3;
//                n3 = n4;
//                n4 = n5;
//                n5 = 0;
//            }
//
//            switch (l1){
//                case 'a':{
//                    n1 = 5;
//                    break;
//                }
//                case 'b':{
//                    n1 = -12;
//                    break;
//                }
//                case 'c':{
//                    n1 = 47;
//                    break;
//                }
//                case 'd':{
//                    n1 = 7;
//                    break;
//                }
//                case 'e':{
//                    n1 = -32;
//                    break;
//                }
//            }
//
//            weight = n1 + 2 * n2 + 3 * n3 + 4 * n4 + 5 * n5;
//
//            if(weight >= firstNumber && weight <= lastNumber){
//                System.out.print(myArray[z] + " ");
//                noSpecialLetters = false;
//            }
//        }
//
//        if(noSpecialLetters == true){
//            System.out.println("No");
//        }
//    }