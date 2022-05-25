package Programming.devdojo.javacore.Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type your name");
        String name = input.nextLine();
        System.out.println("Type your age");
        int age = input.nextInt();
        System.out.println("name: "+name);
    }
}
