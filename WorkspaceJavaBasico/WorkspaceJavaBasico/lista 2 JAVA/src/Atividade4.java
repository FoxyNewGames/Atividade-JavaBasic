import javax.swing.JOptionPane;

public class Atividade4 {
	// Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco.
	// Fa�a um programa que permita ao usu�rio informar uma quantidade de
	// lat�o em quilos e forne�a o total de cobre e zinco necess�rios para fabricar
	// essa quantidade.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cobre = 0;
		int zinco = 0;
		int craftLat�o = Integer.parseInt(
				JOptionPane.showInputDialog("Por favor, digite a quantidade em Kg de Lat�o que deseja Fabricar"));
		cobre = (craftLat�o * (70/100));
		zinco = (craftLat�o * (30/100));

		JOptionPane.showMessageDialog(null,
				"Vo�� ir� precisar um total de =" + "\n - Cobre: " + cobre + "\n - Zinco: " + zinco,
				"Porcentagem de Mat�ria Prima", JOptionPane.INFORMATION_MESSAGE);
	}
}
