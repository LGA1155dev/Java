package oop.fin4l.modificador.test;
import oop.fin4l.modificador.domain.Carro;

import java.util.concurrent.ExecutionException;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}