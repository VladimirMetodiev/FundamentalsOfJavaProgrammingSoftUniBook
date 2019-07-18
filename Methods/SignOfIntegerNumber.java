package Methods;

import java.util.Scanner;

public class SignOfIntegerNumber {
    static void printSign(int a){
        if (a == 0) {
            System.out.printf("The number %d is zero.", a);
        }
        else if(a > 0){
            System.out.printf("The number %d is positive.", a);
        }
        else{
            System.out.printf("The number %d is negative.", a);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        printSign(number);
    }
}
