import javax.swing.JOptionPane;

public class Atividade1 {

// Fa�a um programa que solicite o ano de nascimento de um usu�rio e seja
// mostrada a sua idade em 2021.
// N�o � necess�rio considerar se o usu�rio j� fez ou n�o anivers�rio. Um m�todo
// deve ser criado para
// solicitar o ano de nascimento ao usu�rio e retorn�-lo, e outro m�todo deve
// ser criado para
// receber o ano de nascimento, calcular a idade atual e mostr�-la.

	public static void main(String[] args) {
		// TODO Auto-generated method stud
//Segunda parte do codigo
		int armazenResultado = verificaIdade();
		calculaIdade(armazenResultado);
	}

//Terceira parte
	public static void calculaIdade(int anoNascimento) {
		int calculaIdade = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, calculaIdade, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
	}

//Primeira parte do codigo
	public static int verificaIdade() {
		int anoNascimento = Integer
				.parseInt(JOptionPane.showInputDialog("Por favor, digite o Ano em que voc� nasceu: "));
		while (anoNascimento > 2021) {
			mostraErroanoNascimento();
			anoNascimento = Integer
					.parseInt(JOptionPane.showInputDialog("Por favor, digite o Ano em que voc� nasceu:"));
		}
		return anoNascimento;
	}

	public static void mostraErroanoNascimento() {
		JOptionPane.showMessageDialog(null, "O ano de Nascimento digitado � INVALIDO");
	}
}