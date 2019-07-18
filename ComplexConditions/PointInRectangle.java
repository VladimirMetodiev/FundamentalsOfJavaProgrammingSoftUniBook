package ComplexConditions;

import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float x1 = Float.parseFloat(input.nextLine());
        float y1 = Float.parseFloat(input.nextLine());
        float x2 = Float.parseFloat(input.nextLine());
        float y2 = Float.parseFloat(input.nextLine());
        float x = Float.parseFloat(input.nextLine());
        float y = Float.parseFloat(input.nextLine());

        if(x >= x1 && x <= x2 && y >= y1 && y <= y2){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }
}
