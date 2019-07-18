package ComplexLoops;

import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter even number: ");
            int number = Integer.parseInt(input.nextLine());
            if(number % 2 == 0){
                System.out.printf("Even number entered: %d", number);
                break;
            }
            else{
                System.out.println("The number is not even.");
            }
        }
    }
}
