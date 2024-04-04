import javax.swing.JOptionPane;

public class Atividade3 {
	// Escreva um programa que leia um número inteiro e apresente um menu para o
	// usuário escolher:
	// Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse
	// número);
	// Verificar se o número é par;
	// Verificar se o número está entre 0 e 1000;
	// Sair
	// Após as entradas de dados, deve ser mostrado ao usuário o
	// resultado da respectiva opção escolhida, e novamente o menu. Para a opção
	// “4-Sair”, utilize o comando System.exit(0);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mult;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite um Número"));
		String repetir;
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite uma das opções abaixo: "
					+ "\n 0 - Verificar se o número é múltiplo de algum outro número : "
					+ "\n 1 -  Verificar se o número é par: " + "\n 2 - Verificar se o número está entre 0 e 1000: "
					+ "\n 3 - Sair"));
			switch (opcao) {
			case 0:
				mult = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite o Múltiplo: "));
				if ((num1 % mult) == 0) {
					JOptionPane.showMessageDialog(null, "O número " + num1 + " é Múltiplo", "É Múltiplo",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O número " + num1 + " não é Múltiplo", "Não é Múltiplo",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 1:
				if (num1 % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O " + num1 + " Número digitado é : Par!", "Par ou Impar?",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O " + num1 + " Número digitado é : Impar!", "Par ou Impar?",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 2:
				if ((num1 >= 0) && (num1 <= 1000)) {
					JOptionPane.showMessageDialog(null, "O número " + num1 + "  está entre 0 e 1000", "Sim Está!",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "O Número " + num1 + "  não está entre 0 e 1000",
							"Não, não Está!", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar");
		} while (repetir.equalsIgnoreCase("S"));
	}
}
