package enums.metodos.sobreescrita.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String name;
    private int age;
    private TipoCliente tipoCliente;
    public double valor;

    @Override
    public String toString(){
        return "Name: " + this.name +
                "\nAge: " + this.age +
                "\nTipoCliente:  " + tipoCliente;
    }
}
