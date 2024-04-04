import javax.swing.JOptionPane;

public class atividade2 {
//Desenvolva um programa que pergunte qual é a maioridade civil do seu “estado/país” e
//que posteriormente o usuário informe sua idade. Como resultado, o programa deve informar se ele é ou não maior de idade.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maioridade = Integer
				.parseInt(JOptionPane.showInputDialog("Por favor, informe a maioridade do seu estado/país:"));
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe sua idade:"));
		
		if (idade < maioridade) {
			JOptionPane.showMessageDialog(null, "Você não possui maioridade!", "Mensagem",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Você possui maioridade!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
