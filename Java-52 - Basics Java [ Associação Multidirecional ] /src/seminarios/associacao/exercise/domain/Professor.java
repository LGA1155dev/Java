package seminarios.associacao.exercise.domain;

public class Professor {
    private String name;
    private String specialty;
    private Seminario[] seminarios;

    public Professor(String name, String specialty, Seminario[] seminarios){
        this.name = name;
        this.specialty = specialty;
        this.seminarios = seminarios;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return this.specialty;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios(){
        return this.seminarios;

    }

    public  void imprimir(){
        System.out.println("-=-=-=-=-=-=- -=-=-=-=-=-");
        System.out.println("O professor: " + this.name);
        System.out.println("Com especialidade em: " + this.specialty);
        if (seminarios == null ) return;
        for (Seminario seminario : seminarios){
            System.out.println("Participa dos seminarios " + seminario.getTitle());
        }
        System.out.println("-=-=-=-=-=-=- -=-=-=-=-=-");
    }
}
