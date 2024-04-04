import javax.swing.JOptionPane;

public class atividade6 {
//Crie uma calculadora que permita o cálculo de uma equação, sem limite de execuções definido, da seguinte maneira:
//1. Peça o primeiro valor ,
//2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
//3. Peça um segundo valor 
//4. Efetue o cálculo,
//5. Peça se o usuário quer continuar calculando. Se ele responder que sim, 
//volte para o passo 2 usando o resultado do cálculo da linha 4 como primeiro valor, e se disser que não, mostre o resultado final . 
//Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = 0;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o Primeiro Número:"));
		String opcao;
		do {
			int operacaoAritmetica = Integer
					.parseInt(JOptionPane.showInputDialog("Por favor, escolha uma forma de operação:"
							+ "\n 0 - Para Adição, digite 0" + "\n 1 - Para Divisão, digite 1"
							+ "\n 2 - Para Subtração, digite 2" + "\n 3 - Para Multiplicação, digite 3:"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o Segundo Número:"));
			switch (operacaoAritmetica) {
			case 0:
				resultado = num1 + num2;
				break;
			case 1:
				while (num2 == 0) {
					num2 = Integer.parseInt(JOptionPane.showInputDialog(
							"O segundo número é zero, zero não é divisível, por favor tente novamente!"));
				}
				resultado = num1 / num2;
				break;
			case 2:
				resultado = num1 - num2;
				break;
			case 3:
				resultado = num1 * num2;
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"Número de operação não correspondente, por favor repita o processo", "Algo deu Errado...",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			opcao = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar");
		} while ((opcao.equalsIgnoreCase("S")));
		JOptionPane.showMessageDialog(null, "Resultado Final da operação= " + resultado, "Resultado Final",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
