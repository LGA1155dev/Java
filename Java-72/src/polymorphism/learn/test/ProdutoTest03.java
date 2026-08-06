package polymorphism.learn.test;

import polymorphism.learn.domain.Computador;
import polymorphism.learn.domain.Produto;
import polymorphism.learn.domain.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9 9950x3d ", 3000);

        Tomate tomate = new Tomate("Americano", 4);
        tomate.setDataValidade("10/11/2038");
    }
}