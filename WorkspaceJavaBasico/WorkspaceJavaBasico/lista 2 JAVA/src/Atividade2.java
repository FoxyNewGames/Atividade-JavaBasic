import javax.swing.JOptionPane;

public class Atividade2 {
//Escreva um programa que receba quatro notas do aluno e as insira em um vetor. 
	// Depois, calcule a média aritmética entre as quatro notas e mostre o
	// "conceito" do aluno conforme as instruções:
	// 9.0 ou maior = Conceito A
	// entre 8.0 e 8.9 = Conceito B
	// entre 7.0 e 7.9 = Conceito C
	// menor que 7.0 = Conceito D

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0;
		double[] notas = new double[4];
		for (int i = 0; i < 4; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Por favor digite a " + (i + 1) + "º Nota: "));
			media = media + notas[i];
		}
		media = media / 4;
		if (media >= 9.0) {
			JOptionPane.showMessageDialog(null, "Sua média final seria: " + media + " Conceito A", null,
					JOptionPane.INFORMATION_MESSAGE);
		} else if ((media >= 8.0) && (media < 9)) {
			JOptionPane.showMessageDialog(null, "Sua média final seria: " + media + " Conceito B", null,
					JOptionPane.INFORMATION_MESSAGE);
		} else if ((media >= 7.0) && (media < 8)) {
			JOptionPane.showMessageDialog(null, "Sua média final seria: " + media + " Conceito C", null,
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Sua média final seria: " + media + " Conceito D", null,
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}