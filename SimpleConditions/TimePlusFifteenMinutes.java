package SimpleConditions;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine());

        if(hours == 23 && minutes == 45){
            System.out.println("0:00");
        }
        else if(hours == 23 && minutes > 45 && minutes <= 54){
            System.out.printf("0:0%d", minutes - 45);
        }
        else if(hours == 23 && minutes > 54){
            System.out.printf("0:%d", minutes - 45);
        }
        else if(minutes == 0){
            System.out.printf("%d:%d", hours, minutes + 15);
        }
        else if(minutes < 45){
            System.out.printf("%d:%d", hours, minutes + 15);
        }
        else if(minutes == 45){
            System.out.printf("%d:00", hours + 1);
        }
        else if(minutes > 45 && minutes <= 54){
            System.out.printf("%d:0%d", hours + 1, minutes - 45);
        }
        else if(minutes > 54){
            System.out.printf("%d:%d", hours + 1, minutes - 45);
        }
    }
}
