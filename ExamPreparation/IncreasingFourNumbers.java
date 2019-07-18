package ExamPreparation;

import java.util.Scanner;

public class IncreasingFourNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        for(int w = a; w <= b; w++){
            for (int x = a; x <= b; x++) {
                for (int y = a; y <= b; y++) {
                    for (int z = a; z <= b; z++) {
                        if(a <= w && w < x && x < y && y < z && z <= b){
                            System.out.printf("%d %d %d %d%n", w, x, y, z);
                        }
                    }
                }
            }
        }

        if(b - a < 3){
            System.out.println("No");
        }
    }
}
