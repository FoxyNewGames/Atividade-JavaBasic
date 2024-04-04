import javax.swing.JOptionPane;

public class Atividade2 {

//Fa�a um programa que receba as tr�s notas de um aluno e pergunte ao professor qual m�dia ele deseja calcular: 
//aritm�tica ou ponderada. 
//Se for a m�dia ponderada, os pesos de cada nota devem ser informados.
//Cada m�dia dever� ser calculada por um m�todo;
//Os dois m�todos devem receber como par�metros as notas;
//No caso do m�todo da m�dia ponderada, al�m das notas, o m�todo dever� receber tamb�m os pesos, que
//devem ser previamente solicitados ao usu�rio;
//Os dois m�todos devem retornar a m�dia;
//Um m�todo deve ser criado para receber a m�dia final e mostrar se o aluno est� aprovado ou reprovado, 
//considerando que a m�dia m�nima para aprova��o � 7.

	public static void main(String[] args) {
		// 1�
		double[] notas = new double[3];
		for (int i = 0; i < 3; i++) {
			notas[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Por favor, informe sua " + (i + 1) + "�" + " Nota: "));
			while (notas[i] < 0 || notas[i] > 10) {
				mostraErroNota();
				notas[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Por favor, informe sua " + (i + 1) + "�" + " Nota: "));
			}
			// BigDecimal valor = new BigDecimal("10.00");
			// valor.setScale(2);
			// System.out.println(valor);
		}
		int opcao = Integer.parseInt(JOptionPane
				.showInputDialog("Por favor, digite uma das op��es abaixo: " + "\n 1 - Calcular m�dia Aritm�tica : "
						+ "\n 2 - Calcular m�dia ponderada: " + "\n 3 - Encerrar o Programa: "));
		switch (opcao) {

		case 1:
			calculaAritmetica(notas);
			break;

		case 2:
			double[] pesos = new double[3];
			for (int i = 0; i < 3; i++) {
				pesos[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Por favor, informe os Peso da " + (i + 1) + "�" + " Nota: "));
				while (pesos[i] < 0 || pesos[i] > 10) {
					mostraErroNota();
					pesos[i] = Double.parseDouble(
							JOptionPane.showInputDialog("Por favor, informe os Pesos da " + (i + 1) + "�" + " Nota: "));
				}
			}
			calculaPesos(notas, pesos);
			break;

		case 3:
			System.exit(0);
		default:
			JOptionPane.showMessageDialog(null, "Op��o Invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	// 2�
	public static void calculaPesos(double[] notas, double[] pesos) {
		double mediaPonderada = 0;
		double somaPesos = 0;
		for (int i = 0; i < 3; i++) {
			mediaPonderada += pesos[i] * notas[i];
			somaPesos += pesos[i];
		}
		mediaPonderada = mediaPonderada / somaPesos;
		if (mediaPonderada >= 7) {
			JOptionPane.showMessageDialog(null, "\nVoc� est� Acima da Media! " + "\n" + mediaPonderada);
			mostraAprovacao();
		} else if (mediaPonderada < 7) {
			JOptionPane.showMessageDialog(null, "\nVoc� est� Abaixo Media! " + "\n" + mediaPonderada);
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
			JOptionPane.showMessageDialog(null, "\nVoc� est� Acima Media! " + "\n" + mediaAritmetica);
			mostraAprovacao();
		} else if (mediaAritmetica < 7) {
			JOptionPane.showMessageDialog(null, "\nVoc� est� Abaixo Media! " + "\n" + mediaAritmetica);
			mostrarReprovacao();
		}
	}

	// 3�
	public static void mostraErroNota() {
		JOptionPane.showMessageDialog(null, "Por favor, digite uma nota VALIDA!");
	}

	public static void mostraAprovacao() {
		JOptionPane.showMessageDialog(null, "Voc� est� aprovado!");
	}

	public static void mostrarReprovacao() {
		JOptionPane.showMessageDialog(null, "Voc� est� Reprovado!");
	}
}