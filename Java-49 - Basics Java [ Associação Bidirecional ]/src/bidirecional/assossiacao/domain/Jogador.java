package bidirecional.assossiacao.domain;

import bidirecional.assossiacao.domain.Time;

public class Jogador {
    private String name;
    private Time time;

    public void imprimir(){
        System.out.println("Jogador: " + this.name);
        if (time != null)
            System.out.println("Time: " + time.getName());
        else
            System.out.println("Erro: Time is not defined");
    }

    public Jogador(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setTime(Time time){
        this.time = time;

    }

    public Time getTime(){
        return this.time;
    }


}
