import javax.swing.JOptionPane;

public class Treinamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stud

		int peso = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite seu peso"));
		while (peso <= 0) {
			mostraErroPeso();
			peso = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite seu peso"));
		}
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite sua Altura"));
		while (altura <= 0) {
			mostraErroPeso();
			altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor, digite sua Altura"));
		}
		double imc = calculaIndice(peso, altura);
		verificaIndice(imc);
	}

	public static double calculaIndice(int peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	}

	public static void verificaIndice(double imc) {
		if (imc < 17) {
			JOptionPane.showMessageDialog(null, "Você está muito abaixo do peso! Ìndice: " + imc);
		} else if (imc == 17 || imc <= 18.49) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso! Ìndice: " + imc);
		} else if (imc <= 24.99) {
			JOptionPane.showMessageDialog(null, "Você está com o peso adequado! Ìndice: " + imc);
		} else if (imc <= 29.99) {
			JOptionPane.showMessageDialog(null, "Você está acima do peso! Ìndice: " + imc);
		} else if (imc <= 34.99) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade tipo 1! Ìndice: " + imc);
		} else if (imc <= 39.99) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade tipo 2! Ìndice: " + imc);
		} else if (imc >= 40) {
			JOptionPane.showMessageDialog(null, "Você está com obesidade tipo 3! Ìndice: " + imc);
		}
	}

	public static void mostraErroPeso() {
		JOptionPane.showMessageDialog(null, "O peso digitado é INVALIDO", "Dados Invalidos",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void mostraErroAltura() {
		JOptionPane.showMessageDialog(null, "A altura digitada é INVALIDA", "Dados Invalidos",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
