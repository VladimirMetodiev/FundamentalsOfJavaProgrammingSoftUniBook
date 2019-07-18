package ExamPreparation;

import java.util.Scanner;

public class SumsThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());

        if(a + b == c){
            if(a > b){
                System.out.printf("%d + %d = %d", b, a, c);
            }
            else{
                System.out.printf("%d + %d = %d", a, b, c);
            }
        }
        else  if(a + c == b){
            if(a > c){
                System.out.printf("%d + %d = %d", c, a, b);
            }
            else{
                System.out.printf("%d + %d = %d", a, c, b);
            }
        }
        else if(b + c == a){
            if(b > c){
                System.out.printf("%d + %d = %d", c, b, a);
            }
            else{
                System.out.printf("%d + %d = %d", b, c, a);
            }
        }
        else{
            System.out.println("No");
        }
    }
}
