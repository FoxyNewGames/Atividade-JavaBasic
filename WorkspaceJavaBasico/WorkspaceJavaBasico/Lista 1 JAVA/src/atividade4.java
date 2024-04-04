import javax.swing.JOptionPane;

public class atividade4 {
//Faça um algoritmo que peça ao usuário 10 números e 
//mostre posteriormente quantos são pares e a soma deles, bem como quantos são ímpares e a soma deles.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerosImpares = 0;
		int numerosPares = 0;
		int impares = 0;
		int pares = 0;
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor: "));
			if (numeros[i] % 2 == 0) {
				numerosPares += 1;
				pares = pares + numeros[i];
				/*
				 * formas de somar 1 número por vez 1 - pares++; 2 - pares += 1; 3 - pares =
				 * pares + 1;
				 */
			} else {
				numerosImpares += 1;
				impares = impares + numeros[i];
				
			}
		}

		JOptionPane.showMessageDialog(null, "Possui um total de " + numerosPares + " Números Pares"
				+ "\nSoma total dos Números Pares digitados seria: " + pares + "\nPossui um total de " + numerosImpares
				+ " Números Impares" + "\nSoma total dos Números Impares digitados seria: " + impares, "Números",
				JOptionPane.INFORMATION_MESSAGE);

		/*
		 * JOptionPane.showMessageDialog(null, "Possui um total de " + numerosPares +
		 * " Números Pares", "Quantidade de números pares",
		 * JOptionPane.INFORMATION_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "Soma total dos Números Pares digitados seria: " + pares,
		 * "Soma dos Numeros Pares", JOptionPane.INFORMATION_MESSAGE);
		 * JOptionPane.showMessageDialog(null, "Possui um total de " + numerosImpares +
		 * " Números Impares", "Quantidade de números Impares",
		 * JOptionPane.INFORMATION_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "Soma total dos Números Impares digitados seria: " + impares,
		 * "Soma dos Numeros Impares", JOptionPane.INFORMATION_MESSAGE);
		 */
	}
}
