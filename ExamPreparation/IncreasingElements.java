package ExamPreparation;

import java.util.Scanner;

public class IncreasingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int counter1 = 0;
        int counter2 = 0;
        int num2 = 0;

        for (int i = 1; i <= number; i++) {
            int num1 = Integer.parseInt(input.nextLine());
            if(num1 > num2){
                counter1++;
            }
            else{
                counter1 = 1;
            }
            if(counter2 < counter1){
                counter2 = counter1;
            }
            num2 = num1;
        }
        System.out.println(counter2);
    }
}



//a bad code

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        int counter1 = 0;
//        int counter2 = 0;
//        int num2 = 0;
//
//        for (int i = 1; i <= number; i++) {
//            int num1 = Integer.parseInt(input.nextLine());
//            if(i == 1 || i > 1 && num1 < num2){
//                counter1 = 1;
//            }
//            else if(i > 1 && num1 > num2){
//                counter1++;
//                if(counter2 < counter1){
//                    counter2 = counter1;
//                }
//            }
//            num2 = num1;
//        }
//        System.out.println(counter2);
//    }