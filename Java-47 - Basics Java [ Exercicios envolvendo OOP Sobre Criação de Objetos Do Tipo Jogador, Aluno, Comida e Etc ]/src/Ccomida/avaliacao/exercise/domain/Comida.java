package Ccomida.avaliacao.exercise.domain;

public class Comida {
    private String name;
    private double calorias;


    public Comida(String name, double calorias) {
        this.name = name;
        this.calorias = calorias;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
