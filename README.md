# 📚 Aprendendo Java e documentando as ferramentas


## 📈 Progresso

* [x] Dia 1 concluído
* [x] Dia 2 concluído
* [x] Dia 3 concluído
* [x] Dia 4 concluído
* [x] Dia 5 concluído
* [x] Dia 6 concluído
* [x] Dia 7 concluído
* [x] Dia 8 concluído
* [x] Dia 9 concluído
* [x] Dia 10 concluído
* [x] Dia 11 concluído
* [x] Dia 12 concluído
* só falta mais 188 dias de estudo... pouco né?



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


## 📅 Dia 8

### Arrays no java

no java arrays assim como Strings não são tipos primitivos mas sim referencias na memoria, ou seja, quando você declara um array
você está apontando pra um espaço de memoria e falando "olha java, é pra lá que fica meu array" e então com essa referencia que
o array cria para a memoria você consegue guardar diversos valores em apenas um array que você pode definir quantas posições tem
começando do 0 e indo até onde você definir exemplo

public class ArraysNoJava {
	public static void main(String[] args) {
		int[] idades = new int[3];
		idades[0] = 15;
		idades[1] = 16;
		idades[2] = 17;
	System.out.println(idades[0])
	System.out.println(idades[1])
	System.out.println(idades[2])
	}
}

* um fator importante é que quando declarado um array no java, os '[]' devem ficar logo após a declaração do tipo do array ex

String[] nomes = new String[2]

você pode ate colocar '[]' depois, exemplo no nome do array como:

String nomes[] = new String[2]

porém isso não é uma boa pratica, simplesmente porque sim... Não é uma boa pratica.


### Exercicios pra treinar array no java com loops de repetição for:

```java id="g7r1di"

package arrays.praticando.aprendendo;

import java.util.Scanner;

public class ExercicioArray{
    public static void main(String[] args) {
        String[] nomes = new String[3];
        Scanner inputName = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Qual seu nome? ");
            String name = inputName.nextLine();

            nomes[i] = name;
        }
        for (int c = 0; c < 3 ; c++) {
            System.out.println(nomes[c]);
        }


    }
}

```


## 📅 Dia 9

### Novamente falando sobre arrays no java:

existe no java uma forma de simplificar a declaração dos arrays e colocar oque vai ter dentro dele em apenas uma linha:

```java id="g7r1di"

package arrays.praticando.aprendendo;

import java.util.Arrays;

public class ArraysEForEach {
    public static void main(String[] args) {
        int[] numeros = {1, 2 , 3 , 4 , 5};
        String[] nomeNinjas = {"Naruto uzumaki", "Sakura Haruno", "Sasuke Uchiha"};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }

        for (int c = 0; c < nomeNinjas.length; c++) {
            System.out.println(nomeNinjas[c]);
        }
    }
}

```

Assim como no exemplo acima que eu declarei o array que é uma referencia pra um lugar na memoria, e quando eu criei essa referen
cia, na mesma linha de declaração eu coloquei direto os valores que devem estar dentro dele.




### Ao inves de ficar percorrendo o array no java usando o for comum igual a um primata, basta usar o for each para percorrer
o array de forma mais limpa e facil de entender. A sintaxe dele é muito simples e o modo em que ele percorre o array se assemelha com o for of no java script:

```java id="g7r1di"

        for (int i:numeros){
            System.out.println(i + " Usando for each");
        }

```


### Arrays multidimenssionais (a desgrama do java):

Arrays multidimensionais são basicamente arrays dentro de arrays no java. Um array é uma referencia na memoria correto? Um array multidimensional vai apontar pra onde está o outro array (o que está dentro dele) na memoria por isso quando por exemplo
fazemos esse codigo, exibe uma localização de memoria inclusive pra declarar um array multidimensinal deve se usar dois colchetes como no exemplo abaixo, que retorna uma localização do array dentro dela na memoria:



```java id="g7r1di"

        public class ArraysMultidimensionais {
		
		public static void main(String[] args){
			
			int[][] numerosMulti = new int[1][1];

        		numeros[0][0] = 1;

        		System.out.println(numeros[0]);
	}
}

```

nesse exemplo acima que peço pra exibir apenas o array principal numeros em seu indice 0 ele me referencia para um lugar da memoria onde está o array dentro dele que declarei acima.



## 📅 Dia 10

### Introdução a OOP

a orientação a objeto tenta trazer elementos reais do mundo, para o computador atraves de objetos, exemplo, pode se representar um estudando, um animal ou etc... Para fazer um objeto no java é simples, você cria uma classe com o nome do objeto que quer criar exemplo :

Estudante, que está dentro do package = objeto.orientacao.java.dominio

dentro dessa class vamos conter o nosso objeto estudante:

```java id="g7r1di"
public class Estudante {
	public String nome;
	public int idade;
	public char sexo;
}
```

só com esse codigo você consegue definir a criação do nome do objeto, idade, e sexo, porém para acessa-lo e defini-lo seja o nome, ou idade ou sexo. Deve se criar uma outra class para test exemplo :

EstudanteTest, que esta dentro do package = objeto.orientacao.java.test

dentro dessa class você importa a class Estudante e atribui cada parametro do objeto, nome, idade, sexo... exemplo:

```java id="g7r1di"

import package objeto.orientacao.java.dominio.Estudante;

public class EstudanteTest {
	public static void main (String[] args) {
		Estudante estudante = new Estudante();
		estudante.nome = "Gabriel";
		estudante.idade = 15;
		estudante.sexo = 'm';
		
	}
}



```

<img width="707" height="616" alt="OOP" src="https://github.com/user-attachments/assets/f550f5b2-1de4-4c19-b66d-3aa50d429603" />




## 📅 Dia 11

### Coesão no java OOP

A representação grafica para meu objeto ficaria assim :





Coesão no java nada mais é do que a organização das classes para não haver confusão, exemplo ao invês de criar um classe estudante com os atributos de nome, idade, sexo... e dentro dessa mesma classe criar atributos para um professor exemplo 
public String nomePofessor, public int idadeProfessor, public char sexoProfessor. Isso deixaria o codigo muito bagunçado além 
de não ser uma boa pratica, ao inves disso criar classes separadas para cada objeto. Exemplo:


```java id="g7r1di"


public class Estudante {
		public String nome;
		public int idade;
		public char sexo;
		
}
```

```java id="g7r1di"

public class Professor {
		public String nome;
		public int idade;
		public char sexo;
		
}
```



# Exercicio OOP java:

### O objetivo é criar uma classe carro com os atributos nome, modelo, e ano de lançamento e depois criar dois objetos distintos seguindo essa classe carro:


```java id="g7r1di"

package classes.oop.aprendendo.domain;

public Carro {
	public String nome;
	public String modelo;
	public int ano;
}
```


```java id="g7r1di"


package classes.oop.aprendendo.test;

import classes.oop.aprendo.domain.Carro

public Uno {

	public static void main (String[] args){

		Carro uno = new Carro();
		uno.nome = "Uno"
		uno.modelo = "Fiat Uno";
		uno.ano = 2015;

	String imprimir = String.format("O nome do carro é %s o modelo é %s e o ano de lançamento é %d", uno.nome, uno.modelo, uno.ano);
	System.out.println(imprimir);

	}

}
```



## 📅 Dia 12


### Métodos no java - OOP

metdodos no java são bem parecidos com functions no java script, metodos são ações que serão tomadas no codigo que só serão executadas quando chamadas. Para fazer isso, usa-se o metodo void, metodo vazio que não retorna nada. Ele imprime algo no console, porém não retorna nada para quem está chamando.


exemplo:

```java id="g7r1di"

package metodos.objeto.orientacao.domain


public class Calculadora {
	public void somaNumeros (int num1, int num2){

		System.out.println(num1 + num2);

	}

```

```java id="g7r1di"


package metodos.objeto.orientacao.test

public class CalculadoraTest {
	public static void main (String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.somaNumeros(10, 20);
}

```