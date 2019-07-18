package SimpleCalculations;

import java.util.Scanner;

public class DailyEarnings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nDays = Integer.parseInt(input.nextLine());
        double mDollars = Double.parseDouble(input.nextLine());
        double course = Double.parseDouble(input.nextLine());

        double salary = nDays * mDollars;
        double revenue = salary * 12 + salary * 2.5;
        double tax = revenue * 0.25;
        double netRevenue = revenue - tax;
        double averageDailyNetRevenue = netRevenue / 365;
        double bg = averageDailyNetRevenue * course;

        System.out.printf("%.2f", bg);
    }
}
