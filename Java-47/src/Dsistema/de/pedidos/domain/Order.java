package Dsistema.de.pedidos.domain;

public class Order {
    private Client client;
    private Product[] products;

    public Order(Client client, Product[] products){
        this.client = client;
        this.products = products;
    }

    public void imprimir() {
        System.out.println(this.client);
        System.out.println(this.products);
    }

    public void setClient(Client client){
        this.client  = client;
    }

    public Client getClient(){
        return  this.client;
    }

    public  void setProducts(Product[] products){
        this.products = products;
    }

    public Product[] getProducts(){
        return this.products;
    }

}
