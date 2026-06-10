package oop.fin4l.modificador.domain;
import lombok.Getter;
import lombok.Setter;

public class Carro {
    @Getter
    @Setter
    private String name;

    public static final double VELOCIDADE_LIMITE;

    static{
        VELOCIDADE_LIMITE  = 250;
    }


}
