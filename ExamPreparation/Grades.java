package ExamPreparation;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(input.nextLine());

        double counter1 = 0.0;
        double counter2 = 0.0;
        double counter3 = 0.0;
        double counter4 = 0.0;
        double results = 0.0;

        for(int a = 1; a <= numberOfStudents; a++){
            double grade = Double.parseDouble(input.nextLine());
            results += grade;
            if(grade < 3){
                counter1++;
            }
            else if(grade <= 3.99){
                counter2++;
            }
            else if(grade <= 4.99){
                counter3++;
            }
            else if(grade >= 5){
                counter4++;
            }
        }

        counter1 = counter1 / numberOfStudents * 100;
        counter2 = counter2 / numberOfStudents * 100;
        counter3 = counter3 / numberOfStudents * 100;
        counter4 = counter4 / numberOfStudents * 100;
        results = results / numberOfStudents;

        System.out.printf("Top students: %.2f%%%n", counter4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", counter3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", counter2);
        System.out.printf("Fail: %.2f%%%n", counter1);
        System.out.printf("Average: %.2f", results);
    }
}
