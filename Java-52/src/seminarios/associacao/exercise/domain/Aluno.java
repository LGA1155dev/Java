package seminarios.associacao.exercise.domain;

public class Aluno {
    private String name;
    private int age;
    private Seminario seminario;

    public Aluno(String name, int age){
        this.name = name;
    }

    public Aluno(String name, int age, Seminario seminario){
        this.name = name;
        this.age = age;
    }

     public void setName(String name){
        this.name = name;
     }

     public String getName(){
        return this.name;
     }

     public void setAge(int age){
        this.age = age;
     }

     public int getAge(){
        return this.age;
     }

     public void setSeminario(Seminario seminario){
        this.seminario = seminario;
     }

     public Seminario getSeminario(){
        return this.seminario;
     }

    public void imprimir(){
        System.out.println("-=-=-=-=-=-=- -=-=-=-=-=-");
        System.out.println("O aluno: " + this.name);
        System.out.println("Com: " + this.age + " anos");
        System.out.println("Permanece no seminario: " + this.seminario.getTitle());
        System.out.println("-=-=-=-=-=-=- -=-=-=-=-=-");
    }
}
