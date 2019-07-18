package ComplexLoops;

import java.util.Scanner;

public class NumbersFrom1ToNWithStep3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        for (int a = 1; a <= number; a += 3){
            System.out.println(a);
        }
    }
}
