package oop.arrays.e.associacao.test;

import oop.arrays.e.associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("caça rato");
        Jogador jogador02 = new Jogador("ribamar");
        Jogador jogador03 = new Jogador("yuri alberto");
        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for ( Jogador jogador : jogadores ){
            jogador.imprimir();
        }
    }
}
