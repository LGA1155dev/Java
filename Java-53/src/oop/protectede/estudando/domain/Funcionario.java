package oop.protectede.estudando.domain;

public class Funcionario extends Pessoa {
    private double salario;
    private double salarioRecebido;

    public Funcionario(double salario, double salarioRecebido) {
        this.salario = salario;
        this.salarioRecebido = salarioRecebido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(this.salario);
    }

    public void relatorioPagamento () {
        System.out.println("Eu: " + this.name + " recebi " + this.salario + "R$");
    }


    public double getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(double salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }
}
