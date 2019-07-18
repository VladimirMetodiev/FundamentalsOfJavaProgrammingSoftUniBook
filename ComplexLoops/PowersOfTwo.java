package ComplexLoops;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for (int a = 0; a <= num; a++) {
            int b = (int)Math.pow(2, a);
            System.out.println(b);
        }
    }
}
