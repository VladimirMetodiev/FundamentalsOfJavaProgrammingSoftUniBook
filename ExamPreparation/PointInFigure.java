package ExamPreparation;

import java.util.Scanner;

public class PointInFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());

        if((x >= 2 && x < 4 && y >= - 3 && y <= 1) || (x >= 4 && x <= 10 && y >= -5 && y <= 3) || (x > 10 && x <= 12 && y >= - 3 && y <= 1)){
            System.out.println("in");
        }
        else{
            System.out.println("out");
        }
    }
}
