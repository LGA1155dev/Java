package Ajogadores.oop.exercicios.test;

import Ajogadores.oop.exercicios.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("marcelinho carioca", 40, 97);
        Jogador jogador02 = new Jogador("Caça rato", 32, 999);
        Jogador jogador03 = new Jogador("Martines", 25, 75);
        Jogador[] jogadores = {jogador01, jogador02, jogador03};
        jogador01.levelUp();

        for (Jogador jogador : jogadores){
            jogador.imprimir();
        }

    }
}
