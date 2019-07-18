package Methods;

import java.util.Scanner;

public class MinMethod {
    static int compareNumbers(int firstNumber, int secondNumber){
        if(firstNumber >= secondNumber){
            return secondNumber;
        }
        else{
            return firstNumber;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = Integer.parseInt(input.nextLine());

        int counter = 1;

        while(true){
            int number2 = Integer.parseInt(input.nextLine());
            int minimum = compareNumbers(number1, number2);
            number1 = minimum;
            counter++;
            if(counter == 3){
                System.out.println(number1);
                break;
            }
        }
    }
}
