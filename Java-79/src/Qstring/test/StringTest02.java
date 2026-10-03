package Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
      String name = "                       LGA1155dev                                  ";
      String numbers = "0123456";

    System.out.println(name.charAt(4));
    System.out.println(name.length());
    System.out.println(name.replace("L", "v"));
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(numbers.substring(0, 2));

    System.out.println(name.trim());
    }
}
