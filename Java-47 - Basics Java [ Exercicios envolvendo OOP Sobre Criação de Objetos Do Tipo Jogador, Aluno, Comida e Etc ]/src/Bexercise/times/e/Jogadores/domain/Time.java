package Bexercise.times.e.Jogadores.domain;

public class Time {
    private String name;
    private String[] players;

    public Time(String name, String... players){
        this.name = name;
        this.players = players;
    }

    public void mostrarJogadores(){
        System.out.println("No " + this.name + " possui estes jogadores: ");
        for (String player : players){
            System.out.println(player);
        }
        System.out.println("-=-=-=-=-==--=--");
    }
}
