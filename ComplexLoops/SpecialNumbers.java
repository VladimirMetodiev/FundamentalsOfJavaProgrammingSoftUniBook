package ComplexLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int divisor1 = 0;
        int divisor2 = 0;
        int divisor3 = 0;
        int divisor4 = 0;

        for (int i = 1111; i <= 9999; i++) {
            try{
                divisor1 = i % 10;
                divisor2 = (i / 10) % 10;
                divisor3 = (i / 100) % 10;
                divisor4 = (i / 1000) % 10;
                if(number % divisor1 == 0 && number % divisor2 == 0 && number % divisor3 == 0 && number % divisor4 == 0){
                    System.out.printf("%d ", i);
                }
            }
            catch (Exception ex){

            }
        }
    }
}
