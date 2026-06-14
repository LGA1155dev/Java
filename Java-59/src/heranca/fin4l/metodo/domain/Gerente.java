package heranca.fin4l.metodo.domain;
import heranca.fin4l.metodo.domain.Funcionario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Gerente extends  Funcionario{
    private double gratificacao;

    @Override
    public double calcularBonus(){
        return salarioBase * 0.20;
    }

    @Override
    public  void exibirFicha(){
        System.out.println("-=-=-=-=    Exibir ficha    -=-=-=-=");
        System.out.println("Nome: " +  this.name);
        System.out.println("Salario Base: " + this.salarioBase);
        System.out.println(this.calcularBonus());
    }

}
