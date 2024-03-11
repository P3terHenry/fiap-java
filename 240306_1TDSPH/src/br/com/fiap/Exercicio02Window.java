package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio02Window {

	public static void main(String[] args) {
		
		int ano_atual = 0, ano_nascimento = 0;
		String auxiliar;
		try {
			auxiliar = JOptionPane.showInputDialog("Digite o ano atual:");
			ano_atual = Integer.parseInt(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a sua data de nascimento:");
			ano_nascimento = Integer.parseInt(auxiliar);
			JOptionPane.showMessageDialog(null, "Ano atual: " + ano_atual +
					"\nAno de Nascimento: " + ano_nascimento + "\nSua idade é: " +
					(ano_atual - ano_nascimento));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato do número incorreto.");
		}
	}

}
