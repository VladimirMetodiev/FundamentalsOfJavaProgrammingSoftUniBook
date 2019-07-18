package ComplexConditions;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String filmShowType = input.nextLine().toLowerCase();
        int row = Integer.parseInt(input.nextLine());
        int column = Integer.parseInt(input.nextLine());

        double income = 0d;

        if(filmShowType.equals("premiere")){
            income = row * column * 12d;
        }
        else if(filmShowType.equals("normal")){
            income = row * column * 7.5d;
        }
        else if(filmShowType.equals("discount")){
            income = row * column * 5d;
        }
        System.out.printf("%.2f", income);
    }
}
