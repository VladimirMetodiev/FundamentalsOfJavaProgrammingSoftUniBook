package ComplexLoops;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        while(number < 1 || number > 100){
            System.out.println("Invalid number!");
            number = Integer.parseInt(input.nextLine());
        }

        System.out.printf("The number is: %d", number);
    }
}
