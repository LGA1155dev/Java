package Bpolymorphism.learn.domain;

import java.util.Scanner;

public class CreateBook {
    public String name;
    public String author;
    public int totalPages;


    public String createBook(String name, String author, int totalPages){
        Scanner input = new Scanner(System.in);
        System.out.println("Book name: ");
        name = input.nextLine();

        System.out.println("Book of Author: ");
        author = input.nextLine();

        System.out.println("Total number of pages: ");
       totalPages = input.nextInt();

       this.name = name;
       this.author = author;
       this.totalPages = totalPages;

        return "Book create successful";
    }
}
