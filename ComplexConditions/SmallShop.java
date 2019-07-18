package ComplexConditions;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String product = input.nextLine().toLowerCase();
        String town = input.nextLine().toLowerCase();
        float quantity = Float.parseFloat(input.nextLine());

        double price = 0.0;

        switch (product){
            case "coffee":{
                switch (town){
                    case "sofia":{
                        price = quantity * 0.5;
                        break;
                    }
                    case "plovdiv":{
                        price = quantity * 0.4;
                        break;
                    }
                    case "varna":{
                        price = quantity * 0.45;
                        break;
                    }
                    default:{
                        break;
                    }
                }
                break;
            }
            case "water":{
                switch (town){
                    case "sofia":{
                        price = quantity * 0.8;
                        break;
                    }
                    case "plovdiv":{
                        price = quantity * 0.7;
                        break;
                    }
                    case "varna":{
                        price = quantity * 0.7;
                        break;
                    }
                    default:{
                        break;
                    }
                }
                break;
            }
            case "beer":{
                switch (town){
                    case "sofia":{
                        price = quantity * 1.2;
                        break;
                    }
                    case "plovdiv":{
                        price = quantity * 1.15;
                        break;
                    }
                    case "varna":{
                        price = quantity * 1.1;
                        break;
                    }
                    default:{
                        break;
                    }
                }
                break;
            }
            case "sweets":{
                switch (town){
                    case "sofia":{
                        price = quantity * 1.45;
                        break;
                    }
                    case "plovdiv":{
                        price = quantity * 1.3;
                        break;
                    }
                    case "varna":{
                        price = quantity * 1.35;
                        break;
                    }
                    default:{
                        break;
                    }
                }
                break;
            }
            case "peanuts":{
                switch (town){
                    case "sofia":{
                        price = quantity * 1.6;
                        break;
                    }
                    case "plovdiv":{
                        price = quantity * 1.5;
                        break;
                    }
                    case "varna":{
                        price = quantity * 1.55;
                        break;
                    }
                    default:{
                        break;
                    }
                }
                break;
            }
            default:{
                break;
            }
        }
        System.out.println(price);
    }
}
