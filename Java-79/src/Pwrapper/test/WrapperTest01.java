package Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args){
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1;
        double doubleP = 1;
        float floatP = 1;
        boolean booleanP = true;
        char charP = 1;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 1L;
        Double doubleW = 1D;
        Float floatW = 1F;
        Boolean booleanW = true;
        Character charW = 1;

        int i = intW; // unboxing

        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = Integer.parseInt("1");
        boolean verdade = Boolean.parseBoolean("truE");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.toUpperCase('!'));
        System.out.println(Character.toLowerCase('!'));

    }
}