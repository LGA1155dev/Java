package Bpolymorphism.learn.service;
import Bpolymorphism.learn.repository.BookRepository;

public class RepositoryDataBase implements BookRepository {
    @Override
    public void bookSave(){
        System.out.println("Salvando livro em um Banco de Dados");
    }

}
