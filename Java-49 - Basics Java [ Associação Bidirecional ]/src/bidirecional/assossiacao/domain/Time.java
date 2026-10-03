package bidirecional.assossiacao.domain;

public class Time {
    private String name;
    private Jogador[] jogadores;

    public void setName(String name){
        this.name = name;
    }

     public Time(String name){
         this.name = name;
     }

    public Time(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }

    public void imprimir(){
        System.out.println(this.name);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getName());
        }
    }

    public String getName(){
        return this.name;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
