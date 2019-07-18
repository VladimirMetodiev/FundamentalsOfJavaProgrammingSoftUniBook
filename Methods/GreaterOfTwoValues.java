package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    static int getMax(int num1, int num2){
        if(num1 >= num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    static char getMax(char letter1, char letter2 ){
        if(letter1 >= letter2){
            return letter1;
        }
        else{
            return letter2;
        }
    }

    static String getMax(String word1, String word2 ){
        if(word1.compareTo(word2) >= 0){
            return word1;
        }
        else{
            return word2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine().toLowerCase();

        if(type.equals("int")) {
            int num1 = Integer.parseInt(input.nextLine());
            int num2 = Integer.parseInt(input.nextLine());
            System.out.println(getMax(num1, num2));
        }
        else if(type.equals("char")){
            char letter1 = input.nextLine().charAt(0);
            char letter2 = input.nextLine().charAt(0);
            System.out.println(getMax(letter1, letter2));
        }
        else if(type.equals("string")){
            String word1 = input.nextLine();
            String word2 = input.nextLine();
            System.out.println(getMax(word1, word2));
        }
    }
}
