package Ajogadores.oop.exercicios.domain;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Jogador {
    private String name;
    private int age;
    private int level;

    public void imprimir(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ger: " + level + " OVR");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public Jogador (String name, int age, int level){
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public int levelUp(){
        this.level += 1;
        return level;
    }
}
