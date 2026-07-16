package enums.metodos.sobreescrita.test;

import enums.metodos.sobreescrita.domain.Cliente;
import enums.metodos.sobreescrita.domain.Pagamento;
import enums.metodos.sobreescrita.domain.TipoCliente;
import enums.metodos.sobreescrita.domain.TipoPagamento;

import java.sql.SQLOutput;

public class ClientTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel", 15, TipoCliente.PESSOA_JURIDICA, 160);
        Pagamento pagamento = new Pagamento(   TipoPagamento.DEBITO  );

        System.out.println(cliente);
        System.out.println(pagamento);
        System.out.println("Desconto: " + TipoPagamento.DEBITO.calcularDesconto(160) + " R$");
        System.out.println(TipoCliente.valueOf("PESSOA_FISICA"));
        System.out.println(TipoCliente.tipoClientePorNomeDoRelatorio("Pessoa Fisica"));
    }
}
