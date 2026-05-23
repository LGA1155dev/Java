package Bexercise.times.e.Jogadores.test;
import Bexercise.times.e.Jogadores.domain.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time time01 = new Time("Corinthians", "Memphys depay", "Yuri alberto", "André ramalho");
        Time time02 = new Time("Real Madrid", "Valverde", "Rodrigo (Rain)", "Kylian Mbappé ");
        Time time03 = new Time("Barcelona", "Lamine Yamal", "Raphinha", "Rashford", "Gavi");
        time01.mostrarJogadores();
        time02.mostrarJogadores();
        time03.mostrarJogadores();
    }
}
