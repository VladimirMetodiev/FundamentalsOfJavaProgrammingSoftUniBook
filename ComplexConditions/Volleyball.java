package ComplexConditions;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String year = input.nextLine().toLowerCase();
        int holidays = Integer.parseInt(input.nextLine());
        int weekends = Integer.parseInt(input.nextLine());

        double played = 0d;

        if(year.equals("normal")){
            played = (48 - weekends) * 3 / 4d + holidays * 2 / 3d + weekends;
        }
        else if(year.equals("leap")){
            played = ((48 - weekends) * 3 / 4d + holidays * 2 / 3d + weekends) * 1.15d;
        }
        System.out.printf("%.0f", Math.floor(played));
    }
}
