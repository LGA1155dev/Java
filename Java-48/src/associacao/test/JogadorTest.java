package associacao.test;

import associacao.domain.Jogador;
import associacao.domain.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("caça rato prime");
        Time time = new Time("São Paulo");
        jogador01.setTime(time);
        jogador01.imprimir();
    }
}
