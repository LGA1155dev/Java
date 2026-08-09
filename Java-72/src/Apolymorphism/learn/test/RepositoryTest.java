package Apolymorphism.learn.test;
import Apolymorphism.learn.repository.Repository;
import Apolymorphism.learn.service.RepositoryDataBase;

import java.util.*;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.salvar();
        List<String> list = new LinkedList<>();

        list.add("Goku");
        list.add("Naruto");
        list.add("Vegeta");

        System.out.println(list);
    }
}
