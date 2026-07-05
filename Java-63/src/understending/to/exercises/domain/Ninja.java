package understending.to.exercises.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Ninja {
    private String name;
    private int age;
    private RankNinja tipo;
    private float chakra;

    public void promover(){
        if (chakra < 0)
            throw new RuntimeException("[ Error 46 ]: o chakra não pode ser negativo.");
        if (tipo  == RankNinja.KAGE && chakra < 5000){
            tipo = RankNinja.ANBU;
            System.out.println("Um KAGE deve ter ao menos 5000 de chakra, você foi rebaixado para " + tipo);
        }
        if (tipo.equals(RankNinja.ANBU) && this.chakra < 3000){
            tipo = RankNinja.JOUNIN;
            System.out.println("Um ANBU deve ter ao menos 3000 de chakra, você foi rebaixado para " + tipo);
        }
        if (tipo.equals(RankNinja.JOUNIN) && this.chakra < 1500){
            tipo = RankNinja.CHUNIN;
            System.out.println("Um JOUNIN deve ter ao menos 1500 de chakra, você foi rebaixado para " + tipo);
        }
    }

    @Override
    public String toString(){
        return "Nome: " + this.name +
                "Age: " + this.age +
                "Type on Ninja: " + this.tipo +
                "Chakra: " + this.chakra;
    }
}
