package polymorphism.learn.domain;
import lombok.Data;

@Data
public class Tomate extends Produto {
    public static final double IMPOSTO = 0.06;
    String dataValidade;

    public Tomate(String name, double value){
        super(name, value);
    }

    @Override
    public double calcularImposto(){
        System.out.println("Calculando Imposto do Tomate ... l");
        return this.value * 0.21;
    }

}