package jv.on.abstratas.classes.test;

import jv.on.abstratas.classes.domain.Client;
import jv.on.abstratas.classes.domain.TipoClient;
import jv.on.abstratas.classes.domain.TipoPagamento;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Gabriel", TipoClient.PESSOA_FISICA, TipoPagamento.DEBITO);
        System.out.println(client);
    }
}
