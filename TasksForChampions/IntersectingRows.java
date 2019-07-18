package TasksForChampions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectingRows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = Integer.parseInt(input.nextLine());
        int secondNumber = Integer.parseInt(input.nextLine());
        int thirdNumber = Integer.parseInt(input.nextLine());
        int start = Integer.parseInt(input.nextLine());
        int step = Integer.parseInt(input.nextLine());

        int c = step;
        int firstRow = 0;
        int secondRow = start;

        int counter1 = 2;
        int[] array1 = new int[27];
        array1[0] = firstNumber;
        array1[1] = secondNumber;
        array1[2] = thirdNumber;

        while(firstRow <= 1000000){
            firstRow = firstNumber + secondNumber + thirdNumber;
            counter1++;
            array1[counter1] = firstRow;

            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstRow;
        }

        for(int b = c; b <= 1000000; b += 2){
            step = b;
            for (int i = 1; i <= 2; i++) {
                for (int a = 0; a < 27; a++) {
                    if(secondRow == array1[a]){
                        System.out.println(secondRow);
                        return;
                    }
                }
                secondRow += step;
                if(secondRow >= 1000000){
                    System.out.println("No");
                    return;
                }
            }
        }
    }
}



//a right code

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int firstNumber = Integer.parseInt(input.nextLine());
//        int secondNumber = Integer.parseInt(input.nextLine());
//        int thirdNumber = Integer.parseInt(input.nextLine());
//        int start = Integer.parseInt(input.nextLine());
//        int step = Integer.parseInt(input.nextLine());
//
//
//        int firstRow = 0;
//        int[] array1 = new int[1000000];
//        int counter1 = 0;
//        array1[0] = firstNumber;
//        array1[1] = secondNumber;
//        array1[2] = thirdNumber;
//
//        int secondRow = start;
//        int[] array2 = new int[1000000];
//        array2[0] = start;
//        int counter2 = 0;
//
//
//        for (int i = 3; i <= 1000000; i++) {
//            firstRow = firstNumber + secondNumber + thirdNumber;
//            array1[i] = firstRow;
//            counter1++;
//
//            if(firstRow >= 1000000){
//                break;
//            }
//
//            firstNumber = secondNumber;
//            secondNumber = thirdNumber;
//            thirdNumber = firstRow;
//        }
//
//
//        for (int a = 1; a < 1000000; a++) {
//            secondRow += step;
//            array2[a] = secondRow;
//            counter2++;
//
//            if(a % 2 == 0){
//                step += 2;
//            }
//            if(secondRow >= 1000000) {
//                break;
//            }
//        }
//
//
//        for (int i = 0; i < counter1 + 3; i++) {
//            for (int j = 0; j < counter2 +1; j++) {
//                if(array1[i] == array2[j]){
//                    System.out.println(array1[i]);
//                    return;
//                }
//            }
//        }
//
//
//        System.out.println("No");
//    }
//}




//a wrong code

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int firstNum = input.nextInt();
//        int secondNum = input.nextInt();
//        int thirdNum = input.nextInt();
//        int start = input.nextInt();
//        int step = input.nextInt();
//
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(firstNum);
//        list.add(secondNum);
//        list.add(thirdNum);
//
//        for (int i = 3; i < list.size() + 1; i++) {
//            int tribNum = list.get(i - 3) + list.get(i - 2) + list.get(i - 1);
//            if (tribNum > 1000000) {
//                break;
//            }
//            list.add(tribNum);
//        }
//
//        boolean foundNum = false;
//        int nextStep = 0;
//
//        if (start == list.get(0) || start == list.get(1) || start == list.get(2)) {
//            foundNum = true;
//        }
//        else {
//            while (foundNum == false) {
//                nextStep += step;
//
//                for (int i = 0; i < 2; i++) {
//                    start += nextStep;
//
//                    for (int j = 0; j < list.size(); j++) {
//                        if (start == list.get(j)) {
//                            foundNum = true;
//                            break;
//                        }
//                        if (start < list.get(j)) {
//                            break;
//                        }
//                    }
//
//                    if (foundNum) {
//                        break;
//                    }
//                }
//
//                if (start > 1000000) {
//                    break;
//                }
//            }
//        }
//
//        if (foundNum) {
//            System.out.println(start);
//        }
//        else {
//            System.out.println("No");
//        }
//    }