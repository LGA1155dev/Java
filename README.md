# 📚 Aprendendo Java e documentando minha experiência

---

## 📅 Dia 1

aprendendo sobre como funciona a Java Virtual Machine (JVM) e como o bytcode (class) é interpretado por ela.

### 🔄 Fluxo do Java até a compilação:

```text id="n0s9ci"
Codigo java (alto nivel) -> Transformado em Class (bytecode) -> Interpretado pela JVM -> Vira baixo nivel e pode ser executado (codigo de maquina)
```

---

## 📅 Dia 2

Aprendendo a printar hello world e também a pegar a data do computador

### 💻 Código:

```java id="g7r1di"
import.java.util.Date //Importa a data

public class PrimeiroCodigo { //class é a classe que você pra depois usar ela e transoformar em bytecodes. O nome sempre tera as iniciais Maiusculas.


	public static main (String[] args){ //public static main (String[]...) indica um metodo e nome "main" deve estar sempre em letras minusculas

		Date data = new Date(); //Isso aq é pra pegar a data e hora do sistema, sempre colocar ';' pra indicar o fim da linha

		System.out.println("Hello world"); //Isso aqui é pra exibir algo na tela tipo o print do python.
		System.out.println(data);


	}
}
```

---

## 📅 Dia 3

### 🔢 Tipos primitivos no java

Existem 8: int, double, float, char, byte, short, long, boolean

---

### 📌 Descrição:

**int:**
Muito usado no dia a dia pra guardar números inteiros

**double:**
bem usado pra guardar números com casas decimais, porém consome mais memoria apesar de não ser o problema hoje

**float:**
também é usado pra guardar número com casas decimais, porém é usado pra economizar bytes de memoria mas não é tão
usado quanto o double, é mais usado quando exige baixo nivel ou etc.

**char:**
guarda um caractere por vez

**byte:**
Serve pra guardar valores inteiros bem pequenos, usado apenas pra economizar memoria pois o int substitui facil

**short:**
bem raro usar mas usa se também pra guardar valores

**long:**
usa-se pra guardar valores extremamente grandes exemplo a quantidade de milissegundos de 1970 até hoje.

**boolean:**
é uma variavel que guarda true ou false.

---

## 📈 Progresso

* [x] Dia 1 concluído
* [x] Dia 2 concluído
* [x] Dia 3 concluído
* [x] Dia 4 concluído
* [ ] só falta mais 200 dias de estudo... pouco né?



## 📅 Dia 4

Ainda em tipos primitivos


os tipos primitivos do tipo int, double, short, byte ... tem um limite de bytes que eles conseguem armazenar exemplo o byte que consegue armazenar até 1 byte assim ele consegue armazenar do número -128 até o 127... assim também acontece com outros tipos essa limitação, porém tem como burlar ela mesmo não sendo aconselhado como no exemplo abaixo que estou falando pro java: "Mesmo que extrapole o limite dessa variavel guarde esse valor dentro dela...":

package maratona.dev.dojo;

```java id="g7r1di"

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
```

