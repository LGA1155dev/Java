import java.util.Scanner;

public class LeituraDeDadosScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        char sexo;
        int age;


        System.out.println("Your name: ");
        name = scan.nextLine();

        System.out.println("Your age: ");
        age = scan.nextInt();

        System.out.println("Your sexo: ");
        sexo = scan.next().charAt(0);

        System.out.println("-=-=-=- You are -=-=-=-");
        System.out.println("Your name is: " + name);
        System.out.println("You have: " + age + " y/old");
        System.out.println("Sexo: "+ sexo);
        System.out.println("-=-=-=- ------- -=-=-=-");
    }
}
