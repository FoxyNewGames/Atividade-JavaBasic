import javax.swing.JOptionPane;

public class Atividade1 {
	// Fa�a um programa que receba um vetor de valores e mostre a quantidade de
	// valores negativos. Os valores e o tamanho do vetor devem ser informados pelo
	// usu�rio.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valoresNegativos = 0;
		int tamanhoVetor = 0;
		tamanhoVetor = Integer.parseInt(
				JOptionPane.showInputDialog("Por favor digite a quantidade de valores que deseja an�lisar: "));
		
		int[] valoresQuantidade = new int[tamanhoVetor];
		for (int i = 0; i < tamanhoVetor; i++) {
			valoresQuantidade[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Por favor digite o " + (i + 1) + "� n�mero", "Valores a Serem An�lisados!"));
			if (valoresQuantidade[i] < 0) {
				valoresNegativos = valoresNegativos + 1;
			}
		}
		JOptionPane.showMessageDialog(null, valoresNegativos, "A soma dos negativos seria:",
				JOptionPane.INFORMATION_MESSAGE);
	}
}