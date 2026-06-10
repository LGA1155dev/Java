package toString.metodo.sobreescrita.domain;

import lombok.Getter;
import lombok.Setter;

public class Anime {
    @Getter
    @Setter
    private String name;

    @Override
    public String toString(){
        return "Anime " + this.name;
    }

    public Anime(String name){
        this.name = name;
    }

}
