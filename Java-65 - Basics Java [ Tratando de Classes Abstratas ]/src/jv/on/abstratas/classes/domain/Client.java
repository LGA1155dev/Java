package jv.on.abstratas.classes.domain;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String name;
    private TipoClient tipoClient;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString(){
        return "\nName: " + this.name +
                "\n Type: " + this.tipoClient +
                "\n Payment Type: " + this.tipoPagamento;


    }
}
