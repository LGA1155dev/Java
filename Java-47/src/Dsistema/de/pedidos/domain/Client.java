package Dsistema.de.pedidos.domain;

public class Client {
    private String name;
    private int age;

    public Client(String name){
        this.name = name;
    }

    public Client(String name, int age){
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
}
