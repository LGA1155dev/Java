package fin4l.referencia.tipo.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Carro {
    private  String name;
    public static final double VELOCIDADE_LIMITE ;
    public final Comprador comprador = new Comprador("Gabriel", "255.255.255-10");

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public final void imprimir(){
        System.out.println("-=-=-=-= EXIBIR DADOS -=-=-=-=");
        System.out.println("Vel. Limite: " + Carro.VELOCIDADE_LIMITE);
        System.out.println("Comprador: " + comprador.getName());
        System.out.println("CPF: " + comprador.getCpf());
        System.out.println("-=-=-=-=                             -=-=-=-=");
    }
}
