package ComplexLoops;

import java.util.Scanner;

public class StopNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int m = Integer.parseInt(input.nextLine());
        int stop = Integer.parseInt(input.nextLine());

        for (int i = m; i >= n; i--) {
            if(i % 2 == 0 && i % 3 == 0){
                if(i == stop){
                    return;
                }
                else{
                    System.out.print(i + " ");
                }
            }
        }
    }
}
