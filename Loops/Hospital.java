package Loops;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int periodOfTime = Integer.parseInt(input.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for(int i = 1; i <= periodOfTime; i++){
            int patients = Integer.parseInt(input.nextLine());

            if(i % 3 == 0 && untreatedPatients > treatedPatients){
                doctors++;
            }

            if(patients > doctors){
                untreatedPatients += patients - doctors;
                treatedPatients += doctors;
            }else {
                treatedPatients += patients;
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}



//a very bad code

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int periodOfTime = Integer.parseInt(input.nextLine());
//
//        int doctors = 7;
//        int treatedPatients = 0;
//        int untreatedPatients = 0;
//        int counter = 0;
//        int treatedForThreeDays = 0;
//        int untreatedForThreeDays = 0;
//
//        for (int i = 1; i <= periodOfTime; i++) {
//            int patients = Integer.parseInt(input.nextLine());
//            counter++;
//            if(counter == 3 && untreatedForThreeDays > treatedForThreeDays){
//                doctors++;
//                counter = 0;
//                treatedForThreeDays = 0;
//                untreatedForThreeDays = 0;
//            }
//
//            if(patients == doctors){
//                treatedPatients += patients;
//                treatedForThreeDays += patients;
//            }
//            else if(patients < doctors){
//                treatedPatients += patients;
//                treatedForThreeDays += patients;
//            }
//            else if(patients > doctors){
//                treatedPatients += doctors;
//                untreatedPatients += (patients - doctors);
//                treatedForThreeDays += doctors;
//                untreatedForThreeDays += (patients - doctors);
//            }
//        }
//
//        System.out.printf("Treated patients: %d.%n", treatedPatients);
//        System.out.printf("Untreated patients: %d.", untreatedPatients);
//    }