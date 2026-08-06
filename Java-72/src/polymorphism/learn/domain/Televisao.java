package polymorphism.learn.domain;

public class Televisao extends Produto {
    public Televisao(String name, double value){
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto");
        return value * 0.5;
    }
}
