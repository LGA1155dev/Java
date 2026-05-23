package associacao02.test;
import associacao02.domain.Professor;
import associacao02.domain.Escola;

public class Escola01Test {
    public static void main(String[] args) {
        Professor professor0 = new Professor("Gustavo Guanabara");
        Professor professor1 = new Professor("Felipe Deschamps");
        Professor[] professores = {professor0, professor1};
        Escola escola = new Escola("Curso em Video", professores);
        escola.imprimir();
    }
}
