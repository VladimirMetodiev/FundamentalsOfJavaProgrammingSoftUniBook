package ComplexConditions;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = Integer.parseInt(input.nextLine());

        switch(digit){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Error!");
            }
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int digit = Integer.parseInt(input.nextLine());
//
//        String[] myArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//
//        if(digit <= 0 || digit > 7){
//            System.out.println("Error!");
//        }
//
//        for (int i = 0; i < 7; i++) {
//            if(i == digit - 1){
//                System.out.println(myArray[i]);
//            }
//        }
//    }
