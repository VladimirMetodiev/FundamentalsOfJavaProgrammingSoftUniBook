package SimpleCalculations;

import java.util.Scanner;

public class MoneyForExcursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bitcoin = Integer.parseInt(input.nextLine());
        double yuan = Double.parseDouble(input.nextLine());
        double commission = Double.parseDouble(input.nextLine());

        double sum = ((bitcoin * 1168 / 1.95) + (yuan * 0.15 * 1.76 / 1.95)) * ((100 - commission) / 100);

        System.out.println(sum);
    }
}
