package seminarios.associacao.exercise.test;
import seminarios.associacao.exercise.domain.Aluno;
import seminarios.associacao.exercise.domain.Professor;
import seminarios.associacao.exercise.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Seminario seminario1 = new Seminario("Programação Orientada a Guambiarra (POG) ");
        Seminario seminario2 = new Seminario("Leet Code ");
        Seminario seminario3 = new Seminario("Clean Code ");
        Seminario[] seminarios = {seminario1, seminario2, seminario3};

        Aluno aluno = new Aluno("Gabriel", 15, seminario1);
        aluno.setSeminario(seminario1);

        Professor professor = new Professor("Gustavo guanabara", "PHP",  seminarios);

        aluno.imprimir();
        professor.imprimir();
        seminario1.imprimir();




    }
}
