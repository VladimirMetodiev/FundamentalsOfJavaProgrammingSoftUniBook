package SimpleConditions;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        if(a > b){
            System.out.println(a);
        }
        else if(a < b){
            System.out.println(b);
        }
        else {
            System.out.println("No winner!");
        }
    }
}
