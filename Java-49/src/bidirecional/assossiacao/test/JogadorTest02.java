package bidirecional.assossiacao.test;

import bidirecional.assossiacao.domain.Jogador;
import bidirecional.assossiacao.domain.Time;
import com.sun.security.jgss.GSSUtil;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Robinho");
        Jogador[] jogadores = {jogador};
        Time time = new Time("Santos FC", jogadores);
        jogador.setTime(time);


        System.out.println("-=- Jogador -=-");
        jogador.imprimir();
        System.out.println("-=- ------- -=-");

        System.out.println("-=-   Time  -=-");
        time.imprimir();
        System.out.println("-=- ------- -=-");
    }
}
