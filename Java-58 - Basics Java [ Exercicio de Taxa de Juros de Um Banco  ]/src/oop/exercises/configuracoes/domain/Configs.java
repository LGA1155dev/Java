package oop.exercises.configuracoes.domain;

public class Configs {
    public static final double TAXA_JUROS = 0.05;
    public static final double LIMITE_SAQUE = 1000;
    private double valor;
    public static final String BANCO_NOME = "DevDojo Bank";

    public double calcularJuros(double valor){
        this.valor = valor * TAXA_JUROS;
        return valor * TAXA_JUROS;
    }

    public boolean validarSaque(double valorSaque){
        if (valor <= LIMITE_SAQUE) {
            return true;
        }
        return false;
    }

}
