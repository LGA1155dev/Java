package maratona.dev.dojo;

public class Java04TipsPrimitives {
    public static void main(String[] args){
        int variavelInt = (int) 10000000000L;
        float variavelFloat = (float) 10000000000d;
        double variavelDouble = (double) 10000000000L;
        short variavelShort = (short) 1000000000;
        long variavelLong = 100000;
        boolean variavelBoolean = true;
        byte variavelByte = (byte) 1270;
        char varivelChar = '\u0041';

        System.out.println("Variavel inteira: " + variavelInt);
        System.out.println("Variavel float: " + variavelFloat);
        System.out.println("Varivel double: " + variavelDouble);
        System.out.println("Variavel short: " + variavelShort);
        System.out.println("Variavel long: " + variavelLong);
        System.out.println("Variavel byte: " + variavelByte);
        System.out.println("Variavel Char: " + varivelChar);
    }
}
