package ComplexLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        int fib1 = 1;
        int fib2 = 1;
        int newCalculation = 0;

        for (int i = 1; i < n; i++) {
            newCalculation = fib1 + fib2;
            fib1 = fib2;
            fib2 = newCalculation;
        }

        System.out.println(fib2);
    }
}
