package ComplexConditions;

import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h = Integer.parseInt(input.nextLine());
        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());

        if(x >  0 && x < 3 * h && y > 0 && y < h || x > h && x < 2 * h && y > 0 && y < 4 * h){
            System.out.println("inside");
        }
        else if((x <  0 || x > 3 * h && y <= 0)  || ((x < 0 || x > 3 * h) && (y > 0 && y <= h)) || (x >= 0 && x <= 3 * h && y < 0)|| (x < h && y > h || x > 2 * h && y > h) || (x >= h && x <= 2 * h && y > 4 * h)){
            System.out.println("outside");
        }
        else if((x > 0 && x < 3 * h && y == 0) || (x == 0 && y >= 0 && y <= h) || (x == 3 * h && y >= 0 && y <= h) || (x > 0 && x < h && y == h) || (x > 2 * h && x < 3 * h && y == h) || (x == h && y >= h && y <= 4 * h) || (x == 2 * h && y >= h && y <= 4 * h) || (x >= h && x <= 2 * h && y == 4 * h)){
            System.out.println("border");
        }
    }
}



//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int h = Integer.parseInt(input.nextLine());
//        int x = Integer.parseInt(input.nextLine());
//        int y = Integer.parseInt(input.nextLine());
//
//        boolean insideRec1 = x > 0 && x < 3 * h && y > 0 && y < h;
//        boolean insideRec2 = x > h && x < 2 * h && y > 0 && y < 4 * h;
//        boolean outsideUp = x < h && y > h
//                || x > 2 * h && y > h
//                || x >= h && x <= 2 * h && y > 4 * h;
//        boolean outsideDown = (x >= 0 && x <= 3 * h && y < 0)
//                || ((x < 0 || x > 3 * h) && y < 0)
//                || (x < 0 && y >= 0 && y <= h)
//                || (x > 3 * h && y >= 0 && y <= h);
//        boolean borderRec1 = x >= 0 && x <= 3 * h && y == 0
//                || x == 0 && y >= 0 && y <= h
//                || x == 3 * h && y >= 0 && y <= h
//                || x > 0 && x < h && y == h
//                || x > 2 * h && x < 3 * h && y == h;
//        boolean borderRec2 = x == h && y >= h && y <= 4 * h
//                || x == 2 * h && y >= h && y <= 4 * h
//                || x > h && x < 2 * h && y == 4 * h;
//
//        if(insideRec1 || insideRec2){
//            System.out.println("inside");
//        }
//        else if(outsideDown || outsideUp){
//            System.out.println("outside");
//        }
//        else if(borderRec1 || borderRec2){
//            System.out.println("border");
//        }
//    }