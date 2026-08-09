 package Apolymorphism.learn.service;
 import Apolymorphism.learn.repository.Repository;

 public class RepositoryFile implements Repository {
    @Override
     public void salvar(){
        System.out.println("Salvando em um arquivo... ");
    }
}
