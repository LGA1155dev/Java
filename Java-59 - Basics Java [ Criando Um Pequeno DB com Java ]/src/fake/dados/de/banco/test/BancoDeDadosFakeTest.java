package fake.dados.de.banco.test;
import fake.dados.de.banco.domain.BancoDeDadosFake;

public class BancoDeDadosFakeTest {
    public static void main(String[] args) {
       if (BancoDeDadosFake.usuarioBanco && BancoDeDadosFake.passwordBanco)
           System.out.println("Usuario e senha existem");
       else
           System.out.println("Usuario ou senha não existem");
    }
}
