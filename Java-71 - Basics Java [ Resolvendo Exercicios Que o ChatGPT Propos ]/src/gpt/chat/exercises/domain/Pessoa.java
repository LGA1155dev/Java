package gpt.chat.exercises.domain;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Pessoa implements  Imprimivel {
    public String name;
    public int age;
    public double height;

    public void imprimir(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-===-==");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }

}
