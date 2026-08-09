package Apolymorphism.learn.test;
import Apolymorphism.learn.domain.Computador;
import Apolymorphism.learn.domain.Tomate;
import Apolymorphism.learn.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador  computador = new Computador("Kit xeon aliexpress", 668.47);
        Tomate tomate = new Tomate("Siciliano", 6);
        tomate.setDataValidade("10/11/2038");
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);


    }
}