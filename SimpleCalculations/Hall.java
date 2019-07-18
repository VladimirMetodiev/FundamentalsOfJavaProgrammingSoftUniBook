package SimpleCalculations;

import java.util.Scanner;

public class Hall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float length = Float.parseFloat(input.nextLine());
        float width = Float.parseFloat(input.nextLine());

        int rows = (int)(100 * length / 120);
        int columns = (int)((100 * width - 100) / 70);
        int countSeats =  rows * columns - 3;

        System.out.println(countSeats);
    }
}



//public class Hall {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        float length = Float.parseFloat(input.nextLine());
//        float width = Float.parseFloat(input.nextLine());
//
//        double rows = Math.floor(length * 100 / 120);
//        double columns = Math.floor((width * 100 - 100) / 70);
//        double countSeats =  rows * columns - 3;
//
//        System.out.println((int)countSeats);
//    }
//}