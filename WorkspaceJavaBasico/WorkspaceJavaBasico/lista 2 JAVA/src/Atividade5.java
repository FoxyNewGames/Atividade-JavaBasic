import javax.swing.JOptionPane;

public class Atividade5 {
	// Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um
	// clube.
	// O programa deve solicitar a idade, se a pessoa � fumante ou
	// n�o (1- SIM, 2- N�O), seu sal�rio l�quido e h� quanto tempo frequenta o clube
	// (em meses).
	// O usu�rio dever� digitar �encerrar� quando n�o tiver mais pessoas para
	// registrar. Como dados de sa�da, o programa deve exibir:
	// A m�dia das idades das pessoas;
	// A m�dia salarial das pessoas;
	// Quantos s�o fumantes e quantos n�o s�o fumantes;
	// A porcentagem de pessoas que frequentam o clube h� mais de 03 meses.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0;
		int usuario = 0;
		int fumante = 0;
		String repetir;
		int frequencia = 0;
		int frequente = 0;
		int contadora = 0;
		double salario = 0;
		int naoFumante = 0;
		int mediaIdade = 0;
		double mediasalario = 0;
		do {
			contadora = contadora + 1;
			do {
				idade = Integer.parseInt(JOptionPane.showInputDialog("\n Informe os dados Abaixo:" + "\n - Idade:"));
				mediaIdade = mediaIdade + idade;
			} while (idade < 18);

			do {
				usuario = Integer.parseInt(JOptionPane
						.showInputDialog("\n Informe os dados Abaixo:" + "\n - Voc� � Fumante? (1 - SIM/ 2 - N�O):"));
			} while ((usuario != 1) && (usuario != 2));
			if (usuario == 1) {
				fumante = fumante + 1;
			} else {
				naoFumante = naoFumante + 1;
			}
			frequencia = Integer.parseInt(JOptionPane
					.showInputDialog("\n Informe os dados Abaixo:" + "\n - Frequencia em Meses no Estabelecimento:"));
			if (frequencia >= 3) {
				frequente = frequente + 1;
			}
			salario = Integer
					.parseInt(JOptionPane.showInputDialog("\n Informe os dados Abaixo:" + "\n - Sal�rio Liquido:"));
			mediasalario = mediasalario + salario;

			repetir = JOptionPane.showInputDialog("Cadastrar Pessoas?" + "\n Digite encerrar para encerrar o programa"
					+ " \n Digite qualquer outro caractere para continuar um novo cadastro");

		} while (!repetir.equals("encerrar"));
		mediaIdade = mediaIdade / contadora;
		mediasalario = mediasalario / contadora;

		JOptionPane.showMessageDialog(null,
				"\n Media Idade: " + mediaIdade + "\n Media dos sal�rios: " + mediasalario + "\n Total de Fumantes: "
						+ fumante + "\n Total de N�o-Fumantes: " + naoFumante
						+ "\n Pessoas frequentes ao estabeleicimento: " + frequente,
				"Medias Gerais", JOptionPane.INFORMATION_MESSAGE);
	}

}