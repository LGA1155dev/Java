package produto.camadas.exercicios.service;
import produto.camadas.exercicios.domain.Product;

public class ProductService {
    public void gerarRelatorio(Product product){
        System.out.println("Gerando o relatorio do produto: " + product.getClass().getSimpleName());
        if (product.getPrice() <= 0){
            RuntimeException runtimeException = new RuntimeException("Erro, o preço não pode ser negativo ou nulo");
        }else{
            System.out.println("Price: " + product.getPrice());
        }

        if (product.getQuantity() <= 0) {
            RuntimeException runtimeException = new RuntimeException("Erro a quantidade não pode ser menor ou igual a 0");
        }

    }
}
