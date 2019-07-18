package SimpleConditions;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String figure = input.nextLine().toLowerCase();

        switch(figure){
            case "square":{
                double a = Double.parseDouble(input.nextLine());
                System.out.printf("%.3f", Math.pow(a, 2));
                break;
            }
            case "rectangle":{
                double b = Double.parseDouble(input.nextLine());
                double c = Double.parseDouble(input.nextLine());
                System.out.printf("%.3f", c * b);
                break;
            }
            case "circle":{
                double r = Double.parseDouble(input.nextLine());
                System.out.printf("%.3f", Math.PI * Math.pow(r, 2));
                break;
            }
            case "triangle":{
                double d = Double.parseDouble(input.nextLine());
                double h = Double.parseDouble(input.nextLine());
                System.out.printf("%.3f", d * h / 2);
                break;
            }
            default:{
                break;
            }
        }
    }
}
