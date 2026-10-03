import java.util.Date;

public class AindaEmTiposPrimitivos {
    public static void main(String[] args) {

        String nome = "Gabriel";
        String endereco = "Rua dos palmares 305";
        float salario = 1500.90f;
        Date data = new Date();
        System.out.println("Meu nome é " + nome + " recebi no " +
                "endreço " + endereco + " meu salario foi " + salario + " R$ " +
                " no dia " + data.getDate() + "/" + (data.getMonth() + 1) + "/" + ((data.getYear() - 100) + 2000) +
                " as " + data.getHours() + " horas" + " e " + data.getMinutes() + " minutos");


    }

}
