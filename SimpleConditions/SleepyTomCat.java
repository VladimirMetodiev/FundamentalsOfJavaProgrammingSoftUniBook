package SimpleConditions;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int holidays = Integer.parseInt(input.nextLine());

        double play = (365 - holidays) * 63 + holidays * 127;
        int hours = (int)(Math.abs(30000 - play) / 60);
        int minutes = (int)(Math.abs(30000 - play) - hours * 60);

        if(play <= 30000){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
        else{
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }
    }
}
