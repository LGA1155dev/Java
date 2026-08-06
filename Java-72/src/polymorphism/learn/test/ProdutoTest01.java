package polymorphism.learn.test;
import polymorphism.learn.domain.Computador;
import polymorphism.learn.domain.Televisao;
import polymorphism.learn.domain.Tomate;
import polymorphism.learn.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador  computador = new Computador("Kit xeon aliexpress", 668.47);
        Tomate tomate = new Tomate("Siciliano", 6);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);

    }
}