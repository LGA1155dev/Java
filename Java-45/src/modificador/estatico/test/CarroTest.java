package modificador.estatico.test;

import modificador.estatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro cart01 = new Carro("BMW", 250);
        Carro cart02 = new Carro("Mercedes Bens", 275);
        Carro cart03 = new Carro("Uno", 290);
        cart01.setVelocidadeLimite(290);
        cart01.imprimir();
        cart02.imprimir();
        cart03.imprimir();
    }
}
