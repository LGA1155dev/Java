package seminarios.associacao.exercise.domain;

public class Seminario {
    private String title;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String title){
        this.title = title;
    }

    public void imprimir(){
        System.out.println("-=-=-=-=-=-=- -=-=-=-=-=-");
        System.out.println("O seminario: " + this.title);
        System.out.println("Acontece no local: " + this.local);
        System.out.println("-=-=-=-=-=-=- -=-=-=-=-=-");
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }


    public Local getLocal(){
        return this.local;
    }


}
