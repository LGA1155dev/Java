package modificador.estatico.domain;

public class Carro {
    private String name;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;


    public Carro(String name, double velocidadeMaxima) {
        this.name = name;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir () {
        System.out.println(this.name);
        System.out.println("ValocidadeMaxima: " + this.velocidadeMaxima);
        System.out.println("VelocidadeLimite" + this.velocidadeLimite);
        System.out.println("-=-=--=-=-=-=-=-==-==-=-=-=-=-");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
}
