package SimpleConditions;

import java.util.Scanner;

public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark = Double.parseDouble(input.nextLine());

        if(mark >= 5.5){
            System.out.println("Excellent!");
        }
        else{
            System.out.println("Not excellent.");
        }
    }
}
