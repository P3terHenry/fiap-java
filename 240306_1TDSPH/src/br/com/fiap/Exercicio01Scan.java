package br.com.fiap;

import java.util.Scanner;

public class Exercicio01Scan {

	public static void main(String[] args) {
		
		float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite as quatro notas de provas:");
			prova1 = scan.nextFloat();
			prova2 = scan.nextFloat();
			prova3 = scan.nextFloat();
			prova4 = scan.nextFloat();
			System.out.println("Nota da Prova 1: " + prova1 + "\nNota da Prova 2: " 
			+ prova2 + "\nNota da Prova 3: " + prova3 + "\nNota da Prova 4: " + prova4 +
			"\nMédia Aritmética: " + ((prova1 + prova2 + prova3 + prova4) / 4));
		} catch (Exception e) {
			System.out.println("Formato de número incorreto.");
		}
	}
}
