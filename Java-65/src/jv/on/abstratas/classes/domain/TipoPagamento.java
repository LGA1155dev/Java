package jv.on.abstratas.classes.domain;

public enum TipoPagamento {
    CREDITO {

        @Override
        public double calcDesconto(double valor){
            return valor * 0.1;
        }
    },
    DEBITO {

        @Override
        public double calcDesconto(double valor) {
            return valor * 0.05;
        }
    };
    public abstract double  calcDesconto(double valor);
}
