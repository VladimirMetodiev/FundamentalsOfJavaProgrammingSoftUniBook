package ComplexConditions;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float age = Float.parseFloat(input.nextLine());
        String sex = input.nextLine().toLowerCase();

        if(sex.equals("m")){
            if(age >= 16){
                System.out.println("Mr.");
            }
            else{
                System.out.println("Master");
            }
        }
        else if(sex.equals("f")){
            if(age >= 16){
                System.out.println("Ms.");
            }
            else{
                System.out.println("Miss");
            }
        }
    }
}
