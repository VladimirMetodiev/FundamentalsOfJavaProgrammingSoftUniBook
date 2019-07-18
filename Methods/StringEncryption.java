package Methods;

import java.util.Scanner;

public class StringEncryption {
    static void encrypt(char letter){
        String asciiCode = "" + (int)letter;
        int length = asciiCode.length();

        int first = 0;
        int divisor = 1;

        for (int i = 1; i <= length; i++) {
            if(i == length){
                first = (int)letter / divisor;
            }
            divisor *= 10;
        }

        int end = (int)letter % 10;

        int beginningCode = (int)letter + end;
        char beginningSymbol = (char)beginningCode;

        int endCode = (int)letter - first;
        char endSymbol = (char)endCode;

        String result = "" + beginningSymbol + first + end + endSymbol;
        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int workingNumber = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= workingNumber; i++) {
            char letter = input.nextLine().charAt(0);
            encrypt(letter);
        }
    }
}
