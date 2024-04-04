import javax.swing.JOptionPane;

public class Atividade3 {
	// Escreva um programa que leia um n�mero inteiro e apresente um menu para o
	// usu�rio escolher:
	// Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse
	// n�mero);
	// Verificar se o n�mero � par;
	// Verificar se o n�mero est� entre 0 e 1000;
	// Sair
	// Ap�s as entradas de dados, deve ser mostrado ao usu�rio o
	// resultado da respectiva op��o escolhida, e novamente o menu. Para a op��o
	// �4-Sair�, utilize o comando System.exit(0);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mult;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite um N�mero"));
		String repetir;
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite uma das op��es abaixo: "
					+ "\n 0 - Verificar se o n�mero � m�ltiplo de algum outro n�mero : "
					+ "\n 1 -  Verificar se o n�mero � par: " + "\n 2 - Verificar se o n�mero est� entre 0 e 1000: "
					+ "\n 3 - Sair"));
			switch (opcao) {
			case 0:
				mult = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o M�ltiplo: "));
				if ((num1 % mult) == 0) {
					JOptionPane.showMessageDialog(null, "O n�mero " + num1 + " � M�ltiplo", "� M�ltiplo",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O n�mero " + num1 + " n�o � M�ltiplo", "N�o � M�ltiplo",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 1:
				if (num1 % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O " + num1 + " N�mero digitado � : Par!", "Par ou Impar?",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O " + num1 + " N�mero digitado � : Impar!", "Par ou Impar?",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 2:
				if ((num1 >= 0) && (num1 <= 1000)) {
					JOptionPane.showMessageDialog(null, "O n�mero " + num1 + "  est� entre 0 e 1000", "Sim Est�!",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O N�mero " + num1 + "  n�o est� entre 0 e 1000",
							"N�o, n�o Est�!", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar");
		} while (repetir.equalsIgnoreCase("S"));
	}
}
