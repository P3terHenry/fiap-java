package br.com.fiap;

import java.util.Scanner;

public class Exercicio02Scan {

	public static void main(String[] args) {
		
		int ano_atual = 0, ano_nascimento = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano atual");
			ano_atual = scan.nextInt();
			System.out.println("Digite seu ano de nascimento");
			ano_nascimento = scan.nextInt();
			System.out.println("Ano atual: " + ano_atual + "\nAno de Nascimento: " +
			ano_nascimento + "\nSua idade é: " + (ano_atual - ano_nascimento));
		} catch (Exception e) {
			System.out.println("Formato de número incorreto.");
		}
	}

}
