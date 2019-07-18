package SimpleCalculations;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float sum = Float.parseFloat(input.nextLine());
        String currency1 = input.nextLine().toLowerCase();
        String currency2 = input.nextLine().toLowerCase();

        if(currency1.equals("bgn")){
            if(currency2.equals("usd")){
                double usd = sum / 1.79549;
                System.out.printf("%.2f USD", usd);
            }
            else if(currency2.equals("eur")){
                double eur = sum / 1.95583;
                System.out.printf("%.2f EUR", eur);
            }
            else if(currency2.equals("gbp")){
                double gbp = sum / 2.53405;
                System.out.printf("%.2f GBP", gbp);
            }
        }
        else if(currency1.equals("usd")){
            if(currency2.equals("bgn")){
                double bgn = 1.79549 * sum;
                System.out.printf("%.2f BGN", bgn);
            }
            else if(currency2.equals("eur")){
                double eur = 1.79549 * sum / 1.95583;
                System.out.printf("%.2f EUR", eur);
            }
            else if(currency2.equals("gbp")){
                double gbp = 1.79549 * sum / 2.53405;
                System.out.printf("%.2f GBP", gbp);
            }
        }
        else if(currency1.equals("eur")){
            if(currency2.equals("bgn")){
                double bgn = 1.95583 * sum;
                System.out.printf("%.2f BGN", bgn);
            }
            else if(currency2.equals("usd")){
                double usd = 1.95583 * sum / 1.79549;
                System.out.printf("%.2f USD", usd);
            }
            else if(currency2.equals("gbp")){
                double gbp = 1.95583 * sum / 2.53405;
                System.out.printf("%.2f GBP", gbp);
            }
        }
        else if(currency1.equals("gbp")){
            if(currency2.equals("bgn")){
                double bgn = 2.53405 * sum;
                System.out.printf("%.2f BGN", bgn);
            }
            else if(currency2.equals("usd")){
                double usd = 2.53405 * sum / 1.79549;
                System.out.printf("%.2f USD", usd);
            }
            else if(currency2.equals("eur")){
                double eur = 2.53405 * sum / 1.95583;
                System.out.printf("%.2f EUR", eur);
            }
        }
    }
}
