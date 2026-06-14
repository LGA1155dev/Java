package fin4l.referencia.tipo.domain;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Comprador {
    private String name;
    private String cpf;

    public void imprimir(){
        System.out.println("--=-=-=-=-- EXIBIR --=-=-=-=--");
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("-=-=-=-=                        -=-=-=-=");
    }
}