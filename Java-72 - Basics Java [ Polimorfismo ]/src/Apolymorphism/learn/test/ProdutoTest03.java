package Apolymorphism.learn.test;

import Apolymorphism.learn.domain.Computador;
import Apolymorphism.learn.domain.Produto;
import Apolymorphism.learn.domain.Tomate;
import Apolymorphism.learn.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 9950x3d ", 3000);

        Tomate tomate = new Tomate("Americano", 4);
        CalculadoraImposto.calcularImposto(tomate);
    }
}