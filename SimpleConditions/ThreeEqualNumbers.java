package SimpleConditions;

import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        if(a == b && a == c){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
