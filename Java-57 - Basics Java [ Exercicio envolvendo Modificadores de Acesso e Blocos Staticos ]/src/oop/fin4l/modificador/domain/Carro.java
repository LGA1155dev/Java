package oop.fin4l.modificador.domain;
import lombok.Data;

@Data
public class Carro {
    private String name;

    public static final double VELOCIDADE_LIMITE;

    static{
        VELOCIDADE_LIMITE  = 250;
    }
}