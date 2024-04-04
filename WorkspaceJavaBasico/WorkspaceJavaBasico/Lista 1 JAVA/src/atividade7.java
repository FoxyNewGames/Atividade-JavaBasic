import javax.swing.JOptionPane;

public class atividade7 {
//Faça uma solução que alimente um vetor com 10 valores inteiros e 
//também que solicite ao usuário a entrada de dados de um valor inteiro qualquer. 
//A solução deverá fazer uma busca do valor, informado pelo usuário, no vetor e 
//imprima a posição em que este foi encontrado ou se não foi encontrado.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean achei = false;
		int contadora2 = 0;
		int[] valoresInteiros = new int[10];
		for (int contadora1 = 0; contadora1 < 10; contadora1++) {
			valoresInteiros[contadora1] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o " + (contadora1 + 1) + "º valor: "));
		}
		int numBusca = Integer
				.parseInt(JOptionPane.showInputDialog("Informe o número que deseja encontrar :", "Busca"));
		for (int contadora1 = 0; contadora1 < 10; contadora1++) {
			contadora2 += 1;
			if (valoresInteiros[contadora1] == numBusca) {
				JOptionPane.showMessageDialog(null, "Número Encontrado na Posição: " + contadora2, "Parabens!",
						JOptionPane.INFORMATION_MESSAGE);
				achei = true;
			}
		}
		if (achei == false) {
			JOptionPane.showMessageDialog(null, "Número NÃO Encontrado!", "F", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}