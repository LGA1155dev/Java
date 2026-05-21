package oop.arrays.e.associacao.domain;

import com.sun.security.jgss.GSSUtil;

public class Jogador {
    private String name;

    public void imprimir(){
        System.out.println(this.name);
    }

    public Jogador(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
