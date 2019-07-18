package SimpleCalculations;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
            double area = Math.pow(num, 2);

            System.out.println(area);
            }
            catch(Exception e){
                System.out.println("Error");
            }
    }
}

//Поставих кода в конструкцията try, за да може при въвеждане на нецифрови данни, програмата да дава изход Error и да не се бъгва.


//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        try {
//            double num = input.nextDouble();
//            double area = Math.pow(num, 2);
//
//            System.out.printf("%.2f", area);
//        }
//        catch(Exception e){
//            System.out.println("Error");
//        }
//    }
