package ExamPreparation;

import java.util.Scanner;

public class DateAfterFiveDays {
    static int a(int day){
        int d = day + 5;
        return d;
    }
    static int b(int month){
        int m = month + 1;
        return m;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = Integer.parseInt(input.nextLine());
        int month = Integer.parseInt(input.nextLine());

        if(month == 2){
            if(day > 23){
                System.out.printf("%d.0%d", a(day) - 28, b(month));
            }
            else{
                System.out.printf("%d.0%d", day + 5, month);
            }
        }

        else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 25){
                if(month == 4 || month == 6){
                    System.out.printf("%d.0%d", a(day) - 30, b(month));
                }
                else if(month == 9 || month == 11){
                    System.out.printf("%d.%d", a(day) - 30, b(month));
                }
            }
            else{
                if(month == 4 || month == 6 || month == 9){
                    System.out.printf("%d.0%d", day + 5, month);
                }
                else if(month == 11){
                    System.out.printf("%d.%d", day + 5, month);
                }
            }
        }

        else{
            if(day > 26){
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8){
                    System.out.printf("%d.0%d", a(day) - 31, b(month));
                }
                else if(month == 10){
                    System.out.printf("%d.%d", a(day) - 31, b(month));
                }
                else if(month == 12){
                    System.out.printf("%d.01", a(day) - 31);
                }
            }
            else{
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8){
                    System.out.printf("%d.0%d", day + 5, month);
                }
                else if(month == 10 || month == 12){
                    System.out.printf("%d.%d", day + 5, month);
                }
            }
        }
    }
}
