package Apolymorphism.learn.service;
import Apolymorphism.learn.domain.Produto;
import Apolymorphism.learn.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Criando relatorio do produto ");
        double imposto = produto.calcularImposto();
        System.out.println(produto.getClass().getSimpleName() + ": " + produto.getName());
        System.out.println("Valor do imposto: " + imposto);
        System.out.println("Valor " + produto.getClass().getSimpleName() + " sem Taxa: " + produto.getValue());
        System.out.println("Valor " + produto.getClass().getSimpleName() + " com Taxa: " + (produto.getValue() + imposto));
        if (produto instanceof Tomate ){
            String dataValidade = ((Tomate) produto).getDataValidade();
        }
        System.out.println("=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-");
    }
}