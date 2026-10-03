import java.util.Scanner;

public class ExerciseScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char resp0;
        char resp1;
        char resp2;
        char resp3;

        System.out.println("-=-=-=- JOGO -=-=-=-");
        System.out.println("Quer jogar um jogo? [S / N]");
        resp0 = scan.next().charAt(0);

        if (resp0 == 'N' || resp0 == 'n') {
            System.out.println("tá (;");
            return;
        }

        else
            System.out.println("Ok, as regras do jogo vem a seguir");

        System.out.println("-=-=-=- REGRAS -=-=-=-");

        System.out.println("( 1 ) Você deverá responder as perguntas com sinceridade");
        System.out.println("( 2 ) Você terá duas possibilidades de reposta (sim ou não)");
        System.out.println("( 3 ) Você só pode responder 1 sim e 1 não.");

        System.out.println("-=-=-=- ------ -=-=-=-");

        System.out.println("Preparado? ...");

        System.out.println("-=-=-=- PERGUNTAS -=-=-=-");
        System.out.println("Você é gay? ");
        resp2 = scan.next().charAt(0);

        switch (resp2){
            case 's':
            case 'S':
                System.out.println("ixi kkk, então tá né ...");
                System.out.println("Você tá mentindo? ");
                resp3 = scan.next().charAt(0);
                if (resp3 == 'S' || resp3 == 's'){
                    while (resp3 != 'N' || resp3 != 'n'){
                        System.out.println("ERRO: O sim tu já perdeu... ");
                        System.out.println("Você tá mentindo? ");
                        resp3 = scan.next().charAt(0);

                        if (resp3 == 'N' || resp3 == 'n'){
                            System.out.println("ok kkk... Pelo menos confessou...");
                            return;
                        }
                    }
                } else if (resp3 == 'N' || resp3 == 'n'){
                    System.out.println("Pelo menos foi sincero...");
                    return;
                }
            case 'N':
            case 'n':
                System.out.println("Você tá mentindo? ");
                resp3 = scan.next().charAt(0);
                if (resp3 == 'N' || resp3 == 'n'){
                    while (resp3 != 'S' || resp3 != 's') {
                        System.out.println("ERRO: Você já havia perdido o não");
                        System.out.println("Você está mentindo? ");
                        resp3 = scan.next().charAt(0);

                        if (resp3 == 'S' || resp3 == 's'){
                            System.out.println("OK... kkkk, pelo menos foi sincero dessa vez");
                            return;
                        }
                    }
                }
        }


        }
    }

