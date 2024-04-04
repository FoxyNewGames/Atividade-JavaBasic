import javax.swing.JOptionPane;

public class atividade3 {
//Faça um programa que peça ao usuário para informar 03 números e mostre o menor entre eles. 
//Considere que o usuário não poderá informar números iguais.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[3];
		boolean bOk = true;

		for (int i = 0; i < 3; i++) {
			do {
				bOk = true;
				num[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o " + (i + 1) + "º número:"));

				switch (i) {
				case 1:
					if (num[1] == num[0]) {
						bOk = false;
					}
					break;
				case 2:
					if ((num[2] == num[0]) || (num[2] == num[1])) {
						bOk = false;
					}
					break;
				}
			} while (!bOk);
			// !bOk => bOk == false
		}

		if (num[0] < num[1] || num[0] < num[2]) {
			JOptionPane.showMessageDialog(null, num[0], "O menor número seria:", JOptionPane.INFORMATION_MESSAGE);
		} else if (num[1] < num[2]) {
			JOptionPane.showMessageDialog(null, num[1], "O menor número seria:", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, num[2], "O menor número seria:", JOptionPane.INFORMATION_MESSAGE);
		}
		
		/*
		 * 
		 * int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um número:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um segundo número:"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um terceiro número:"));
		
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			JOptionPane.showMessageDialog(null, "Números iguais não são permitidos, por favor tentar novamente",
					"Mensagem", JOptionPane.INFORMATION_MESSAGE);
		} else if (num1 < num2 || num1 < num3) {
			JOptionPane.showMessageDialog(null, num1, "O menor número seria:", JOptionPane.INFORMATION_MESSAGE);
		} else if (num2 < num3) {
			JOptionPane.showMessageDialog(null, num2, "O menor número seria:", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, num3, "O menor número seria:", JOptionPane.INFORMATION_MESSAGE);
		}
		*/
	}
}
