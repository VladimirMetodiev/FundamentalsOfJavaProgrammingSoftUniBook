package ComplexLoops;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        while (b != 0){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
