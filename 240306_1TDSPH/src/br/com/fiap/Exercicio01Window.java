package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio01Window {
	
	public static void main(String[] args) {
		
		float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
		String auxiliar;
		try {
			auxiliar = JOptionPane.showInputDialog("Digite a Nota da Prova 1:");
			prova1 = Float.parseFloat(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a Nota da Prova 2:");
			prova2 = Float.parseFloat(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a Nota da Prova 3:");
			prova3 = Float.parseFloat(auxiliar);
			auxiliar = JOptionPane.showInputDialog("Digite a Nota da Prova 4:");
			prova4 = Float.parseFloat(auxiliar);
			JOptionPane.showMessageDialog(null, "Nota da Prova 1: " + prova1 +
					"\nNota da Prova 2: " + prova2 + "\nNota da Prova 3: " +prova3 +
					"\nNota da Prova 4: " + prova4 + "\nMédia Aritimética: " +
					((prova1 + prova2 + prova3 + prova4) / 4));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato de número incorreto.");
		}
	}
}
