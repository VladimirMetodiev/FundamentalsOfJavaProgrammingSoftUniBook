package ComplexConditions;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());

        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());

        double x = Double.parseDouble(input.nextLine());
        double y = Double.parseDouble(input.nextLine());

        if(((x1 - x == 0 || x2 - x == 0) && (y>=y1 && y<=y2)) || ((y1 - y == 0 || y2 - y == 0) && (x>=x1 && x<=x2))){
            System.out.println("Border");
        }
        else{
            System.out.println("Inside / Outside");
        }
    }
}
