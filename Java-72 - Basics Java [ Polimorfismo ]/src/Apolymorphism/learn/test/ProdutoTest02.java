package Apolymorphism.learn.test;

import Apolymorphism.learn.domain.Computador;
import Apolymorphism.learn.domain.Produto;
import Apolymorphism.learn.domain.Televisao;
import Apolymorphism.learn.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 9950x3d ", 3000);
        System.out.println(produto.getName());
        System.out.println(produto.getValue());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------");

        Produto produto1 = new Tomate("Americano", 4);
        System.out.println(produto1.getName());
        System.out.println(produto1.getValue());
        System.out.println(produto1.calcularImposto());
        System.out.println("--------------------------");

        Produto produto2 = new Televisao("Philips", 5000);
        System.out.println(produto2.getName());
        System.out.println(produto2.getValue());
        System.out.println(produto2.calcularImposto());

    }
}