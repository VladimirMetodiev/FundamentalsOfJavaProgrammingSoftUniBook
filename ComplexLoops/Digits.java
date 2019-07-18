package ComplexLoops;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int rows = number / 100 + (number / 10) % 10;
        int columns = number / 100 + number % 10;

        int operand1 = number / 100;
        int operand2 = (number / 10) % 10;
        int operand3 = number % 10;
        int result = number;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if(result % 5 == 0){
                    result = result - operand1;
                    System.out.printf("%d ", result);
                }
                else if(result % 3 == 0){
                    result = result - operand2;
                    System.out.printf("%d ", result);
                }
                else{
                    result = result + operand3;
                    System.out.printf("%d ", result);
                }
            }
            System.out.println();
        }
    }
}
