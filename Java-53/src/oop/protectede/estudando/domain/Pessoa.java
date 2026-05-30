package oop.protectede.estudando.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected int age;


    public Pessoa(String name, String cpf, int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public Pessoa(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.cpf);
    }
}
