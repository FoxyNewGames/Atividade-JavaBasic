import javax.swing.JOptionPane;

public class atividade2 {
//Desenvolva um programa que pergunte qual � a maioridade civil do seu �estado/pa�s� e
//que posteriormente o usu�rio informe sua idade. Como resultado, o programa deve informar se ele � ou n�o maior de idade.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maioridade = Integer
				.parseInt(JOptionPane.showInputDialog("Por favor, informe a maioridade do seu estado/pa�s:"));
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe sua idade:"));
		
		if (idade < maioridade) {
			JOptionPane.showMessageDialog(null, "Voc� n�o possui maioridade!", "Mensagem",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voc� possui maioridade!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
