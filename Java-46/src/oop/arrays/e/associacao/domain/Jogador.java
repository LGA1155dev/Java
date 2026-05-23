package oop.arrays.e.associacao.domain;

public class Jogador {
    private String name;

    public void imprimir(){
        System.out.println(this.name);
    }

    public Jogador(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}