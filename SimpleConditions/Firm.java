package SimpleConditions;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int necessaryTime = Integer.parseInt(input.nextLine());
        int days = Integer.parseInt(input.nextLine());
        int labourers = Integer.parseInt(input.nextLine());

        double workDays = days * 0.9;
        double totalTime = workDays * 10 * labourers;
        double remainder = Math.floor(totalTime - necessaryTime);

        if(totalTime >= necessaryTime){
            System.out.printf("Yes!%.0f hours left.", remainder);
        }
        else{
            System.out.printf("Not enough time!%.0f hours needed.", remainder * (-1));
        }
    }
}
