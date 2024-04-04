import javax.swing.JOptionPane;

public class Atividade1 {

// Faça um programa que solicite o ano de nascimento de um usuário e seja
// mostrada a sua idade em 2021.
// Não é necessário considerar se o usuário já fez ou não aniversário. Um método
// deve ser criado para
// solicitar o ano de nascimento ao usuário e retorná-lo, e outro método deve
// ser criado para
// receber o ano de nascimento, calcular a idade atual e mostrá-la.

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
				.parseInt(JOptionPane.showInputDialog("Por favor, digite o Ano em que você nasceu: "));
		while (anoNascimento > 2021) {
			mostraErroanoNascimento();
			anoNascimento = Integer
					.parseInt(JOptionPane.showInputDialog("Por favor, digite o Ano em que você nasceu:"));
		}
		return anoNascimento;
	}

	public static void mostraErroanoNascimento() {
		JOptionPane.showMessageDialog(null, "O ano de Nascimento digitado é INVALIDO");
	}
}