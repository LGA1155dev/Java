package oop.inicializacao.sequencia.test;

import oop.inicializacao.sequencia.domain.Endereco;
import oop.inicializacao.sequencia.domain.Funcionario;
import oop.inicializacao.sequencia.domain.Pessoa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua dos  palmares");
        Pessoa pessoa = new Pessoa("Gabriel", "266-789-2111-21", endereco.getLocal());
        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Gabriel", 1500);
        funcionario.imprimir();
    }

}
