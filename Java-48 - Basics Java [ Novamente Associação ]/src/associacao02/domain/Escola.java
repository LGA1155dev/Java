package associacao02.domain;

public class Escola {
    private String name;
    private Professor[] professores;

    public void imprimir(){
        System.out.println("Escola: " + this.name);

        if (professores == null ) return;

        for (Professor profs : professores) {
            System.out.println("Professores: " + profs.getName());
        }
    }

    public Escola (String name){
        this.name = name;
    }

    public Escola (String name, Professor[] professor){
        this.name = name;
        this.professores = professor;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
