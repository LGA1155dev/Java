package library.of.system.small.repository;

import library.of.system.small.model.Book;

import java.util.ArrayList;

public class BookRepository {
    private Book book;
    ArrayList<Book> b;

    public void save(Book book){
        this.book = book;
    }

    public int findById(){
        return this.book.getId();
    }

    public ArrayList<Book> findAll(){
        return b;
    }
}
