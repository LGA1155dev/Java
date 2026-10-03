package jv.on.abstratas.classes.test;

import jv.on.abstratas.classes.domain.Funcionario;
import jv.on.abstratas.classes.domain.GameDeveloper;
import jv.on.abstratas.classes.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Oliver Tree", 9999999);
        GameDeveloper gameDeveloper = new GameDeveloper("Oliver One", 999);
        System.out.println(gerente);
        System.out.println(gameDeveloper);
    }
}
