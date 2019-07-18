package Methods;

import java.util.Scanner;

public class IntegerToBase {
    static String integerToBase(int number, int base){
        String result = "";

        int num = 0;

        while (number != 0) {
            num = number % base;
            result = num + result;
            number /= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int base = Integer.parseInt(input.nextLine());

        System.out.println(integerToBase(number, base));
    }
}
