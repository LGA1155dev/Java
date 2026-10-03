package produto.camadas.exercicios.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import produto.camadas.exercicios.service.ProductService;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public abstract class Product {
    protected String name;
    protected double price;
    protected Integer quantity;
    protected ProductService productService;
}