package library.of.system.small.services;

import library.of.system.small.model.Book;
import library.of.system.small.model.User;
import library.of.system.small.repository.BookRepository;
import library.of.system.small.repository.UserRepository;

public class LibraryService {
    public static User user;
    public static UserRepository userRepository;
    public static Book book;
    public static BookRepository bookRepository;

    private static void registerUser(){
        if (user.getName().equals(null) || user.getName().equals(" "))
            throw  new RuntimeException("Error, Your name user cannot be null! ");
        userRepository.saveUser(user);
    }

    private static void registerBook(){
        if (book.getTitle().equals(null) || book.equals(" "))
            throw  new IllegalArgumentException("Error, This tittle of the book cannot be null or empty! ");
        bookRepository.save(book);
    }


}
