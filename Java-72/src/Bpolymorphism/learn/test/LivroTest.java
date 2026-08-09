package Bpolymorphism.learn.test;

import Bpolymorphism.learn.domain.DomQxt;
import Bpolymorphism.learn.service.BookService;

public class LivroTest {
    public static void main(String[] args) {
        DomQxt domQxt = new DomQxt("Dom Quixote", "Dom Casmurro", 600);
        BookService bookService = new BookService();
        bookService.relatorioLivro();


    }
}
