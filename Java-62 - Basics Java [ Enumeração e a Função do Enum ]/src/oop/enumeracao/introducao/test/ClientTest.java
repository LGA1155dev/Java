package oop.enumeracao.introducao.test;

import oop.enumeracao.introducao.domain.Cliente;
import oop.enumeracao.introducao.domain.TipoCliente;

public class ClientTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Alexandre Pato",  TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Paqueta", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
