package SimpleConditions;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        int sum = a + b + c;

        if(sum < 10){
            System.out.printf("0:0%d", sum);
        }
        else if(sum >= 10 && sum < 60){
            System.out.printf("0:%d", sum);
        }
        else if(sum == 60){
            System.out.print("1:00");
        }
        else if(sum > 60 && sum < 70){
            System.out.printf("1:0%d", sum % 10);
        }
        else if(sum >= 70 && sum < 120){
            System.out.printf("1:%d", sum - 60);
        }
        else if(sum == 120){
            System.out.print("2:00");
        }
        else if(sum > 120 && sum < 130){
            System.out.printf("2:0%d", sum % 10);
        }
        else if(sum >= 130){
            System.out.printf("2:%d", sum - 120);
        }
    }
}
