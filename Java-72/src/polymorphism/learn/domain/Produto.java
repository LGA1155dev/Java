package polymorphism.learn.domain;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Produto implements Taxavel {
    protected String name;
    protected double value;
}