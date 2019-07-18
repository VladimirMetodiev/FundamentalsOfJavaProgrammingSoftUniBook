package Methods;

import java.util.Scanner;

public class WritingOfNumbersWithWords {
    static void writingOfNum(int number){
        int digit1 = 0, digit2 = 0, digit3 = 0;
        String minus = "";

        if(number < 0){
            minus = "minus ";
        }

        number = Math.abs(number);
        digit1 = number % 10;
        number /= 10;
        digit2 = number % 10;
        number /= 10;
        digit3 = number % 10;
        number /= 10;

        if(number > 0 && !minus.equals("minus ")){
            System.out.println("too large");
            return;
        }
        else if(number > 0 && minus.equals("minus ")){
            System.out.println("too small");
            return;
        }

        String numberWithWord = "";

        if(minus.equals("minus ")){
            System.out.print("minus ");
        }

        if(digit1 == 0 && digit2 == 0 && digit3 == 0){
            System.out.println("zero");
            return;
        }

        if(digit3 > 0 && digit2 == 0 && digit1 == 0){
            numberWithWord = writeHundreds(digit3);
        }
        else if(digit3 > 0){
            numberWithWord = writeHundreds(digit3) + " and ";
        }

        if(digit2 > 1){
            numberWithWord = numberWithWord + writeTwentyNinety(digit2);
        }

        if(digit1 == 0 && digit2 == 1){
            numberWithWord = numberWithWord + "ten";
        }

        if(digit1 > 0 && digit2 == 1){
            numberWithWord = numberWithWord + writeTen(digit1);
        }
        else if(digit1 > 0 && digit2 != 1){
            numberWithWord = numberWithWord + writeOne(digit1);
        }

        if(digit3 == 0){
            System.out.println();
        }
        else{
            System.out.println(numberWithWord);
        }
    }

    static String writeOne(int fromOneToNine){
        String word = " ";
        switch (fromOneToNine){
            case 1:{
                word = "one";
                break;
            }
            case 2:{
                word = "two";
                break;
            }
            case 3:{
                word = "three";
                break;
            }
            case 4:{
                word = "four";
                break;
            }
            case 5:{
                word = "five";
                break;
            }
            case 6:{
                word = "six";
                break;
            }
            case 7:{
                word = "seven";
                break;
            }
            case 8:{
                word = "eight";
                break;
            }
            case 9:{
                word = "nine";
                break;
            }
        }
        return word;
    }

    static String writeTen(int fromTenToTwenty){
        String word = " ";
        switch (fromTenToTwenty){
            case 1:{
                word = "eleven";
                break;
            }
            case 2:{
                word = "twelve";
                break;
            }
            case 3:{
                word = "thirteen";
                break;
            }
            case 4:{
                word = "fourteen";
                break;
            }
            case 5:{
                word = "fifteen";
                break;
            }
            case 6:{
                word = "sixteen";
                break;
            }
            case 7:{
                word = "seventeen";
                break;
            }
            case 8:{
                word = "eighteen";
                break;
            }
            case 9:{
                word = "nineteen";
                break;
            }
        }
        return word;
    }

    static String writeTwentyNinety(int twentyNinety){
        String word = " ";
        switch (twentyNinety){
            case 1:{
                word = "ten ";
                break;
            }
            case 2:{
                word = "twenty ";
                break;
            }
            case 3:{
                word = "thirty ";
                break;
            }
            case 4:{
                word = "forty ";
                break;
            }
            case 5:{
                word = "fifty ";
                break;
            }
            case 6:{
                word = "sixty ";
                break;
            }
            case 7:{
                word = "seventy ";
                break;
            }
            case 8:{
                word = "eighty ";
                break;
            }
            case 9:{
                word = "ninety ";
                break;
            }
        }
        return word;
    }

    static String writeHundreds(int hundred){
        String word = " ";
        switch (hundred){
            case 1:{
                word = "one-hundred";
                break;
            }
            case 2:{
                word = "two-hundred";
                break;
            }
            case 3:{
                word = "three-hundred";
                break;
            }
            case 4:{
                word = "four-hundred";
                break;
            }
            case 5:{
                word = "five-hundred";
                break;
            }
            case 6:{
                word = "six-hundred";
                break;
            }
            case 7:{
                word = "seven-hundred";
                break;
            }
            case 8:{
                word = "eight-hundred";
                break;
            }
            case 9:{
                word = "nine-hundred";
                break;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int workingNumber = Integer.parseInt(input.nextLine());

        while(workingNumber > 0){
            int number = Integer.parseInt(input.nextLine());
            writingOfNum(number);
            workingNumber--;
        }
    }
}



//    static void writingOfNum(int number){
//        int digit1 = 0, digit2 = 0, digit3 = 0;
//        String minus = "";
//
//        if(number < 0){
//            minus = "minus ";
//        }
//
//        number = Math.abs(number);
//        digit1 = number % 10;
//        number /= 10;
//        digit2 = number % 10;
//        number /= 10;
//        digit3 = number % 10;
//        number /= 10;
//
//        if(number > 0 && !minus.equals("minus ")){
//            System.out.println("too large");
//            return;
//        }
//        else if(number > 0 && minus.equals("minus ")){
//            System.out.println("too small");
//            return;
//        }
//
//        String numberWithWord = "";
//
//        if(minus.equals("minus ")){
//            System.out.print("minus ");
//        }
//
//        if(digit1 == 0 && digit2 == 0 && digit3 == 0){
//            System.out.println("zero");
//            return;
//        }
//
//        if(digit3 > 0 && digit2 == 0 && digit1 == 0){
//            numberWithWord = writeHundreds(digit3);
//        }
//        else if(digit3 > 0){
//            numberWithWord = writeHundreds(digit3) + " and ";
//        }
//
//        if(digit2 > 1){
//            numberWithWord = numberWithWord + writeTwentyNinety(digit2);
//        }
//
//        if(digit1 == 0 && digit2 == 1){
//            numberWithWord = numberWithWord + "ten";
//        }
//
//        if(digit1 > 0 && digit2 == 1){
//            numberWithWord = numberWithWord + writeTen(digit1);
//        }
//        else if(digit1 > 0 && digit2 != 1){
//            numberWithWord = numberWithWord + writeOne(digit1);
//        }
//
//        System.out.println(numberWithWord);
//    }
//
//    static String writeOne(int fromOneToNine){
//        String word = " ";
//        switch (fromOneToNine){
//            case 1:{
//                word = "one";
//                break;
//            }
//            case 2:{
//                word = "two";
//                break;
//            }
//            case 3:{
//                word = "three";
//                break;
//            }
//            case 4:{
//                word = "four";
//                break;
//            }
//            case 5:{
//                word = "five";
//                break;
//            }
//            case 6:{
//                word = "six";
//                break;
//            }
//            case 7:{
//                word = "seven";
//                break;
//            }
//            case 8:{
//                word = "eight";
//                break;
//            }
//            case 9:{
//                word = "nine";
//                break;
//            }
//        }
//        return word;
//    }
//
//    static String writeTen(int fromTenToTwenty){
//        String word = " ";
//        switch (fromTenToTwenty){
//            case 1:{
//                word = "eleven";
//                break;
//            }
//            case 2:{
//                word = "twelve";
//                break;
//            }
//            case 3:{
//                word = "thirteen";
//                break;
//            }
//            case 4:{
//                word = "fourteen";
//                break;
//            }
//            case 5:{
//                word = "fifteen";
//                break;
//            }
//            case 6:{
//                word = "sixteen";
//                break;
//            }
//            case 7:{
//                word = "seventeen";
//                break;
//            }
//            case 8:{
//                word = "eighteen";
//                break;
//            }
//            case 9:{
//                word = "nineteen";
//                break;
//            }
//        }
//        return word;
//    }
//
//    static String writeTwentyNinety(int twentyNinety){
//        String word = " ";
//        switch (twentyNinety){
//            case 1:{
//                word = "ten ";
//                break;
//            }
//            case 2:{
//                word = "twenty ";
//                break;
//            }
//            case 3:{
//                word = "thirty ";
//                break;
//            }
//            case 4:{
//                word = "forty ";
//                break;
//            }
//            case 5:{
//                word = "fifty ";
//                break;
//            }
//            case 6:{
//                word = "sixty ";
//                break;
//            }
//            case 7:{
//                word = "seventy ";
//                break;
//            }
//            case 8:{
//                word = "eighty ";
//                break;
//            }
//            case 9:{
//                word = "ninety ";
//                break;
//            }
//        }
//        return word;
//    }
//
//    static String writeHundreds(int hundred){
//        String word = " ";
//        switch (hundred){
//            case 1:{
//                word = "one-hundred";
//                break;
//            }
//            case 2:{
//                word = "two-hundred";
//                break;
//            }
//            case 3:{
//                word = "three-hundred";
//                break;
//            }
//            case 4:{
//                word = "four-hundred";
//                break;
//            }
//            case 5:{
//                word = "five-hundred";
//                break;
//            }
//            case 6:{
//                word = "six-hundred";
//                break;
//            }
//            case 7:{
//                word = "seven-hundred";
//                break;
//            }
//            case 8:{
//                word = "eight-hundred";
//                break;
//            }
//            case 9:{
//                word = "nine-hundred";
//                break;
//            }
//        }
//        return word;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int workingNumber = Integer.parseInt(input.nextLine());
//
//        while(workingNumber > 0){
//            int number = Integer.parseInt(input.nextLine());
//            writingOfNum(number);
//            workingNumber--;
//        }
//    }
//}
