package Bpolymorphism.learn.service;
import Bpolymorphism.learn.domain.CreateBook;
import java.util.Scanner;

public class BookService {
    public void relatorioLivro(){
        System.out.println("Criando relatorio da criação do livro...");
        CreateBook createBook = new CreateBook();
        System.out.print("Você deseja cadastrar livros? [ S/N ]: ");
        Scanner input = new Scanner(System.in); String response = input.nextLine().toUpperCase();
        if (response.equals("S")){
            System.out.print("Name: ");
            createBook.name = input.nextLine();

            System.out.print("Author: ");
            createBook.author = input.nextLine();

            System.out.print("total number of pages: ");
            createBook.totalPages = input.nextInt();

            System.out.println("Livro criado com sucesso!");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=--==-=-=-=-=-");

            System.out.println("Nome Livro Criado: " + createBook.name);
            System.out.println("Author Livro: " + createBook.author);
            System.out.println("Número de Paginas: " + createBook.totalPages);
        } else {
            System.out.println("Sinto muito, não consegumos criar o livro! ):");
        }
    }
}