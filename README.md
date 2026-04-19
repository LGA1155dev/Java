# 📚 Aprendendo Java e documentando as ferramentas


## 📈 Progresso

* [x] Dia 1 concluído
* [x] Dia 2 concluído
* [x] Dia 3 concluído
* [x] Dia 4 concluído
* [x] Dia 5 concluído
* [x] Dia 6 concluído
* [x] Dia 7 concluído
* só falta mais 193 dias de estudo... pouco né?



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


## 📅 Dia 4

Ainda em tipos primitivos


os tipos primitivos do tipo int, double, short, byte ... tem um limite de bytes que eles conseguem armazenar exemplo o byte que consegue armazenar até 1 byte assim ele consegue armazenar do número -128 até o 127... assim também acontece com outros tipos essa limitação, porém tem como burlar ela mesmo não sendo aconselhado como no exemplo abaixo que estou falando pro java: "Mesmo que extrapole o limite dessa variavel guarde esse valor dentro dela..." essa prática se chama casting:

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



No java as String não são tipos primitivos mas sim são classes, por isso toda vez que declaradas precisam começar com a sua letra inicial maiuscula "String"


## Exercicio

O exercicio consiste em criar um relatoria em java mostrando o nome da pessoa, o endereço, o salario, e a data de recebimento
exemplo:

"meu nome é ...<nome>, moro no endereço ...<endereço> e confirmo o recibo do salario ...<salario> na data ...<data>":

```java id="g7r1di"

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


```


## 📅 Dia 5


### Operadores aritiméticos

Como nas outras linguagens o java usa os operadores + - / * ** em seu codigo, não há muito segredo, 

**+ é o operador de soma **
** - o operador de subtração**
** / operador de divisão**
** "*" operador de vezes**
** "**" operador de potencia**

```java id="g7r1di"

public class OperadoresAritimeticos {

	public static void main(String[] args){
		int numero01 = 10;
		int numero02 = 20;

		System.out.println(numero01 + numero02 + " não é o mesmo de " + numero01 + numero02)

		//Repare que a soma ou operação que vem antes da string não é concatenada com ela mas sim feita sem 				interferencia dela, exemplo numero01 + numero02 == 30.
		Porém depois da string " não é o ..." os valores numero01 e numero02 não são somados, mas sim concatenados junto 		com a string.

	}
}

```

## 📅 Dia 6


### Operadores Relacionais

Como nas outras linguagens o java usa os operadores %, < >, <=, >= !=, ==  



```java id="g7r1di"

public class OperadoresRelacionais {

	public static void main(String[] args){
		int numero01 = 10;
		int numero02 = 20;

		System.out.println(numero01 % 2)

	}
}

```



### Operadores Logicos

os operadores logicos são  AND representado por '&&' e OR representado por '||'



```java id="g7r1di"

public class OperadoresLogicos {

	public static void main(String[] args){
		int numero01 = 10;
		int numero02 = 20;
		boolean n1MaiorQueN2 = numero01 > numero02 && numero01 != 0;

		System.out.println(n1MaiorQueN2)

	}
}

```

## 📅 Dia 7


### Estruturas de Repetição

```java id="g7r1di"

package repeticao.estruturas;

import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        Scanner inputContador = new Scanner(System.in);

        System.out.println("Um número: ");
        int contador = inputContador.nextInt();

        if (contador < 10 && contador >= 0) {
            while (contador <= 10) {
                System.out.println("Seu contador agora é: " + contador);
                contador++;
            }
        } else {
            while (contador >= 0) {
                System.out.println("Seu contador agora é: " + contador);
                contador--;
            }

        }



    }
}

```

