package Apolymorphism.learn.service;
import Apolymorphism.learn.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void salvar(){
        System.out.println("Salvando em memoria... ");
    }
}
