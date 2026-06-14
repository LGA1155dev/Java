package oop.exercises.configuracoes.test;

import oop.exercises.configuracoes.domain.Configs;

public class ConfigsTest {
    public static void main(String[] args) {
        Configs config = new Configs();
        System.out.println("-=-=-=-=-  Exibição -=-=-=-=-");
        System.out.println("Nome: " + Configs.BANCO_NOME);
        System.out.println("Limite do saque: " + Configs.LIMITE_SAQUE + "R$");
        System.out.println("Taxa: " + Configs.TAXA_JUROS + "R$");

        System.out.println("Juros a pagar: " + config.calcularJuros(2000) + "R$");
        System.out.println("O valor é maior que o limite? " + config.validarSaque(2000));
        System.out.println("-=-=-=-=-           -=-=-=-=-");

    }
}
