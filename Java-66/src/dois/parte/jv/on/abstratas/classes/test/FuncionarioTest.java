package dois.parte.jv.on.abstratas.classes.test;
import dois.parte.jv.on.abstratas.classes.domain.Jogador;

public class FuncionarioTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Caça rato 7", 300);
        System.out.println(jogador);
        System.out.println(jogador.calcBonus());
    }
}
