package heranca.fin4l.metodo.domain;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    protected String name;
    protected double salarioBase;

    public double calcularBonus(){
        return this.salarioBase * 0.10;
    }

    public void exibirFicha(){
        System.out.println("-=-=-=-=    Exibir ficha    -=-=-=-=");
        System.out.println("Nome: " + this.name);
        System.out.println("Salario base: " + this.salarioBase + " R$");
        System.out.println("Bônus:  " + this.calcularBonus() + " R$");
        System.out.println("-=-=-=-=                             -=-=-=-=");
    }
}
