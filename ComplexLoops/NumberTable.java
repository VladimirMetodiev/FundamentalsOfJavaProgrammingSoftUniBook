package ComplexLoops;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int printedDigit = 0;

        for (int rows = 0; rows < number; rows++) {
            for (int columns = 0; columns < number; columns++) {
                printedDigit = rows + columns +1;
                if(printedDigit > number){
                    printedDigit = 2 * number - printedDigit;
                }
                System.out.printf("%d ", printedDigit);
            }
            System.out.println();
        }
    }
}
