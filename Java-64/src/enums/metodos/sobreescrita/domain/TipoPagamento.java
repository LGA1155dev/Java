package enums.metodos.sobreescrita.domain;

public enum TipoPagamento {
    CREDITO {
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.05;
        }
    },
    DEBITO{
       @Override
       public double calcularDesconto(double valor){
           return valor * 0.1;
       }
    };

    public double calcularDesconto(double valor){
            return 0;
    }
}
