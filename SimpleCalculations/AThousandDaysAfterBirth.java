package SimpleCalculations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AThousandDaysAfterBirth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String startDate = input.nextLine();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(startDate,formatter);

        date = date.plusDays(1000);

        System.out.println(formatter.format(date));
    }
}

//Текущата дата я въвеждаш в конзолата като поредица от цифри, но за програмата тя не е дата, дори не е и число,
// защото е декларирана като String с името date. За да бъде разпознат от програмата като дата, този стринг трябва да
// бъде парснат като дата чрез класа LocalDate. Това става като създаваш датата localDate, която е равна на
// парснатия стринг date.
//LocalDate localDate = LocalDate.parse(date,formatter);
//Датата обаче може да има различен формат и преди това чрез класа DateTimeFormate, задаваш искания в условието на
// задачата формат.
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//След като вече имаш текуща дата, с желания формат и програмата я разпознава като дата от календара, можеш да
// създадеш нова дата result, като към текущата localDate добавиш, колкото искаш дни.
//LocalDate result = localDate.plusDays(999);