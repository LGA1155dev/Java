package oop.exercises.exercise02;

import java.util.Scanner;

public class calcNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Um número: ");
        int number1 = input.nextInt();

        System.out.println("Outro número: ");
        int number2 = input.nextInt();

        System.out.printf("A soma é: %d \n", (number1 + number2));
        System.out.printf("A divisao é %f \n", ((float) number1 / number2));
        System.out.printf("A multiplicaçao é %d", (number1 * number2));

    }
}
