import javax.swing.JOptionPane;

public class Atividade4 {
	// Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco.
	// Faça um programa que permita ao usuário informar uma quantidade de
	// latão em quilos e forneça o total de cobre e zinco necessários para fabricar
	// essa quantidade.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cobre = 0;
		int zinco = 0;
		int craftLatão = Integer.parseInt(
				JOptionPane.showInputDialog("Por favor, digite a quantidade em Kg de Latão que deseja Fabricar"));
		cobre = (craftLatão * (70/100));
		zinco = (craftLatão * (30/100));

		JOptionPane.showMessageDialog(null,
				"Voçê irá precisar um total de =" + "\n - Cobre: " + cobre + "\n - Zinco: " + zinco,
				"Porcentagem de Matéria Prima", JOptionPane.INFORMATION_MESSAGE);
	}
}
