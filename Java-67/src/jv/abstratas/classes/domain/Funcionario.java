package jv.abstratas.classes.domain;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Funcionario extends  Pessoa {
    protected String name;
    protected double salary;

    @Override
    public String toString(){
        return "[ Nome Funcionario ]: " + this.name +
                "\n [ Salario do Funcionario ]: " + this.salary +
                "\n [ Salario com Bonus ]: " + calcularBonus();

    }

    public abstract double calcularBonus();

    @Override
    public void imprimir(){
        System.out.println("Imprimindo...");
    }

}
