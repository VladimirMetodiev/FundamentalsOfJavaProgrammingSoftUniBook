package Methods;

import java.util.Scanner;

public class Hello {
    static void sayHelloTo(String name){
        System.out.printf("Hello, %s!", name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        sayHelloTo(name);
    }
}
