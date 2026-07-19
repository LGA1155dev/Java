package jv.abstratas.classes.domain;


public class DevBackEnd extends  Funcionario{

    public  DevBackEnd(String name, double salary){
        super(name, salary);
    }


    @Override
    public double calcularBonus(){
        return this.salary +  (this.salary * 40) / 100;
    }

    @Override
    public void imprimir() {

    }
}
