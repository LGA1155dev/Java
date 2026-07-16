# 📚 Aprendendo Java e documentando a experiência


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
* [x] Dia 13 concluído
* [x] Dia 14 concluído
* [x] Dia 15 concluído
* [x] Dia 16 concluído
* [x] Dia 17 concluído
* [x] Dia 18 concluído
* [x] Dia 19 concluído
* [x] Dia 20 concluído
* [x] Dia 21 concluído
* [x] Dia 22 concluído
* [x] Dia 23 concluído
* [x] Dia 24 concluído
* [x] Dia 25 concluído
* [x] Dia 26 concluído
* [x] Dia 27 concluído
* [x] Dia 28 concluído
* [x] Dia 29 concluído
* [x] Dia 30 concluído
* só falta mais 170 dias de estudo... pouco né?


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



### Parametros de metodos no java OOP

os parametros nada mais são do que variaveis locais que guardam informações e que após a ação do codigo elas sumirão, ou seja só funcionam naquele instante da ação, depois da ação não existe mais os parametros.


exemplo de parametros são:


```java id="g7r1di"

package pratica.na.metodos.objetos.orientacao.domain;

public class JuntaodorDeNomes {

	public void JuntadorDeNomes(String nome1,String nome2) {
		System.out.println(nome1 + " and " + nome2 + " juntei os nomes");
	}
}


```

```java id="g7r1di"

import pratica.na.metodos.objetos.orientacao.domain.JuntadorDenomes;

package pratica.na.metodos.objetos.orientacao.test;

public class JuntadorDeNomesTest {
	
	public static void main (String[] args) {
		JuntadorDeNomes juntadordenomes = new JuntadorDeNomes();]
		juntadordenomes.JuntaodorDeNomes("gabriel", "yasmin")
	}
}

```



## 📅 Dia 13


### Métodos de retorno

os metodos de retorno funcionam diferentes do metodo void que não retorna nada, nos metodos de retorno como o nome já diz, você pode retornar valores nele, basta o seguinte, você especificar o tipo do valor ou dos valores que serão retornados. Exemplo pratico:


```java id="g7r1di"

package retorno.de.metodos.objeto.orientacao.domain;

public class Calculadora {
	
	public double dividirNumeros(double num1, double num2) {
		
		return num1 / num2;
	}
}

```

```java id="g7r1di"

package retorno.de.metodos.objeto.orientacao.test;
import retorno.de.metodos.objeto.orientacao.domain.Calculadora;

public class CalculadoraTest {
	
	public static void main (String[] args) {
		
		Calculadora calculadora = new Calculadora;
		calculadora.dividirNumeros(20, 10)

	// Repare que se eu somente tentar isso acima (chamar o metodo e passar os argumentos) não vai funcionar, já que o metodo está retornando valores e não imprimindo-os na  tela, então pra isso tenho que dar um System.out.println para ver o retorno desse metodo:


		System.out.println(calculadora.dividirNumeros(20, 10));
	}
}

```


## 📅 Dia 14


### OOP Java - Métodos - Parâmetros tipo primitivo

no java quando você faz o uso de parametros eles são variaveis locais que não interferem em variaveis normais

um exemplo está abaixo em que eu faço um metodo chamado alteraNums com os parametros num1 e num2 e faço com que o num1 da minha variavel int permanente que está no CalculadoraTest02 vire 99, e o num2 vire 33 e quando eu chamo o metodo realmente aparece o num1 como 99 e o num2 como 33 porém eles são copias não referencias, já que quando eu exibo na tela o num1 e num2 (variaveis normais) continua me retornando que num1 é igual a 1 e num2 é igual a 2 ou seja não foi estabelecido nenhum tipo de referencia.

 
```java id="g7r1di"

package metodos.primitivos.tipos.parametros.domain;

public class Calculadora {

	public void alteraNums(int num1, int num2) {
		
		num1 = 99;
		num2 = 33;
		System.out.println("Números alterados com sucesso!");
		system.out.println("num1: " + num1 + " num2: " + num2); 
	
	}
}
```

```java id="g7r1di"

package metodos.primitivos.tipos.parametros.test;
import metodos.primitvos.tipos.parametros.domain.Calculadora;

public class CalculadoraTest02 {
	
	public static void main(String[] args){
		
		int num1 = 1;
		int num2 = 2;


	Calculadora calculadora = new Calculadora();
	calculadora.alteraNums(num1, num2);
	System.out.println("Num1: " + num1 + " Num2 " + num2); 
	
	}
}

```


## 📅 Dia 15

### Novamente falando sobre parametros com tipos de referencia.


parametros de referencia é basicamente eu fazer com que os parametros ou o parametro aponte pra um mesmo objeto que outra variavel está apontando. Exemplo fazer com que a
minha variavel student apontar pro mesmo objeto que minha variavel student01 está apontando uma base do que estou tentando dizer é isso:

```java id="g7r1di"

public class Student {

	public String nome;
	public int idade;
	public char sexo;

}

```


logo após criar minha classe Student, eu defini atributos como nome, idade e sexo.
agora iremos criar nossos dois objeto, irei a partir dessa classe criar um objeto chamado student01 que vai fazer referência para um 
objeto no caso vou declarar a variavel student01 e criar um objeto:

```java id="g7r1di"

public class StudentTest {

	public static void main (String[] args){
		
		Student student01 = new Student();
		Student student02 = new Student();

		student01.nome = "gabriel";
		student01.idade = 15;
		student01.sexo = 'm';

		student02.nome = "yasmin";
		student02.idade = 18;
		student02.sexo = 'f';
		
		

	}
}



 
```

apos ter criado dois objetos distintos, o student01 e o student02 agora irei imprimilos na tela, eu até poderia ficar fazendo um System.out.println(student01.nome...) mas 
existe uma forma melhor para que  eu faça isso e que eu economizo bastante linhas de codigo, (valorizo clean code) que é fazer uma classe com o nome ImpressoraStudent e nesta
classe criar um metodo com um parametro (variavel local) criado a partir da classe Student que eu já mostrei anteriormente que aponte para o mesmo objeto que cada student está apontando, um exemplo pratico é:

```java id="g7r1di"

public class ImpressoraStudent {

	public void imprimir (Student student) {

		System.out.println(student.nome);
		System.out.println(student.idade);
		System.out.println(student.sexo);
		System.out.println("---------------");
	
	}
}

```

feito isso agora é só chamar o metodo imprimir e colocar como argumento o student01, e logo apos o student02:




```java id="g7r1di"

public class StudentTest {

        public static void main (String[] args){

                Student student01 = new Student();
                Student student02 = new Student();
		ImprimirStudent imprimir = ImprimirStudent();

                student01.nome = "gabriel";
                student01.idade = 15;
                student01.sexo = 'm';

                student02.nome = "yasmin";
                student02.idade = 18;
                student02.sexo = 'f';
		
		imprimir.imprimir(student01);
		imprimir.imprimir(student02);	


        }
}



 
```


e agora sim, o parametro da função (metodo) está fazendo referencia para o mesmo objeto do meu argumento.





## 📅 Dia 16


Parametros tipo referência


tem como eu simplesmente alterar a referencia do atributo do objeto e mesmo eu mandando printar ele fora do metodo (no test) ele ainda me retorna o nome gohan pois o student do imprimir student está fazendo referencia ao mesmo objeto que o student01 ou 02 que eu colocar no test, ou seja se eu fizer uma alteração no metodo vai alterar a referencia dos student01 e 02 por estarem referenciando ao mesmo objeto que o student.

```java id="g7r1di"


package referencia.tipo.parametros.estudando.domain;

public class Student {

    public String name;
    public int age;
    public char sexo;



}
```


```java id="g7r1di"


 package referencia.tipo.parametros.estudando.domain;

public class ImprimeStudent {

    public void ImprimirStudent(Student student){
        student.name = "Gohan";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sexo);
        System.out.println("-----------------");
    }

}

```

```java id="g7r1di"

package referencia.tipo.parametros.estudando.test;

import referencia.tipo.parametros.estudando.domain.ImprimeStudent;
import referencia.tipo.parametros.estudando.domain.Student;

import java.util.Locale;

public class StudentTest {

    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        ImprimeStudent impressao = new ImprimeStudent();

        student01.name = "Gabriel";
        student01.age = 15;
        student01.sexo = 'M';

        student02.name = "yasmin";
        student02.age = 17;
        student02.sexo = 'F';

        impressao.ImprimirStudent(student01);
        impressao.ImprimirStudent(student02);


    }

}
```

## 📅 Dia 17

### VarArgs

varargs nada mais é doque uma sintaxe simplificada para colocar arrays como argumentos, exemplo, normalmente quando eu crio um metodo que tenha um array como parametro normalmente a sintaxe ficaria mais ou menos assim:

```java id="g7r1di"

package objetos.orientacao.varargs.domain;

public class Calculadora {

	public void somarNumeros(int[] numeros){
		
		int somar = 0;
		for (int s : numeros){
			
			somar += s;
		}
	System.out.println(somar);
	}
}
```

A sintaxe normalmente ficaria assim.

já no varargs que é uma mini simplificação a sintaxe e a chamada muda um pouco:

```java id="g7r1di"

package objetos.orientacao.varargs.domain;

public class Calculadora {
	
	public void somarNumerosVarArgs(int... numeros) {
		
		int soma = 0;
		
		for (int s : numeros){
		
			somar += s;
		}
	System.out.println(somar);
	}
}
```

A vantagem de usar VarArgs é na chamada, onde eu simplesmente posso colocar diretamente todos os números que eu quero na chamada da funçao e o java irá tranformar tudo aquilo em uma lista (array), um exemplo disso que acabei de citar:


 
```java id="g7r1di"

package objetos.orientacao.varargs.test;
import objetos.orientacao.varargs.domain.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {

		Calculadora calculadora = new  Calculadora();
		calculadora.somarNumerosVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
	}
}

```


## 📅 Dia 18

### Modificadores de acesso, private, get, set

Quando criamos uma classe temos a opção de colocar os atributos dela como public ou private, onde o acesse public deixa o atributo totalmente publico
a qualquer lugar que você tente acessa-lo, já no acesse private o acesso fica privado e você só consegue acessar (modificar) ou atribuir os atributos 
se você criar um metodo de acesso um exemplo está abaixo, onde eu crio uma classe onde seus atributos estão privados e faço uma função que imprime os
dados e no final uma função para conseguir modificar os atributos ou atribuir valor a eles:

```java id="g7r1di"

package acesso.de.modificadores.estudando.domain;

public class Pessoa {
	
	private String name;
	private int age;
	private char sexo;

	public void imprimir(){
		
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.sexo);
	}

	public setName(String name){
	
		this.name = name;
	}		
}


```

o this name eu usei para apontar a variavel que está fora do escopo (da função) ou seja o this sempre é usado quando vamos apontar para uma varivel que
está fora do escopo do metodo. E coloquei que a variavel name o atributo name recebe a variavel local do metodo chamada name. E quando eu chamar a função
setName a variavel name irá receber o argumento que coloquei para o metodo setName.

```java id="g7r1di"

package acesso.de.modificadores.estudando.test;
import acesso.de.modificadores.estudando.domain.Pessoa;

public PessoaTest {

	public static void main(String[] args){
		
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setName("yasmin");
		pessoa01.imprimir();

	}
}

```


## 📅 Dia 19


### Ainda aprendendo sobre modificadores de acesso.
hoje iremos falar sobre o metodo get, sobrecarga de metodos e etc

### Metodo get

o metodo get tem quase a mesma função que o metodo set tem, porém com uma diferença. O metodo set serve pra setar algo a variavel ou seja se eu tenho por exemplo isso aqui:

```java id="g7r1di"

package acesso.de.modificadores.estudando.domain.Pessoa;

public Pessoa {

	private String name;
	private int age;
	private char sexo;

	public setName (String name) {

		this.name = name;
	}
}
```

quando eu faço isso eu estou falando "Olha java quero setar meu atributo/variavel nome, e vou ter nesse metodo de setar um parametro chamado name no caso com o mesmo nome de meu atributo, e então quero que pegue aquela variavel name lá do inicio e quero que ela receba o meu parametro name, ou seja oque eu colocar como argumento"



mas com o metodo get tem uma pequena diferença, como já vimos a tradução de set é bem intuitiva no caso significa setar/atribuir, já o get significa resgatar/pegar;

então se eu uso o metodo get eu estou pedindo para apenas pegar a minha variavel que está privada. E depois eu retorno oque tem dentro dela.


exemplo:

```java id="g7r1di"

package acesso.de.modificadores.estudando.domain.Pessoa;

public Pessoa {

	private String name;
	private int age;
	private char sexo;

	public getName () {
	
		return this.name;
	}
}

```

o metodo get na pratica funciona assim, com uma diferença quase nula na questão de sintaxe.


## Sobrecarga de metodos

sobrecarga de metodos é basicamente ter um metodo com o mesmo nome do outro porém a quantidade ou o tipo dos parametros são diferentes. Exemplo pratico é: 



```java id="g7r1di"

package metodos.de.sobrecarga.estudando.domain;

public class Anime {

	private String name;
	private String type;
	private String gender;
	private int episodes;

	public void imprimir () {

		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.gender);
		Sytem.out.println(this.episodes);
	}

	public void init (String name, String type, int episodes) {
	
		this.name = name;
		this.type = type;
		this.episodes = episodes;
	}

	
	public void init (String name, String type, int episodes, String gender) {
	
		this.name = name;
		this.type = type;
		this.episodes = episodes;
		this.gender = gender;
	}

 
```


## 📅 Dia 20


### Blocos de inicialização

Blocos de inicialização no java são basicamente blocos de codigo que são iniciados/executados antes mesmo dos construtores, e servem justamente para instanciar algo a um objeto antes de tudo. um exemplo está no codigo abaixo: 


	
```java id="g7r1di"

package inicializacao.de.blocos.domain;


public class Anime {

	private String name;
	private int[] episodes = new int[100];

	{
	
	System.out.println("Bloco de inicialização");	

	}

	public Anime(String name) {

		this.name = name;

	}

	public Anime() {

		for (int i = 0; i < this.episodes.length; i++) {
			this.episodes[i] = i + 1;
			System.out.println(" " + this.episodes[i]);
		}
	}
	
	public void getName () {

		return this.name;
	}
}

```

```java id="g7r1di"

package inicializacao.de.blocos.test;

import inicializacao.de.blocos.domain.Anime;

public class AnimeTest {
	
	public static void main(String[] args){
		
		Anime anime = new Anime("Naruto");
		anime.getName();
	}
}

```

Repare que independente do meu codigo sempre irá iniciar o bloco de inicialização primeiro antes de tudo. Eu poderia passar a noite inteira criando objetos e mais objetos exemplo: "Anime anime2 = new Anime(); Anime anime3 = new Anime(); Anime anime4 = new Anime().

Poderia criar quantos objetos eu quiser e também chamar quantos e quantos metodos nesses objetos eu quiser que sempre, REPITO, SEMPRE o bloco de inicialização será executado antes de todos e sempre!



## 📅 Dia 21


### Modificadores estaticos

quando criamos um atributo para uma classa por exemplo pra classe carro, esse atributo ficará isolado apenas no objeto que eu instanciei o valor, exemplo eu crio uma classe clarro com o atributo de velocidadeLimite que o carro pode atingir se eu setar essa velocidade limite por exemplo para 250 todos os objetos que eu iniciar estarão com a velocidade limite de 250 correto? Mas se eu por exemplo modificar a velocidade limite de somente um objeto, vamos supor que seja um objeto com o nome BMW, eu coloco a velocidade limite da bmw como exemplo 290 usando o metodo set, o 290 ficará isolado apenas a velocidade limite da bmw, mas os outros objetos que eu criar voltarão a ter velocidadeLimite de 250, mas se eu simplesmente usar algo chamado modificador static o jogo muda, porque ai o atributo não será mais isolado para o objeto, mas estará fora dele junto com a classe, ou seja se eu trocar a velocidade Limite de um, troca para todos. Um exemplo do que eu estou falando é:

```java id="g7r1di"

package modificador.estatico.domain;

public class Carro {

	private String name;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;

	public void imprimir () {
		
		System.out.println(this.name);
		System.out.println("velocidadeMaxima: " + velocidadeMaxima);
		System.out.println("velocidadeLimite: " + velocidadeLimite);
		System.out.println("-=-=--=-=-=-=-=-=-=-=-=-=-=-");

	}

	

	public Carro (String name, double velocidadeMaxima) {

		this.name = name;
		this.velocidadeMaxima = velocidadeMaxima;

	}

	public void getName (){
		
		return this.name;
	}

	public void setName (String name){
		
		this.name = name;
	}
		

	public void getVelocidadeMaxima (){
		
		return this.velocidadeMaxima;
	}

	public void setVelocidadeMaxima (double velocidadeMaxima){

		this.velocidadeMaxima = velocidadeMaxima;

	}

	public void getVelocidadeLimite (){
		
		return this.velocidadeLimite;
	}

	public void setValocidadeLimite(double velocidadeLimite){
	
		this.velocidadeLimite = velocidadeLimite;

	}
}


```


```java id="g7r1di"

package modificador.estatico.test;
import modificador.estatico.domain.Carro;

public clas CarroTest {

	public static void main(String[] args){
		
		Carro carro01 = new Carro("BMW", 200);
		Carro carro02 = new Carro("Mercedes benz", 180);
		Carro carro03 = new Carro("Uno", 140);
		
		carro01.setVelocidadeLimite(290);
		carro01.imprimir();
		carro02.imprimir();
		carro03.imprimir();
		
	}
}


```

## 📅 Dia 22

Herança no Java - OOP

Supomos que em sua empresa você foi contratado para retratar o mundo real no universo computacional e seu chefe olha pra você e fala: "Então... preciso que você faça um objeto chamado pessoa com os atributos nome, cpf, e endereço.".Logo após essa fala você faz oque ele te pede:

```java id="g7r1di"

package oop.heranca.estudando.domain;

public class Pessoa {

   private String name;
   private String cpf;
   private String endereco;
   
   public Pessoa(String name, String cpf, String endereco){
   
   	this.name = name;
   	this.cpf = cpf;
   	this.endereco = endereco;
   	
   }
   
   public void setName(String name){
   	this.name = name;
   }
   
   public String getName(){
   	return this.name;
   }
   
   public void setCpf(String cpf){
   	this.cpf = cpf;
   }
   
   public String getCpf(){
   	return this.cpf;
   	
   }
   
   public void setEndereco(String endereco){
   	this.endereco = endereco;
   }
   
   public String getEndereco(){
   	return this.endereco;
   }
   
   public void imprimir(){
   
   	System.out.println(this.name);
   	System.out.println(this.cpf);
   	System.out.println(this.endereco);
   	
   }
}

```

Feito essa classe pessoa que depois você irá fazer um objeto a partir desta classe, seu chefe faz mais um pedido: "Se puder também, faça um funcionario com os atributos de nome, cpf, endereco e também salario.". Após essa fala você vai lá e faz essa classe porém percebe que a classe funcionario tem os mesmos atributos que a classe pessoa tem porém extendendo em apenas um atributo que é o salario. E essa é a palavra chave "extend" quando eu tenho que um objeto tem o mesmo que outro porém quero que tenha isso e mais um pouco. Ou seja quando quero extender um objeto/classe. Exemplo pratico:


```java id="g7r1di"


package oop.heranca.estudando.domain;
import oop.heranca.estudando.domain.Pessoa;

public class Funcionario extend Pessoa {
	
    private double salario;
    
    public Funcionario(double salario){
    	this.salario = salario;
    }
    
    public void setSalario(double salario){
    	this.salario = salario;
    }
    
    public double getSalario(){
    	return this.salario;
    }
    
    }
    
```

Dessa maneira você consegue economizar boas linhas de codigo e não precisa entupir seu codigo de getters e setters já que a classe Funcionario já está herdando todos os atributos de Pessoa. Porém o risco de usar isso e que é bem perigoso se não usado corretamente, é o fato de que qualquer alteração que eu faça na classe pessoa, irá interferir na classe funcionario. Por exemplo se eu colocar um atributo que será apenas para a pessoa em particular, esse atributo seria também repassado para a classe Funcionario simplesmente porque ele está herdando tudo que vir da classe Pessoa.    
   	
   	
   	
## 📅 Dia 23

### Super

O super é uma referência à classe pai. Ele permite acessar atributos, métodos e construtores da superclasse.

Um uso comum é quando sobrescrevemos um método na classe filha, mas ainda queremos executar a implementação original da classe pai.

No exemplo abaixo, Funcionario sobrescreve o método imprimir(). Ao chamar super.imprimir(), primeiro executamos o método imprimir() da classe Pessoa e depois adicionamos o comportamento específico de Funcionario, imprimindo o salário.

```java id="g7r1di"

package oop.heranca.estudando.domain;
import oop.heranca.estudando.domain.Pessoa;

public class Funcionario extend Pessoa {
    private double salario;
    
    public Funcionario(double salario){
    	this.salario = salario;
    }
    
    public void setSalario(double salario){
    	this.salario = salario;
    }
    
    public double getSalario(){
    	return this.salario;
    }
    
    public void imprimir(){
    
    super.imprimir();
    System.out.println(this.salario);
    
    }
}

```

### Protected

O modificador `protected` permite que um atributo ou método seja acessado pela própria classe, por classes do mesmo pacote e também por classes filhas (subclasses), mesmo que estejam em pacotes diferentes.

Ele é mais restritivo que `public` e menos restritivo que `private`, sendo muito utilizado em cenários de herança.

um exemplo é a seguir: 


```java id="g7r1di"

package oop.protectede.estudando.domain;

public class Funcionario extends Pessoa {
    private double salario;
    private double salarioRecebido;

    public Funcionario(double salario, double salarioRecebido) {
        this.salario = salario;
        this.salarioRecebido = salarioRecebido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(this.salario);
    }

    public void relatorioPagamento () {
        System.out.println("Eu: " + this.name + " recebi " + this.salario + "R$");
    }


    public double getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(double salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }
}

```

```java id="g7r1di"

package oop.protectede.estudando.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected int age;


    public Pessoa(String name, String cpf, int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }

    public Pessoa(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void imprimir(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.cpf);
    }
}


```

```java id="g7r1di"

package oop.protectede.estudando.test;

import oop.protectede.estudando.domain.Funcionario;
import oop.protectede.estudando.domain.Pessoa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", "123-456-789-10", 15);
        Funcionario funcionario = new Funcionario(1500, 2000);
        funcionario.setName("Gabriel");
        funcionario.relatorioPagamento();

    }
}

```



## 📅 Dia 24

### Como o construtor se comporta quando temos herança em Java?

Novamente voltando ao exemplo anterior. Se por um acaso o meu `Funcionario` é uma `Pessoa`, ou seja, ele estende os atributos de `Pessoa`, logo eu preciso seguir todas as diretrizes de `Pessoa` no meu `Funcionario`.

Por exemplo: se a minha classe `Pessoa` é inicializada com um construtor que já define nome, CPF e outras informações importantes, logo a minha classe `Funcionario` também precisa respeitar esse processo de inicialização.

Imagine a seguinte ocasião:

Temos dois gêmeos siameses. Eles nasceram grudados. Logo, ambos compartilham provavelmente o mesmo coração, o mesmo corpo e talvez até o mesmo órgão sexual. Faria sentido eu simplesmente ter um deles com uma mão, mas o outro não ter uma mão? (Sei que, por mais bizarro que pareça, isso pode acontecer). Porém, dentro da nossa comparação, não teria sentido lógico um ter braço e o outro não ter braço.

Logo, comparando com as classes em Java, não faria sentido existir uma classe que estende outra classe, mas que não respeita as diretrizes da classe mãe. Isso não teria coerência.

Entretanto, é importante destacar um detalhe técnico: essa analogia serve apenas para facilitar o entendimento do conceito. Na prática, a classe filha não precisa necessariamente possuir os mesmos construtores da classe mãe. Inclusive, construtores nem são herdados em Java.

O que realmente acontece é que a classe filha precisa garantir que o construtor da classe mãe seja executado durante sua inicialização. Normalmente isso é feito através da chamada `super(...)`. Dessa forma, a parte herdada do objeto é criada corretamente antes que a própria classe filha finalize sua construção.

Portanto, quando eu digo que o `Funcionario` precisa "seguir as diretrizes" da `Pessoa`, não significa que ambos terão exatamente os mesmos construtores, mas sim que o processo de inicialização definido pela classe mãe precisa ser respeitado.



## 📅 Dia 25

## Sequência de inicialização - java OOP

a sequencia de inicialização da JVM quando estamos trabalhando com herança é a seguinte:

0 - O bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai.

1 - O bloco  de inicialização estático da sub classe é executado quando a JVM carregar a classe filha

2 - Alocado um espaço em memória para o objeto da classe pai

3 - Cada atributo de classe pai é criado e inicializado com valores default ou quer for passado da classe pai

4 - Bloco de inicialização da superclasse é executado na ordem que aparecem

5 - Construtor é executado da superclass

6 - Alocado um espaço em memória pro objeto da subclasse

7 - Cada atributo da subclasse é criado e inicializado com valores default ou qualquer que seja passados

8 - Bloco de inicialização da subclasse é executado na ordem em que aparece

9 - O construtor é executado da subclasse


## 📅 Dia 26

### Hoje não tem materia, só pratica!

## Resolvendo exercicios em java - SOCORRO!!!!

## 📅 Dia 27

### Sobreescrita do método toString - Java OOP

Quando criamos uma classe no java por exemplo com o nome Anime" automaticamente a classe herda ou extende a classe Object que é uma classe que permite usar algumas funções por padrão. 
Se por exemplo você criar um objeto chamado anime como abaixo:

```java id="g7r1di"

package toString.metodo.sobreescrita.domain;
import lombok.Setter;
import lombok.Getter;

public class Anime {
   @Getter;
   @Setter;
   private String name;
   
}

```

```java id="g7r1di"

package toString.metodo.sobreescrita.test;

public class AnimeTest {
    public static void main(String... args){
    	Anime anime = new Anime();
    	System.out.println(anime);
    }
}

```

Se você sabe o minimo sobre poo, sabe que acima quando eu mando imprimir o objeto anime, não vai me imprimir tudo que está em anime mas sim uma localização na memoria de onde esse objeto está, no caso vai aparecer algo  parecido com isso:

toString.metodo.sobreescrita.domain.Anime@2c7b84de

E isso acontece pelo metodo toString que está na classe Object que restorna o seguinte:


        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        
ele pega a classe no caso Anime, pega o nome da classe que é Anime concatena com o "@" ficando Anime@ depois concatena com o hashcode 



E assim como todo método, tem como fazer sua sobreescrita, ou seja modificar o metodo. Por exemplo:

```java id="g7r1di"

package toString.metodo.sobreecrita.domain;
import lombok.Setter;
import lombok.Getter;

public class Anime {
   @Getter;
   @Setter;
   private String name;
   
   @Override;
   public String toString() {
   	return "Anime: " + name;
   }
}

```

Assim quando fizermos System.out.println(anime) exibirá "Anime: Naruto" por exemplo.
Lembrando que a anotação @Override serve para sobreescrever metodos, ou substituir, no caso é uma anotação pra avisar "Olha estou substituindo esse metodo por isso: ".


# Modificador Final

O modificador final no java, funciona assim como o const no JavaScript, ou seja são tipos de variaveis que nunca podem ser mudadas, e que assim que declaradas devem iniciar com um valor. No java, geralmente usa-se o final junto com o static (lembrando que o static é basicamente um modifcador que permite com que tal atributo seja da classe e não do objeto, ou seja se eu faço o atributo private static double velociade = 250;, todos os objetos criados a partir dessa classe terão a velocidade de 250) enfim, geralmente no java você vai ver muito codigo usando o static junto com o final. E também verá que o nome das variaveis são upperCase ou seja em letras maiusculas e que as palavras das variaveis são separadas por "_" underline, isso é uma boa pratica pois só de bater o olho já é possivel observar que se trata de uma variavel final, constanste que nunca muda.

um exemplo é:


```java id="g7r1di"

package oop.fin4l.modificador.domain;
import lombok.Getter;
import lombok.Setter;

public class Carro {
    @Getter
    @Setter
    private String name;

    public static final double VELOCIDADE_LIMITE;

    static{
        VELOCIDADE_LIMITE  = 250;
    }
    
```

Ai como a variavel é final, eu posso iniciar seu valor com o bloco de inicalização statico pois ele sempre será executado no codigo, não obtendo erro de compilação.




## 📅 Dia 28



### Modificador final em Tipos de Referência

O que é o modificador final?

O modificador final em linguagens orientadas a objetos (como Java) é utilizado para tornar uma variável imutável, ou seja, seu valor não pode ser alterado após a inicialização.

Comportamento com Tipos de Referência
Quando aplicamos o modificador final a uma variável que armazena uma referência a objeto, é importante entender o que exatamente se torna imutável:

O que NÃO pode ser alterado:

A referência em si: Não é possível fazer a variável apontar para um objeto diferente após a inicialização.
O que PODE ser alterado:

O estado interno do objeto:

 Os atributos e dados dentro do objeto referenciado podem ser modificados normalmente.
Exemplo Prático


// Classe Carro
class Carro {
    String cor;
    
    public Carro(String cor) {
        this.cor = cor;
    }
    
    public void pintar(String novaCor) {
        this.cor = novaCor;
    }
}

// Uso do modificador final
final Carro meuCarro = new Carro("Azul");

// ❌ ILEGAL - tentativa de mudar a referência
// meuCarro = new Carro("Vermelho"); // Erro de compilação!

// ✅ PERMITIDO - modificar o estado do objeto
meuCarro.pintar("Vermelho"); // Objeto agora tem cor "Vermelho"

Conceito-Chave: Imutabilidade de Referência vs Imutabilidade de Objeto

Referência final: A variável sempre apontará para o mesmo objeto na memória

Objeto mutável: O conteúdo/estado desse objeto pode ser alterado livremente
Aplicações Práticas

Segurança: Garante que uma instância crítica não seja substituída acidentalmente

Padrões de projeto: Utilizado em implementações como Singleton para garantir que a instância única não seja sobrescrita

Boas práticas: Ajuda a tornar o código mais previsível e menos propenso a erros

Dica Importante:

Se você realmente precisar de um objeto imutável completo, além de declarar a referência como final, será necessário implementar a classe de forma que seus atributos também sejam imutáveis (atributos final e sem métodos setters).



### Modificador final em Orientação a Objetos

Visão Geral

Este conteúdo aborda o uso do modificador final em programação orientada a objetos, focando em sua aplicação em classes e métodos.

Funcionalidades Principais

Classes final

Impede a herança: Classes declaradas como final não podem ser estendidas por subclasses

Garante integridade: Assegura que o comportamento da classe permaneça inalterado

Exemplo prático: A classe Ferrari ilustra cenários onde a herança deve ser proibida por questões de design ou segurança
Métodos final

Previne sobrescrita: Métodos final não podem ser sobrescritos em subclasses

Mantém comportamento consistente: Garante que a implementação original seja preservada em toda a hierarquia de herança

Protege lógica crítica: Ideal para métodos cuja lógica não deve ser alterada

Benefícios do Uso de final

Segurança: Evita modificações indesejadas no comportamento do código

Performance: Em alguns casos, permite otimizações pelo compilador/JVM

Design explícito: Comunica claramente as intenções do desenvolvedor original

Manutenibilidade: Reduz a complexidade ao limitar possibilidades de extensão

Casos de Uso Recomendados

Classes utilitárias que não devem ser estendidas

Métodos com lógica de negócio crítica que não pode ser alterada

Implementações de segurança onde a integridade é fundamental

Classes que representam entidades imutáveis ou completas

Nota: O modificador final é uma ferramenta poderosa para criar APIs robustas e seguras, promovendo boas práticas de
 encapsulamento e design orientado a objetos.
 
 
## 📅 Dia 29

📘 Java - Métodos em Enums e Sobrescrita de Métodos
📖 O que são métodos em Enums?

Em Java, um enum não serve apenas para armazenar constantes. Ele também pode possuir:

Atributos
Construtores
Métodos
Implementar interfaces
Sobrescrever métodos para cada constante

Isso torna os enums muito mais poderosos do que simples listas de valores.

🎯 Para que servem?

Os métodos em enum permitem associar comportamentos diretamente aos valores da enumeração.

Em vez de utilizar vários if ou switch, cada constante pode saber exatamente como deve agir.

Isso torna o código:

Mais organizado;
Mais legível;
Mais orientado a objetos;
Mais fácil de manter.
🛠️ Quando utilizar?

É recomendado utilizar quando:

Cada constante possui um comportamento próprio;
Existe uma lógica específica para cada valor do enum;
Você deseja evitar grandes estruturas de decisão (switch e if/else);
Os comportamentos estão diretamente relacionados às constantes.

Exemplos comuns:

Formas de pagamento;
Tipos de usuário;
Estados de um sistema;
Níveis de acesso;
Estratégias diferentes para cada opção.
🔄 Sobrescrita de Métodos em Enums

Uma das funcionalidades mais interessantes do Java é permitir que cada constante do enum sobrescreva um método.

Na prática, cada valor do enum pode possuir sua própria implementação.

Exemplo de conceito:

PIX pode processar um pagamento de uma forma;
CARTAO de outra;
BOLETO de outra totalmente diferente.

Todos utilizam o mesmo método, porém cada constante executa uma lógica diferente.

Esse conceito é uma aplicação prática de polimorfismo.

✅ Vantagens
Elimina diversos switch.
Facilita manutenção.
Código mais limpo.
Melhor organização.
Segue melhor os princípios da Programação Orientada a Objetos (POO).
Cada constante fica responsável pelo próprio comportamento.
📚 O que aprendi

Durante este estudo aprendi que:

Um enum pode conter muito mais do que apenas constantes.
É possível criar atributos e construtores dentro de um enum.
Enums podem possuir métodos comuns.
Cada constante pode sobrescrever métodos individualmente.
A sobrescrita permite implementar diferentes comportamentos para cada constante.
Essa técnica reduz a necessidade de estruturas condicionais extensas.
O uso de enums com comportamento aproxima o código dos princípios do polimorfismo e da orientação a objetos.
Enums são uma excelente opção quando cada valor possui uma responsabilidade específica.
💡 Conclusão

Antes eu enxergava enum apenas como uma lista de constantes. Agora entendo que ele também pode encapsular comportamentos, tornando o código mais organizado, reutilizável e orientado a objetos.

Sempre que diferentes opções precisarem executar ações distintas, utilizar métodos e sobrescrita dentro de um enum pode ser uma solução elegante e muito mais limpa do que utilizar vários if ou switch.


## 📅 Dia 30

# Abstração, classes abstratas e metodos abstratos

# Métodos Abstratos e Classes Abstratas em Java

## O que é um método abstrato?

Um **método abstrato** é um método que possui apenas a sua **assinatura** (nome, parâmetros e tipo de retorno), mas **não possui implementação** (corpo do método).

Ele é declarado utilizando a palavra-chave `abstract`.

### Exemplo

```java
abstract class Animal {

    public abstract void emitirSom();

}
```

No exemplo acima, o método `emitirSom()` foi declarado, mas não foi implementado.

---

## Para que serve um método abstrato?

O principal objetivo de um método abstrato é **obrigar as classes filhas a fornecerem sua própria implementação**.

Isso garante que todas as subclasses possuam determinado comportamento, mesmo que cada uma o execute de forma diferente.

Exemplo:

```java
abstract class Animal {

    public abstract void emitirSom();

}

class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

}

class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

}
```

Nesse caso, tanto `Cachorro` quanto `Gato` são obrigados a implementar o método `emitirSom()`.

---

## Quando utilizar métodos abstratos?

Os métodos abstratos são utilizados quando existe um comportamento que **todas as subclasses devem possuir**, mas **cada uma implementará de maneira diferente**.

São muito úteis quando:

* Existe uma característica comum entre várias classes.
* Deseja-se padronizar o comportamento das subclasses.
* Cada classe precisa de uma implementação específica para determinada ação.

Exemplos comuns:

* Um sistema de pagamentos (`pagar()`).
* Um jogo com diferentes personagens (`atacar()`).
* Veículos (`ligarMotor()`).
* Animais (`emitirSom()`).

---

# Classes Abstratas

## O que é uma classe abstrata?

Uma **classe abstrata** é uma classe declarada com a palavra-chave `abstract`.

Ela serve como um **modelo (base)** para outras classes.

Uma classe abstrata pode conter:

* Métodos abstratos.
* Métodos comuns (com implementação).
* Atributos.
* Construtores.

Exemplo:

```java
abstract class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public abstract void emitirSom();

}
```

---

## Características das classes abstratas

* Não podem ser instanciadas diretamente.

```java
Animal animal = new Animal(); // Erro
```

* Servem apenas como classe base para herança.

* Podem possuir métodos implementados e métodos abstratos ao mesmo tempo.

* As subclasses são obrigadas a implementar todos os métodos abstratos, caso contrário também deverão ser declaradas como `abstract`.

---

## Exemplo completo

```java
abstract class Animal {

    public abstract void emitirSom();

    public void dormir() {
        System.out.println("Dormindo...");
    }

}

class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

}

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();
        cachorro.dormir();

    }

}
```

Saída:

```
Au Au
Dormindo...
```

---

# Diferença entre método abstrato e método comum

| Método Abstrato                                       | Método Comum                                       |
| ----------------------------------------------------- | -------------------------------------------------- |
| Não possui implementação.                             | Possui implementação.                              |
| É declarado com `abstract`.                           | Não utiliza `abstract`.                            |
| Obriga as subclasses a implementarem o método.        | A implementação já está pronta e pode ser herdada. |
| Só pode existir em classes abstratas (ou interfaces). | Pode existir em qualquer classe.                   |

---

# Resumo

* Um **método abstrato** possui apenas a assinatura e não possui implementação.
* Ele serve para obrigar as subclasses a implementarem determinado comportamento.
* Uma **classe abstrata** funciona como uma classe base que não pode ser instanciada.
* Classes abstratas podem possuir tanto métodos abstratos quanto métodos concretos.
* São utilizadas para compartilhar características comuns e garantir que determinadas funcionalidades sejam implementadas pelas classes filhas.

   
