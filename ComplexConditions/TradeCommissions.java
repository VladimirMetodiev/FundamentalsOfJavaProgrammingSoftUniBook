package ComplexConditions;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String town = input.nextLine().toLowerCase();
        float sale = Float.parseFloat(input.nextLine());

        double commission = 0.0;

        if(town.equals("sofia")){
            if(sale >= 0 && sale <= 500){
                commission = sale * 0.05;
            }
            else if(sale > 500 && sale <= 1000){
                commission = sale * 0.07;
            }
            else if(sale > 1000 && sale <= 10000){
                commission = sale * 0.08;
            }
            else if(sale > 10000){
                commission = sale * 0.12;
            }
            else{
                System.out.println("error");
                return;
            }
        }
        else if(town.equals("varna")){
            if(sale >= 0 && sale <= 500){
                commission = sale * 0.045;
            }
            else if(sale > 500 && sale <= 1000){
                commission = sale * 0.075;
            }
            else if(sale > 1000 && sale <= 10000){
                commission = sale * 0.1;
            }
            else if(sale > 10000){
                commission = sale * 0.13;
            }
            else{
                System.out.println("error");
                return;
            }
        }
        else if(town.equals("plovdiv")){
            if(sale >= 0 && sale <= 500){
                commission = sale * 0.055;
            }
            else if(sale > 500 && sale <= 1000){
                commission = sale * 0.08;
            }
            else if(sale > 1000 && sale <= 10000){
                commission = sale * 0.12;
            }
            else if(sale > 10000){
                commission = sale * 0.145;
            }
            else{
                System.out.println("error");
                return;
            }
        }
        else {
            System.out.println("error");
            return;
        }
        System.out.printf("%.2f", commission);
    }
}
