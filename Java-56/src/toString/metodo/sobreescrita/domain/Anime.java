package toString.metodo.sobreescrita.domain;

import lombok.Getter;
import lombok.Setter;

public class Anime extends Object {
    @Getter
    @Setter
    private String name;

    public Anime(String name){
        this.name = name;
    }

}
