package Methods;

import java.util.Scanner;

public class StringRepeater {
    static void repeatString(String vocable, int number){
        for (int i = 1; i <= number; i++) {
            System.out.print(vocable);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int count = input.nextInt();

        repeatString(word, count);
    }
}
