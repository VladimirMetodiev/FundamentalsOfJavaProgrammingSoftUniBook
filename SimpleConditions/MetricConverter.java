package SimpleConditions;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = Double.parseDouble(input.nextLine());
        String inputMeasure = input.nextLine().toLowerCase();
        String outputMeasure = input.nextLine().toLowerCase();

        String [] measure = { "m", "mm", "cm", "mi", "in", "km", "ft", "yd"};
        double [] amount = {1, 1000, 100, 0.000621371192, 39.3700787, 0.001, 3.2808399, 1.0936133};

        if(inputMeasure.equals("m")){
            for (int i = 0; i < 8; i++) {
                if(outputMeasure.equals(measure[i])){
                    System.out.printf("%f", number * amount[i]);
                }
            }
        }
        else if(!inputMeasure.equals("m") && outputMeasure.equals("m")){
            for (int i = 0; i < 8; i++) {
                if(inputMeasure.equals(measure[i])){
                    System.out.printf("%f", number / amount[i]);
                }
            }
        }
        else if(!inputMeasure.equals("m") && !outputMeasure.equals("m")){
            for (int i = 0; i < 8; i++) {
                if(inputMeasure.equals(measure[i])){
                    for (int j = 0; j < 8; j++) {
                        if(outputMeasure.equals(measure[j])){
                            System.out.printf("%f", number / amount[i] * amount[j]);
                        }
                    }
                }
            }
        }
    }
}
