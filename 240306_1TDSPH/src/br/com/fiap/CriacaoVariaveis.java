package br.com.fiap;

public class CriacaoVariaveis {
	
	public static void main(String[] args) {
		//Declaração de variável
		char sexo;
		//Inicialização da variável (Atribuindo um valor)
		sexo = 'F';
		//Declarar e inicializar a variável
		byte idade = 25;
		short codigo = 15650;
		int alunos = 50, turmas = 11; //Se as variáveis forem do mesmo tipo, pode colocar na mesma liinha
		long brasileiros = 216635748; //Armazena valores até quintilhão
		float media = 8.7f;
		double cotacaoDoDolar = 4.95;
		boolean alternativa = false; //true
		//Exibição dos valores com println
		System.out.println("Sexo: " + sexo + " Idade: " + idade);
		System.out.println("Booleano: " + alternativa);
	}
}
