package jv.on.abstratas.classes.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Funcionario {
    protected String name;
    protected double salary;

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{ \n name: " + this.name +
                ",\n salary: " + this.salary + "\n }";
    }

}
