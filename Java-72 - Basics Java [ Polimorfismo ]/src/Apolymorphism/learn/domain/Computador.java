package Apolymorphism.learn.domain;

public class Computador extends  Produto {
    public static final double IMPOSTO = 0.21;

    public Computador(String name, double value){
        super(name, value);
    }

    @Override
    public double calcularImposto(){
        System.out.println("Calculando Imposto ...");
        return this.value * IMPOSTO;
    }
}
