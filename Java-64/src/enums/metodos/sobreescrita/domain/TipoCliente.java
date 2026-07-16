package enums.metodos.sobreescrita.domain;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum TipoCliente {
        PESSOA_FISICA(1, "Pessoa Fisica"),
        PESSOA_JURIDICA(2, "Pessoa Juridica");

        private int valor;
        private String nomeRelatorio;

        TipoCliente(int valor, String nomeRelatorio){
                this.valor = valor;
                this.nomeRelatorio = nomeRelatorio;
        }

        public static TipoCliente tipoClientePorNomeDoRelatorio(String nomeRelatorio){
                        for (TipoCliente typeClient :  values()){
                                if (typeClient.getNomeRelatorio().equals(nomeRelatorio)) {
                                        return typeClient;
                                }
                }
            return null;
        }


}
