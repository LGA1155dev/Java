Aprendendo Java e documentando as ferramentas

Dia 1:

aprendendo sobre como funciona a Java Virtual Machine (JVM) e como o bytcode (class) é interpretado por ela.

O fluxo do java até a compilação é o seguinte:

Codigo java (alto nivel) -> Transformado em Class (bytecode) -> Interpretado pela JVM -> Vira baixo nivel e pode ser executado (codigo de maquina)

Dia 2:

Aprendendo a printar hello world e também a pegar a data do computador

import.java.util.Date //Importa a data

public class PrimeiroCodigo { //class é a classe que você pra depois usar ela e transoformar em bytecodes. O nome sempre tera as iniciais Maiusculas.


	public static main (String[] args){ //public static main (String[]...) indica um metodo e nome "main" deve estar sempre em letras minusculas

		Date data = new Date(); //Isso aq é pra pegar a data e hora do sistema, sempre colocar ';' pra indicar o fim da linha

		System.out.println("Hello world"); //Isso aqui é pra exibir algo na tela tipo o print do python.
		System.out.println(data);


	}
}

Dia 3:
	Tipos primitivos no java

	Existem 8: int, double, float, char, byte, short, long, boolean

	int: Muito usado no dia a dia pra guardar números inteiros

	double: bem usado pra guardar números com casas decimais, porém consome mais memoria apesar de não ser o problema hoje

	float: também é usado pra guardar número com casas decimais, porém é usado pra economizar bytes de memoria mas não é tão
	usado quanto o double, é mais usado quando exige baixo nivel ou etc.

	char: guarda um caractere por vez

	byte: Serve pra guardar valores inteiros bem pequenos, usado apenas pra economizar memoria pois o int substitui facil

	short: bem raro usar mas usa se também pra guardar valores

	long: usa-se pra guardar valores extremamente grandes exemplo a quantidade de milissegundos de 1970 até hoje.

	boolean: é uma variavel que guarda true ou false.


