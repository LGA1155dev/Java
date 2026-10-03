package fin4l.referencia.tipo.test;

import fin4l.referencia.tipo.domain.Comprador;

public class CompradorTest {
    public static void main(String[] args) {
        Comprador comprador = new Comprador("sua mãe", "123.456.789-10");
        comprador.imprimir();

    }
}
