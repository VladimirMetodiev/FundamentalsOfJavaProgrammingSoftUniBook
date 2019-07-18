package ComplexLoops;

import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int digit = 0;
        int product = 1;

        for (int i = 111110; i <= 999999; i++) {
            digit = i;
            for (int j = 1; j <= 6; j++) {
                product = product * (digit % 10);
                digit = digit / 10;
            }
            if(number == product){
                System.out.print(i + " ");
            }
            product = 1;
        }
    }
}
