package enums.metodos.sobreescrita.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Pagamento {
    private TipoPagamento tipoPagamento;

    @Override
    public String toString(){
        return "Tipo pagamento: " + this.tipoPagamento;
    }
}