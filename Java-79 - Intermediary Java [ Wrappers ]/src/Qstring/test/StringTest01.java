package Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Gabriel";
        String name2 = "Gabriel";
        name = name.concat(" Seven");
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2);

        String name3 = new String("Gabriel"); // Criando uma variavel de referencia; Criando um objeto do tipo String e criando uma string no pool de Strings
        System.out.println(name2 == name3.intern());

    }
}
