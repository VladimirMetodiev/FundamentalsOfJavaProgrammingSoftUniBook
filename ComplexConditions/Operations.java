package ComplexConditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = Integer.parseInt(input.nextLine());
        int number2 = Integer.parseInt(input.nextLine());
        String sign = input.nextLine();

        double calculate = 0.0;
        String evenOrOdd = "";
        String result = "";

        DecimalFormat df1 = new DecimalFormat("0");
        DecimalFormat df2 = new DecimalFormat("0.00");

        switch (sign){
            case "+":{
                calculate = number1 + number2;
                if(calculate % 2 == 0){
                    evenOrOdd = "even";
                }
                else{
                    evenOrOdd = "odd";
                }
                result = number1 + " " + sign + " " + number2 + " " + "=" + " " + df1.format(calculate) + " - " + evenOrOdd;
                break;
            }
            case "-":{
                calculate = number1 - number2;
                if(calculate % 2 == 0){
                    evenOrOdd = "even";
                }
                else{
                    evenOrOdd = "odd";
                }
                result = number1 + " " + sign + " " + number2 + " " + "=" + " " + df1.format(calculate) + " - " + evenOrOdd;
                break;
            }
            case "*":{
                calculate = number1 * number2;
                if(calculate % 2 == 0){
                    evenOrOdd = "even";
                }
                else{
                    evenOrOdd = "odd";
                }
                result = number1 + " " + sign + " " + number2 + " " + "=" + " " + df1.format(calculate) + " - " + evenOrOdd;
                break;
            }
            case "/":{
                if(number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }
                else{
                    float num1 = number1;
                    float num2 = number2;
                    calculate = num1 / num2;
                    result = number1 + " " + sign + " " + number2 + " " + "=" + " " + df2.format(calculate);
                }
                break;
            }
            case "%":{
                if(number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }
                else {
                    calculate = number1 % number2;
                    result = number1 + " " + sign + " " + number2 + " " + "=" + " " + df1.format(calculate);
                    break;
                }
            }
            default:{
                break;
            }
        }
        System.out.println(result);
    }
}
