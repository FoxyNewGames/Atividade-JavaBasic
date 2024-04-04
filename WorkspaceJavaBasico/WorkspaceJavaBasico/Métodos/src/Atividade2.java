import javax.swing.JOptionPane;

public class Atividade2 {

//Faça um programa que receba as três notas de um aluno e pergunte ao professor qual média ele deseja calcular: 
//aritmética ou ponderada. 
//Se for a média ponderada, os pesos de cada nota devem ser informados.
//Cada média deverá ser calculada por um método;
//Os dois métodos devem receber como parâmetros as notas;
//No caso do método da média ponderada, além das notas, o método deverá receber também os pesos, que
//devem ser previamente solicitados ao usuário;
//Os dois métodos devem retornar a média;
//Um método deve ser criado para receber a média final e mostrar se o aluno está aprovado ou reprovado, 
//considerando que a média mínima para aprovação é 7.

	public static void main(String[] args) {
		// 1º
		double[] notas = new double[3];
		for (int i = 0; i < 3; i++) {
			notas[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Por favor, informe sua " + (i + 1) + "º" + " Nota: "));
			while (notas[i] < 0 || notas[i] > 10) {
				mostraErroNota();
				notas[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Por favor, informe sua " + (i + 1) + "º" + " Nota: "));
			}
			// BigDecimal valor = new BigDecimal("10.00");
			// valor.setScale(2);
			// System.out.println(valor);
		}
		int opcao = Integer.parseInt(JOptionPane
				.showInputDialog("Por favor, digite uma das opções abaixo: " + "\n 1 - Calcular média Aritmética : "
						+ "\n 2 - Calcular média ponderada: " + "\n 3 - Encerrar o Programa: "));
		switch (opcao) {

		case 1:
			calculaAritmetica(notas);
			break;

		case 2:
			double[] pesos = new double[3];
			for (int i = 0; i < 3; i++) {
				pesos[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Por favor, informe os Peso da " + (i + 1) + "º" + " Nota: "));
				while (pesos[i] < 0 || pesos[i] > 10) {
					mostraErroNota();
					pesos[i] = Double.parseDouble(
							JOptionPane.showInputDialog("Por favor, informe os Pesos da " + (i + 1) + "º" + " Nota: "));
				}
			}
			calculaPesos(notas, pesos);
			break;

		case 3:
			System.exit(0);
		default:
			JOptionPane.showMessageDialog(null, "Opção Invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	// 2º
	public static void calculaPesos(double[] notas, double[] pesos) {
		double mediaPonderada = 0;
		double somaPesos = 0;
		for (int i = 0; i < 3; i++) {
			mediaPonderada += pesos[i] * notas[i];
			somaPesos += pesos[i];
		}
		mediaPonderada = mediaPonderada / somaPesos;
		if (mediaPonderada >= 7) {
			JOptionPane.showMessageDialog(null, "\nVocê está Acima da Media! " + "\n" + mediaPonderada);
			mostraAprovacao();
		} else if (mediaPonderada < 7) {
			JOptionPane.showMessageDialog(null, "\nVocê está Abaixo Media! " + "\n" + mediaPonderada);
			mostrarReprovacao();
		}
	}

	public static void calculaAritmetica(double[] notas) {
		double mediaAritmetica = 0;
		for (int i = 0; i < 3; i++) {
			mediaAritmetica += notas[i];
		}
		mediaAritmetica = mediaAritmetica / 3;
		if (mediaAritmetica >= 7) {
			JOptionPane.showMessageDialog(null, "\nVocê está Acima Media! " + "\n" + mediaAritmetica);
			mostraAprovacao();
		} else if (mediaAritmetica < 7) {
			JOptionPane.showMessageDialog(null, "\nVocê está Abaixo Media! " + "\n" + mediaAritmetica);
			mostrarReprovacao();
		}
	}

	// 3º
	public static void mostraErroNota() {
		JOptionPane.showMessageDialog(null, "Por favor, digite uma nota VALIDA!");
	}

	public static void mostraAprovacao() {
		JOptionPane.showMessageDialog(null, "Você está aprovado!");
	}

	public static void mostrarReprovacao() {
		JOptionPane.showMessageDialog(null, "Você está Reprovado!");
	}
}