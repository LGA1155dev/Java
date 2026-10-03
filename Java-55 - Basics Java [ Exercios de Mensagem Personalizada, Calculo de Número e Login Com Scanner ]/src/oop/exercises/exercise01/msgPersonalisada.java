package oop.exercises.exercise01;

import java.util.Scanner;

public class msgPersonalisada {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Qual seu nome: ");
            String name = input.nextLine();

            System.out.printf("Olá %s", name);
    }
}
