package Ccomida.avaliacao.exercise.domain;

public class Aluno {
    private String name;
    private int age;

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName (String name){
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



}
