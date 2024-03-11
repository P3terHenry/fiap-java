package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		Scanner scan; //Declaração de um objeto da Classe.
		try {
			scan = new Scanner(System.in); // Instânciação do objeto da Classe.
			System.out.println("Digite dois números inteiros");
			num1 = scan.nextInt(); //Faz a leitura do console e armazena o valor na varívavel.
			num2 = scan.nextInt(); //Faz a leitura do console e armazena o valor na viariável.
			System.out.println("Valor 1: " + num1 + " \nValor 2: " + num2 
					+ "\nSoma: " + (num1 + num2));
		} catch (Exception e) {
			System.out.println("Formato de número incorreto.");
		}
	}
}
