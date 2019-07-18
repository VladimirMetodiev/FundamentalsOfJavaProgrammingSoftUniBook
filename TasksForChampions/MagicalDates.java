package TasksForChampions;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class MagicalDates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int startYear = Integer.parseInt(input.nextLine());
        int endYear = Integer.parseInt(input.nextLine());
        int magicWeight = Integer.parseInt(input.nextLine());

        LocalDate firstDate = LocalDate.of(startYear, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(endYear, Month.DECEMBER, 31);
        boolean noMagicDates = true;
        LocalDate currentDate = firstDate;

        while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
            int dD1 = currentDate.getDayOfMonth() / 10;
            int dD2 = currentDate.getDayOfMonth() % 10;
            int dM1 = currentDate.getMonthValue() / 10;
            int dM2 = currentDate.getMonthValue() % 10;
            int dY1 = (currentDate.getYear() / 1000) % 10;
            int dY2 = (currentDate.getYear() / 100) % 10;
            int dY3 = (currentDate.getYear() / 10) % 10;
            int dY4 = (currentDate.getYear() / 1) % 10;

            int[] numbers = {dD1, dD2, dM1, dM2, dY1, dY2, dY3, dY4};

            int weight = 0;

            for (int i = 0; i < numbers.length; i++){
                for (int j = (i + 1); j < numbers.length; j++){
                    weight += numbers[i] * numbers[j];
                }
            }

            if (weight == magicWeight){
                System.out.printf("%1$td-%1$tm-%1tY%n", currentDate);
                noMagicDates = false;
            }

            currentDate = currentDate.plusDays(1);
        }

        if (noMagicDates){
            System.out.println("No");
        }
    }
}
