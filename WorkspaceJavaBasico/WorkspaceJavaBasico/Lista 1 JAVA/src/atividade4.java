import javax.swing.JOptionPane;

public class atividade4 {
//Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e 
//mostre posteriormente quantos s�o pares e a soma deles, bem como quantos s�o �mpares e a soma deles.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerosImpares = 0;
		int numerosPares = 0;
		int impares = 0;
		int pares = 0;
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� valor: "));
			if (numeros[i] % 2 == 0) {
				numerosPares += 1;
				pares = pares + numeros[i];
				/*
				 * formas de somar 1 n�mero por vez 1 - pares++; 2 - pares += 1; 3 - pares =
				 * pares + 1;
				 */
			} else {
				numerosImpares += 1;
				impares = impares + numeros[i];
				
			}
		}

		JOptionPane.showMessageDialog(null, "Possui um total de " + numerosPares + " N�meros Pares"
				+ "\nSoma total dos N�meros Pares digitados seria: " + pares + "\nPossui um total de " + numerosImpares
				+ " N�meros Impares" + "\nSoma total dos N�meros Impares digitados seria: " + impares, "N�meros",
				JOptionPane.INFORMATION_MESSAGE);

		/*
		 * JOptionPane.showMessageDialog(null, "Possui um total de " + numerosPares +
		 * " N�meros Pares", "Quantidade de n�meros pares",
		 * JOptionPane.INFORMATION_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "Soma total dos N�meros Pares digitados seria: " + pares,
		 * "Soma dos Numeros Pares", JOptionPane.INFORMATION_MESSAGE);
		 * JOptionPane.showMessageDialog(null, "Possui um total de " + numerosImpares +
		 * " N�meros Impares", "Quantidade de n�meros Impares",
		 * JOptionPane.INFORMATION_MESSAGE); JOptionPane.showMessageDialog(null,
		 * "Soma total dos N�meros Impares digitados seria: " + impares,
		 * "Soma dos Numeros Impares", JOptionPane.INFORMATION_MESSAGE);
		 */
	}
}
