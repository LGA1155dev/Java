package jv.abstratas.classes.test;
import jv.abstratas.classes.domain.DevBackEnd;
import jv.abstratas.classes.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        DevBackEnd devBackEnd  = new DevBackEnd("Felipe Deschamps", 20000);
        devBackEnd.calcularBonus();
        System.out.println(devBackEnd);
        Gerente gerente = new Gerente("Eu mesmo", 1400);
        gerente.imprimir();
        devBackEnd.imprimir();
    }
}
