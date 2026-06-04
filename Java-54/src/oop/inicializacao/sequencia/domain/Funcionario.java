package oop.inicializacao.sequencia.domain;

public class Funcionario extends Pessoa{
    private double salary;
    static{
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1" );
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");;
    }

    public Funcionario(String name){
        super(name);
        System.out.println("Dentro do construtor de  Funcionario");
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(this. salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }
}
