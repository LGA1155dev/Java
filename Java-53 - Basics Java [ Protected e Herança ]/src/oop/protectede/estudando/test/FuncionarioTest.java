package oop.protectede.estudando.test;

import oop.protectede.estudando.domain.Funcionario;
import oop.protectede.estudando.domain.Pessoa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", "123-456-789-10", 15);
        Funcionario funcionario = new Funcionario(1500, 2000);
        funcionario.setName("Gabriel");
        funcionario.relatorioPagamento();

    }
}
