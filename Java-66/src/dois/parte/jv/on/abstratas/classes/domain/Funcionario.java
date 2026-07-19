package dois.parte.jv.on.abstratas.classes.domain;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Funcionario {
    protected String name;
    protected double salary;

    @Override
    public String toString(){
        return "name: " +
                this.name +
                "\n salary: " +
                this.salary;
    }

    public double calcBonus(){
                double valor;
                valor = (salary * 10) / 100;
                return valor;
    }
}
