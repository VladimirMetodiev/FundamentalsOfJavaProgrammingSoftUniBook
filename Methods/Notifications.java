package Methods;

import java.util.Scanner;

public class Notifications {
    static void readAndProcessMessage(String messageType, String operation, String message, int errorCode){
        switch (messageType){
            case "success":{
                showSuccessMessage(operation, message);
                break;
            }
            case "warning":{
                showWarningMessage(message);
                break;
            }
            case "error":{
                showErrorMessage(operation, message, errorCode);
                break;
            }
            default:{
                break;
            }
        }
    }

    static void showSuccessMessage(String operation, String message){
        String expression = "Successfully executed " + operation + ".";
        System.out.println(expression);
        for (int i = 0; i < expression.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println(message + ".");
        System.out.println();
    }

    static void showWarningMessage(String message){
        String expression = "Warning: " + message + ".";
        System.out.println(expression);
        for (int i = 0; i < expression.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println();
    }

    static void showErrorMessage(String operation, String message, int errorCode){
        String expression = "Error: Failed to execute " + operation + ".";
        System.out.println(expression);
        for (int i = 0; i < expression.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Reason: " + message + ".");
        System.out.println("Error code: " + errorCode + ".");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfMessages = Integer.parseInt(input.nextLine());

        String operation = " ";
        String message = " ";
        int errorCode = 0;

        for (int i = 1; i <= countOfMessages; i++) {
            String messageType = input.nextLine().toLowerCase();
            switch (messageType){
                case "success":{
                    operation = input.nextLine();
                    message = input.nextLine();
                    break;
                }
                case "warning":{
                    message = input.nextLine();
                    break;
                }
                case "error":{
                    operation = input.nextLine();
                    message = input.nextLine();
                    errorCode = Integer.parseInt(input.nextLine());
                    break;
                }
                default:{
                    break;
                }
            }
            readAndProcessMessage(messageType, operation, message, errorCode);
        }

    }
}
