import javax.swing.JOptionPane;

public class atividade3 {
//Fa�a um programa que pe�a ao usu�rio para informar 03 n�meros e mostre o menor entre eles. 
//Considere que o usu�rio n�o poder� informar n�meros iguais.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[3];
		boolean bOk = true;

		for (int i = 0; i < 3; i++) {
			do {
				bOk = true;
				num[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o " + (i + 1) + "� n�mero:"));

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
			JOptionPane.showMessageDialog(null, num[0], "O menor n�mero seria:", JOptionPane.INFORMATION_MESSAGE);
		} else if (num[1] < num[2]) {
			JOptionPane.showMessageDialog(null, num[1], "O menor n�mero seria:", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, num[2], "O menor n�mero seria:", JOptionPane.INFORMATION_MESSAGE);
		}
		
		/*
		 * 
		 * int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um n�mero:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um segundo n�mero:"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe um terceiro n�mero:"));
		
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			JOptionPane.showMessageDialog(null, "N�meros iguais n�o s�o permitidos, por favor tentar novamente",
					"Mensagem", JOptionPane.INFORMATION_MESSAGE);
		} else if (num1 < num2 || num1 < num3) {
			JOptionPane.showMessageDialog(null, num1, "O menor n�mero seria:", JOptionPane.INFORMATION_MESSAGE);
		} else if (num2 < num3) {
			JOptionPane.showMessageDialog(null, num2, "O menor n�mero seria:", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, num3, "O menor n�mero seria:", JOptionPane.INFORMATION_MESSAGE);
		}
		*/
	}
}
