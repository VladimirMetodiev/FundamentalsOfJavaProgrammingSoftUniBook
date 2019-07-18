package SimpleConditions;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int volume = Integer.parseInt(input.nextLine());
        int debit1 = Integer.parseInt(input.nextLine());
        int debit2 = Integer.parseInt(input.nextLine());
        double hours = Double.parseDouble(input.nextLine());

        double howMuchIsFull = (debit1 + debit2) * hours;
        double filling = Math.floor(howMuchIsFull / volume * 100.0);
        double pipe1 = Math.floor(debit1 * hours / howMuchIsFull * 100.0);
        double pipe2 = Math.floor(debit2 * hours / howMuchIsFull * 100.0);

        if(howMuchIsFull <= volume){
            System.out.printf("The pool is %f", filling);
            System.out.print("% full. ");
            System.out.printf("Pipe 1: %f", pipe1);
            System.out.print("%. ");
            System.out.printf("Pipe 2: %f", pipe2);
            System.out.print("%.");
        }
        else{
            System.out.printf("For %f hours the pool overflows with %f liters.", hours, howMuchIsFull - volume);
        }
    }
}
