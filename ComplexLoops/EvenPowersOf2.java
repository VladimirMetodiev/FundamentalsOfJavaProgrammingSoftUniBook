package ComplexLoops;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int a = 0; a <= num; a += 2) {
                System.out.println((int)Math.pow(2, a));
        }
    }
}
