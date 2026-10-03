package Ccomida.avaliacao.exercise.test;
import Ccomida.avaliacao.exercise.domain.Aluno;
import Ccomida.avaliacao.exercise.domain.Comida;
import Ccomida.avaliacao.exercise.domain.Avaliacao;

public class AvaliacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel", 15);

        Comida comida = new Comida("Macarrão", 156.8);

        Avaliacao avaliacao = new Avaliacao(4, aluno, comida);
        System.out.println("-=-=-=--=-=-=-=-=-=-=");
        System.out.println("O aluno: " + avaliacao.getAluno().getName());
        System.out.println("Comeu: " + avaliacao.getComida().getName());
        System.out.println("Com: " + avaliacao.getComida().getCalorias() + " calorias");
        System.out.println("E avaliou: " + avaliacao.getNota() + "/5");
        System.out.println("-=-=-=-==-==-=-=-=-=-=");
    }
}
