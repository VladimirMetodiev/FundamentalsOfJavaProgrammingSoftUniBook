package ComplexLoops;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        int counter = 0;
        boolean end = false;

        for (int rows = 1; rows <= number; rows++) {
            if(end == true){
                break;
            }
            for (int columns = 1; columns <= rows; columns++) {
                counter++;
                System.out.print(counter + " ");
                if(counter == number){
                    end = true;
                    break;
                }
            }
            System.out.println();
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = Integer.parseInt(input.nextLine());
//
//        int counter = 0;
//
//        for (int rows = 1; rows <= number; rows++) {
//            for (int columns = 1; columns <= rows; columns++) {
//                counter++;
//                System.out.print(counter + " ");
//                if(counter == number){
//                    return;
//                }
//            }
//            System.out.println();
//        }
//    }