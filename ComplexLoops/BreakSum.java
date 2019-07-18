package ComplexLoops;

import java.util.Scanner;

public class BreakSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int a = 1; a <= 3; a++){
                for(int b = 3; b >= 1; b--){
                    if(a + b == 2){
                        return;
                    }
                    System.out.printf("%d %d%n", a, b);
                }
        }
    }
}



//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        boolean end = false;
//
//        for(int a = 1; a <= 3; a++){
//            if(end = true){
//                for(int b = 3; b >= 1; b--){
//                    if(a + b == 2){
//                        end = true;
//                        break;
//                    }
//                    System.out.printf("%d %d%n", a, b);
//                }
//                break;
//            }
//        }
//    }