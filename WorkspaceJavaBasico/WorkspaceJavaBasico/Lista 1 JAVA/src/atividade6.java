import javax.swing.JOptionPane;

public class atividade6 {
//Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de execu��es definido, da seguinte maneira:
//1. Pe�a o primeiro valor ,
//2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
//3. Pe�a um segundo valor 
//4. Efetue o c�lculo,
//5. Pe�a se o usu�rio quer continuar calculando. Se ele responder que sim, 
//volte para o passo 2 usando o resultado do c�lculo da linha 4 como primeiro valor, e se disser que n�o, mostre o resultado final . 
//Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = 0;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o Primeiro N�mero:"));
		String opcao;
		do {
			int operacaoAritmetica = Integer
					.parseInt(JOptionPane.showInputDialog("Por favor, escolha uma forma de opera��o:"
							+ "\n 0 - Para Adi��o, digite 0" + "\n 1 - Para Divis�o, digite 1"
							+ "\n 2 - Para Subtra��o, digite 2" + "\n 3 - Para Multiplica��o, digite 3:"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o Segundo N�mero:"));
			switch (operacaoAritmetica) {
			case 0:
				resultado = num1 + num2;
				break;
			case 1:
				while (num2 == 0) {
					num2 = Integer.parseInt(JOptionPane.showInputDialog(
							"O segundo n�mero � zero, zero n�o � divis�vel, por favor tente novamente!"));
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
						"N�mero de opera��o n�o correspondente, por favor repita o processo", "Algo deu Errado...",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			opcao = JOptionPane.showInputDialog(
					"Deseja voltar ao menu? " + "\n Digite S para sim ou outro caractere para encerrar");
		} while ((opcao.equalsIgnoreCase("S")));
		JOptionPane.showMessageDialog(null, "Resultado Final da opera��o= " + resultado, "Resultado Final",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
