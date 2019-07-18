package SimpleConditions;

import java.util.Scanner;

public class NumberFrom0To9ToText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        String [] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (number <= 9) {
            System.out.println(numbers[number - 1]);
        }
        else{
            System.out.println("number too big");
        }
    }
}
