package oop.enumeracao.introducao.domain;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Cliente {
    private String name;
    private TipoCliente tipoCliente;

    @Override
    public String toString(){
        return this.name +  ": "+ this.tipoCliente;
    }
}