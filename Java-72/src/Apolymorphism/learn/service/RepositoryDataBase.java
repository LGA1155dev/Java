package Apolymorphism.learn.service;

import Apolymorphism.learn.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void salvar(){
        System.out.println("Salvando em um Banco de Dados... ");
    }
}
