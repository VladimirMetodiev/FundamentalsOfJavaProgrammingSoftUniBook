package ComplexConditions;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int examHour = Integer.parseInt(input.nextLine());
        int examMinutes = Integer.parseInt(input.nextLine());
        int hourOfArrival = Integer.parseInt(input.nextLine());
        int minuteOfArrival = Integer.parseInt(input.nextLine());

        int beginning = examHour * 60 + examMinutes;
        int arrival = hourOfArrival * 60 + minuteOfArrival;

        double hours = 0d;
        double minutes = 0d;

        if(beginning == arrival){
            System.out.println("On time");
        }
        else if(beginning > arrival){
            if(beginning - arrival <= 30){
                System.out.println("On time");
                System.out.printf("%d minutes before the start", beginning - arrival);
            }
            else if(beginning - arrival > 30 && beginning - arrival < 60){
                System.out.println("Early");
                System.out.printf("%d minutes before the start", beginning - arrival);
            }
            else if(beginning - arrival >= 60){
                System.out.println("Early");
                minutes = (beginning - arrival) % 60;
                hours = (beginning - arrival - minutes) / 60;
                if(minutes < 10){
                    System.out.printf("%.0f:0%.0f hours before the start", hours, minutes);
                }
                else{
                    System.out.printf("%.0f:%.0f hours before the start", hours, minutes);
                }
            }
        }
        else{
            if(arrival - beginning < 60){
                System.out.println("Late");
                System.out.printf("%d minutes after the start", arrival - beginning);
            }
            else if(arrival - beginning >= 60){
                System.out.println("Late");
                minutes = (arrival - beginning) % 60;
                hours = (arrival - beginning - minutes) / 60;
                if(minutes < 10){
                    System.out.printf("%.0f:0%.0f hours after the start", hours, minutes);
                }
                else{
                    System.out.printf("%.0f:%.0f hours after the start", hours, minutes);
                }
            }
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int examHour = Integer.parseInt(input.nextLine());
//        int examMinutes = Integer.parseInt(input.nextLine());
//        int hourOfArrival = Integer.parseInt(input.nextLine());
//        int minuteOfArrival = Integer.parseInt(input.nextLine());
//
//        if(examHour == hourOfArrival && examMinutes == minuteOfArrival){
//            System.out.println("On time");
//        }
//        else if(examHour == hourOfArrival && examMinutes > minuteOfArrival){
//            if(examMinutes - minuteOfArrival <= 30){
//                System.out.println("On time");
//                System.out.printf("%d minutes before the start", examMinutes - minuteOfArrival);
//            }
//            else if(examMinutes - minuteOfArrival > 30){
//                System.out.println("Early");
//                System.out.printf("%d minutes before the start", examMinutes - minuteOfArrival);
//            }
//        }
//        else if(examHour == hourOfArrival + 1 && examMinutes != minuteOfArrival && (60 - minuteOfArrival + examMinutes) >= 60){
//            System.out.println("Early");
//            if(60 - minuteOfArrival + examMinutes < 70){
//                System.out.printf("1:0%d hours before the start", 10 - examMinutes + minuteOfArrival);
//            }
//            else if(60 - minuteOfArrival + examMinutes >= 70){
//                System.out.printf("1:%d hours before the start", 10 - examMinutes + minuteOfArrival);
//            }
//        }
//        else if(examHour == hourOfArrival + 1 && examMinutes <= minuteOfArrival){
//            if(60 - minuteOfArrival + examMinutes <= 30){
//                System.out.println("On time");
//                if(60 - minuteOfArrival + examMinutes < 10){
//                    System.out.printf("%d minutes before the start", 60 - minuteOfArrival + examMinutes);
//                }
//                else if(60 - minuteOfArrival + examMinutes >= 10){
//                    System.out.printf("%d minutes before the start", 60 - minuteOfArrival + examMinutes);
//                }
//            }
//            else if(60 - minuteOfArrival + examMinutes < 60){
//                System.out.println("Early");
//                System.out.printf("%d minutes before the start", 60 - minuteOfArrival + examMinutes);
//            }
//            else if(minuteOfArrival == examMinutes){
//                System.out.println("Early");
//                System.out.printf("1:0%d hours before the start", examMinutes - minuteOfArrival);
//            }
//        }
//        else if(examHour > hourOfArrival + 1){
//            if(examMinutes > minuteOfArrival){
//                System.out.println("Early");
//                if(examMinutes - minuteOfArrival < 10){
//                    System.out.printf("%d:0%d hours before the start", examHour - hourOfArrival, examMinutes - minuteOfArrival);
//                }
//                else if(examMinutes - minuteOfArrival >= 10){
//                    System.out.printf("%d:%d hours before the start", examHour - hourOfArrival, examMinutes - minuteOfArrival);
//                }
//            }
//            else if(examMinutes <= minuteOfArrival){
//                System.out.println("Early");
//                if(60 - minuteOfArrival + examMinutes < 10){
//                    System.out.printf("%d:0%d hours before the start", examHour - hourOfArrival, examMinutes - minuteOfArrival);
//                }
//                else if(60 - minuteOfArrival + examMinutes >= 10){
//                    System.out.printf("%d:%d hours before the start", examHour - hourOfArrival, examMinutes - minuteOfArrival);
//                }
//            }
//        }
//        else if(examHour == hourOfArrival && examMinutes < minuteOfArrival){
//            System.out.println("Late");
//            System.out.printf("%d minutes after the start", minuteOfArrival - examMinutes);
//        }
//        else if(hourOfArrival > examHour){
//            System.out.println("Late");
//            if(hourOfArrival > examHour + 1 && 60 + minuteOfArrival - examMinutes < 10){
//                System.out.printf("%d:0%d hours after the start", hourOfArrival - examHour , 60 + minuteOfArrival - examMinutes);
//            }
//            else if(hourOfArrival > examHour + 1 && 60 + minuteOfArrival - examMinutes < 60){
//                System.out.printf("%d:%d hours after the start", hourOfArrival - examHour , 60 + minuteOfArrival - examMinutes);
//            }
//            else if(hourOfArrival > examHour + 1 && 60 + minuteOfArrival - examMinutes >= 60){
//                System.out.printf("%d:%d hours after the start", hourOfArrival - examHour + 1, 60 + minuteOfArrival - examMinutes);
//            }
//            else if(60 + minuteOfArrival - examMinutes < 60){
//                System.out.printf("%d minutes after the start", 60 + minuteOfArrival - examMinutes);
//            }
//            else if(60 + minuteOfArrival - examMinutes < 70){
//                System.out.printf("%d:0%d hours after the start", hourOfArrival - examHour, minuteOfArrival - examMinutes);
//            }
//            else if(60 + minuteOfArrival - examMinutes < 120){
//                System.out.printf("%d:%d hours after the start", hourOfArrival - examHour, Math.abs(minuteOfArrival - examMinutes));
//            }
//
//        }
//    }