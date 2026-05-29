package Ccomida.avaliacao.exercise.domain;

public class Avaliacao {
    private double nota;
    private Aluno aluno;
    private Comida comida;


    public Avaliacao(double nota, Aluno aluno, Comida comida) {
        this.nota = nota;
        this.aluno = aluno;
        this.comida = comida;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }
}
