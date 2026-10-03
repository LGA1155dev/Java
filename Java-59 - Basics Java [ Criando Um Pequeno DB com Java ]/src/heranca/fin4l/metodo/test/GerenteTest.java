package heranca.fin4l.metodo.test;

import heranca.fin4l.metodo.domain.Gerente;

public class GerenteTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1500);
        gerente.calcularBonus();
        gerente.exibirFicha();
    }
}
