import javax.swing.JOptionPane;

public class atividade7 {
//Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e 
//tamb�m que solicite ao usu�rio a entrada de dados de um valor inteiro qualquer. 
//A solu��o dever� fazer uma busca do valor, informado pelo usu�rio, no vetor e 
//imprima a posi��o em que este foi encontrado ou se n�o foi encontrado.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean achei = false;
		int contadora2 = 0;
		int[] valoresInteiros = new int[10];
		for (int contadora1 = 0; contadora1 < 10; contadora1++) {
			valoresInteiros[contadora1] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe o " + (contadora1 + 1) + "� valor: "));
		}
		int numBusca = Integer
				.parseInt(JOptionPane.showInputDialog("Informe o n�mero que deseja encontrar :", "Busca"));
		for (int contadora1 = 0; contadora1 < 10; contadora1++) {
			contadora2 += 1;
			if (valoresInteiros[contadora1] == numBusca) {
				JOptionPane.showMessageDialog(null, "N�mero Encontrado na Posi��o: " + contadora2, "Parabens!",
						JOptionPane.INFORMATION_MESSAGE);
				achei = true;
			}
		}
		if (achei == false) {
			JOptionPane.showMessageDialog(null, "N�mero N�O Encontrado!", "F", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}