package heranca.fin4l.metodo.test;

import heranca.fin4l.metodo.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabriel", 2500);
        funcionario.calcularBonus();
        funcionario.exibirFicha();
    }
}
