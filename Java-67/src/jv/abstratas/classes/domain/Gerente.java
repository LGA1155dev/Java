package jv.abstratas.classes.domain;

public class Gerente extends Funcionario{
    public Gerente(String name, double salary){
        super(name, salary);
    }

    @Override
    public double calcularBonus(){
        return this.salary = this.salary + (this.salary * 20) / 100;
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimindo...");
    }
}
