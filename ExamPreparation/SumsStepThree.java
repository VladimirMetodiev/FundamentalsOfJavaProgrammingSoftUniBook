package ExamPreparation;

import java.util.Scanner;

public class SumsStepThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 1; i <= number; i++) {
            int digit = Integer.parseInt(input.nextLine());
            if(i % 3 == 1){
                sum1 += digit;
            }
            else if(i % 3 == 2){
                sum2 += digit;
            }
            else if(i % 3 == 0){
                sum3 += digit;
            }
        }

        System.out.printf("sum1 = %d%n", sum1);
        System.out.printf("sum2 = %d%n", sum2);
        System.out.printf("sum3 = %d", sum3);
    }
}
