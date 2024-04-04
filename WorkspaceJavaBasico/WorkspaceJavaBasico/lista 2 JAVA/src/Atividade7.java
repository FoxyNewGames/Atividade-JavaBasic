import javax.swing.JOptionPane;

public class Atividade7 {
	// Um estudante do ensino m�dio gostaria de controlar melhor suas notas nas
	// disciplinas exatas.
	// Ele gostaria de poder enxergar suas notas dos 4 bimestres com exatamente duas
	// casas decimais e
	// em formato de matriz, como no exemplo a seguir:
	// Al�m disso, o estudante gostaria de poder escolher algumas op��es de
	// visualiza��o de acordo com o menu abaixo:
	// Todas as notas de todas as disciplinas;
	// Qual a maior nota e em qual disciplina foi;
	// A m�dia das notas de alguma disciplina (solicitar qual);
	// As notas de um dos bimestres (solicitar qual);
	// Encerrar.
	// Fa�a um programa que permita cadastrar as notas de acordo com o
	// exemplo (considerando a ordem das disciplinas) e forne�a os dados
	// supracitados.
	// O menu deve ser exibido repetitivamente, at� que o usu�rio deseje encerrar o
	// programa.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		double fisica = 0;
		double quimica = 0;
		String repetir = "";
		double maiorNota = 0;
		boolean achei = false;
		double matematica = 0;
		String bimestre1 = "";
		String bimestre2 = "";
		String bimestre3 = "";
		String bimestre4 = "";
		int escolhaMateria = 0;
		int escolhaBimestre = 0;
		double[][] notas = new double[4][3];
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 3; c++) {
				do {
					if (c == 0) {
						notas[l][c] = Double
								.parseDouble(JOptionPane.showInputDialog("Uma Nota de cada vez para cada Mat�ria!"
										+ "\n - Por favor informe sua Nota em Matem�tica: "));
					} else if (c == 1) {
						notas[l][c] = Double
								.parseDouble(JOptionPane.showInputDialog("Uma Nota de cada vez para cada Mat�ria!"
										+ "\n - Por favor, informe sua Nota em Qu�mica: "));
					} else if (c == 2) {
						notas[l][c] = Double
								.parseDouble(JOptionPane.showInputDialog("Uma Nota de cada vez para cada Mat�ria!"
										+ "\n - Por favor, informe sua Nota em F�sica: "));
					}
				} while (notas[l][c] > 10 || notas[l][c] < 0);

				if (notas[l][c] > maiorNota) {
					maiorNota = notas[l][c];
				}
			}
			matematica += notas[l][0];
			quimica += notas[l][1];
			fisica += notas[l][2];
		}
		fisica = fisica / 4;
		quimica = quimica / 4;
		matematica = matematica / 4;
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Por favor, digite uma das op��es abaixo: " + "\n 0 - Todas as notas de todas as disciplinas: "
							+ "\n 1 - Qual a maior nota e em qual disciplina foi: "
							+ "\n 2 - A m�dia das notas de alguma disciplina (solicitar qual): "
							+ "\n 3 - As notas de um dos bimestres (solicitar qual): " + "\n 4 - Encerrar: "));
			switch (opcao) {
			case 0:
				// Todas as notas de todas as disciplinas;
				msg = msg + "Mat " + "     Fis�ca " + "    Quimica" + "\n";
				for (int l = 0; l < 4; l++) {
					for (int c = 0; c < 3; c++) {
						msg = msg + notas[l][c] + "           ";
					}
					msg = msg + "\n";
				}
				JOptionPane.showMessageDialog(null, msg);
				break;
			case 1:
				// Qual a maior nota e em qual disciplina foi;
				for (int l = 0; l < 4; l++) {
					for (int c = 0; c < 3; c++) {
						if (notas[l][c] == maiorNota && achei == false && c == 0) {
							JOptionPane.showMessageDialog(null,
									"Maior Nota na Mat�ria:" + "\n Matem�tica: " + maiorNota, "",
									JOptionPane.INFORMATION_MESSAGE);
							achei = true;
						}
						if (notas[l][c] == maiorNota && achei == false && c == 1) {
							JOptionPane.showMessageDialog(null, "Maior Nota na Mat�ria:" + "\n F�sica: " + maiorNota,
									"", JOptionPane.INFORMATION_MESSAGE);
							achei = true;
						}
						if (notas[l][c] == maiorNota && achei == false && c == 2) {
							JOptionPane.showMessageDialog(null, "Maior Nota na Mat�ria:" + "\n Qu�mica: " + maiorNota,
									"", JOptionPane.INFORMATION_MESSAGE);
							achei = true;
						}
					}
				}
				break;
			case 2:
				// A m�dia das notas de alguma disciplina (solicitar qual);
				do {
					escolhaMateria = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Por favor, Digite 1, 2, ou 3 para a determinado Mat�ria Desejado:" + "\n 1 - Matem�tica"
									+ "\n 2 - Fisica" + "\n 3 - Quimica"));
				} while (escolhaMateria > 3 || escolhaMateria < 0);
				if (escolhaMateria == 1) {
					JOptionPane.showMessageDialog(null, matematica, "M�dia das Notas de Matem�tica: ",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (escolhaMateria == 2) {
					JOptionPane.showMessageDialog(null, fisica, "M�dia das Notas de Fis�ca: ",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (escolhaMateria == 3) {
					JOptionPane.showMessageDialog(null, quimica, "M�dia das Notas de Qu�mica: ",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 3:
				// As notas de um dos bimestres (solicitar qual);
				// falta arrumar o information message
				do {
					escolhaBimestre = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Por favor, Digite 1, 2, 3 ou 4 para o determinado Bimestre Desejado" + "\n 1 - Bimestre 1 "
									+ "\n 2 - Bimestre 2" + "\n 3 - Bimestre 3" + "\n 4 - Bimestre 4"));
				} while (escolhaBimestre > 4 || escolhaBimestre < 0);
				bimestre1 = bimestre1 + "Mat " + "     Fis�ca " + "    Quimica" + "\n";
				if (escolhaBimestre == 1) {
					for (int c = 0; c < 3; c++) {
						bimestre1 = bimestre1 + notas[0][c] + "       ";
					}
				} else if (escolhaBimestre == 2) {
					bimestre2 = bimestre2 + "Mat " + "     Fis�ca " + "    Quimica" + "\n";
					for (int c = 0; c < 3; c++) {
						bimestre2 = bimestre2 + notas[1][c] + "        ";
					}
					JOptionPane.showMessageDialog(null, bimestre2, "Notas do 2� Bimestre: ",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (escolhaBimestre == 3) {
					bimestre3 = bimestre3 + "Mat " + "     Fis�ca " + "    Quimica" + "\n";
					for (int c = 0; c < 3; c++) {
						bimestre3 = bimestre3 + notas[2][c] + "        ";
					}

					JOptionPane.showMessageDialog(null, bimestre3, "Notas do 3� Bimestre: ",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (escolhaBimestre == 4) {
					bimestre4 = bimestre4 + "Mat " + "     Fis�ca " + "    Quimica" + "\n";
					for (int c = 0; c < 3; c++) {
						bimestre4 = bimestre4 + notas[3][c] + "        ";
					}
					JOptionPane.showMessageDialog(null, bimestre4, "Notas do 4� Bimestre: ",
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 4:
				// Encerrar.
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Op��o Invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			achei = false;
			bimestre1 = "";
			bimestre2 = "";
			bimestre3 = "";
			bimestre4 = "";
			repetir = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar");
		} while (repetir.equalsIgnoreCase("S"));
	}
}