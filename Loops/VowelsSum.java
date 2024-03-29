package Loops;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter){
                case 'a':{
                    sum += 1;
                    break;
                }
                case 'e':{
                    sum += 2;
                    break;
                }
                case 'i':{
                    sum += 3;
                    break;
                }
                case 'o':{
                    sum += 4;
                    break;
                }
                case 'u':{
                    sum += 5;
                    break;
                }
                default:{
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
