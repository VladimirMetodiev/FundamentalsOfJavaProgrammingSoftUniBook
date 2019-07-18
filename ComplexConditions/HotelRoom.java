package ComplexConditions;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.nextLine().toLowerCase();
        int overnightStays = Integer.parseInt(input.nextLine());

        double apartment = 0.0;
        double studio = 0.0;

        if(month.equals("may") || month.equals("october")){
            if(overnightStays <= 7){
                apartment = overnightStays * 65;
                studio = overnightStays * 50;
            }
            else if(overnightStays <= 14){
                apartment = overnightStays * 65;
                studio = overnightStays * 50 * 0.95;
            }
            else if(overnightStays > 14){
                apartment = overnightStays * 65 * 0.9;
                studio = overnightStays * 50 * 0.7;
            }
        }
        else if(month.equals("june") || month.equals("september")){
            if(overnightStays <= 14){
                apartment = overnightStays * 68.7;
                studio = overnightStays * 75.2;
            }
            else if(overnightStays > 14){
                apartment = overnightStays * 68.7 * 0.9;
                studio = overnightStays * 75.2 * 0.8;
            }
        }
        else if(month.equals("july") || month.equals("august")){
            if(overnightStays <= 14){
                apartment = overnightStays * 77;
                studio = overnightStays * 76;
            }
            else if(overnightStays > 14){
                apartment = overnightStays * 77 * 0.9;
                studio = overnightStays * 76;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
