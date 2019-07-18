package Methods;

import java.util.Scanner;

public class NthDigit {
    static void getDigit(int number, int index){
        int digit = 0;
        int counter = 0;

        do{
            counter++;
            if(counter == index){
                digit = number % 10;
                System.out.println(digit);
                break;
            }
            else{
                number /= 10;
            }
        }while(number != 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int index = input.nextInt();

        getDigit(number, index);
    }
}
