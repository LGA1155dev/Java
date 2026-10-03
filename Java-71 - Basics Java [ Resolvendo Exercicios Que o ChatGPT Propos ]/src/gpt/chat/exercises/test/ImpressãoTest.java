package gpt.chat.exercises.test;

import gpt.chat.exercises.domain.Gabriel;
import gpt.chat.exercises.domain.Rafaella;

public class ImpressãoTest {
    public static void main(String[] args) {
        Gabriel gabriel = new Gabriel("Gabriel", 15, 1.65);
        Rafaella rafaella = new Rafaella("Rafaella", 15, 1.63);
        gabriel.imprimir();
        rafaella.imprimir();
    }
}
