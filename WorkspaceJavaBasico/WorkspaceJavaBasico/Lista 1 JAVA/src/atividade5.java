import javax.swing.JOptionPane;

public class atividade5 {
//Faça um algoritmo que mostre a soma de todos os valores pares entre o 
//intervalo de dois números digitados pelo usuário.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares = 0;
		int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um número para inicio:"));
		int numeroFinal = Integer
				.parseInt(JOptionPane.showInputDialog("Por favor, informe um segundo número para final:"));
		for (int i = numeroInicial; i <= numeroFinal; i++) {
			if ((i % 2) == 0) {
				pares = pares + i;
			}
		}
		JOptionPane.showMessageDialog(null, "Soma total dos Números Pares digitados seria: " + pares,
				"Soma dos Numeros Pares", JOptionPane.INFORMATION_MESSAGE);
	}
}
