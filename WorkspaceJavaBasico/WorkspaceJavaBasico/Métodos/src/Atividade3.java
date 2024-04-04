import javax.swing.JOptionPane;

public class Atividade3 {

//Faça um programa que a partir do valor de uma compra, faça o cálculo de um desconto para o usuário. 
//O programa deve solicitar o valor total da compra por meio de um método, que deverá retorná-lo. 
//Um método deve ser criado para receber o valor da compra e mostrar o valor final com desconto, considerando:
//Até R$100 - sem desconto, o valor permanece o mesmo
//De R$100,01 a R$200 - desconto de 20%
//Acima de R$200 - desconto de 30%
	public static void main(String[] args) {

		double armazenResultado = verificaValorcompra();
		calculaValorcompra(armazenResultado);
	}

	public static void calculaValorcompra(double compraValor) {
		double calculaValorcompra = 0;
		double armazenValor = 0;

		if (compraValor <= 100) {
			compraValor = calculaValorcompra = compraValor;
			JOptionPane.showMessageDialog(null,
					"\nValor Digitado não possui Desconto!" + "\nTotal a Pagar: " + calculaValorcompra);

		} else if (compraValor >= 100.01 && compraValor <= 200) {
			armazenValor = compraValor;
			compraValor = compraValor * 20;
			compraValor = compraValor / 100;
			calculaValorcompra = compraValor;
			calculaValorcompra = armazenValor - compraValor;
			JOptionPane.showMessageDialog(null,
					"\nValor Digitado Possui Desconto!" + "\nTotal a Pagar: " + calculaValorcompra);
		} else if (compraValor >= 200) {
			armazenValor = compraValor;
			compraValor = compraValor * 30;
			compraValor = compraValor / 100;
			calculaValorcompra = compraValor;
			calculaValorcompra = armazenValor - compraValor;
			JOptionPane.showMessageDialog(null,
					"\nValor Digitado Possui Desconto!" + "\nTotal a Pagar: " + calculaValorcompra);
		}
	}

	public static double verificaValorcompra() {
		double compraValor = Double.parseDouble(
				JOptionPane.showInputDialog("Por favor, digite o valor da compra para aplicar desconto: "));
		while (compraValor <= 0) {
			mostraErroValor();
			compraValor = Double.parseDouble(
					JOptionPane.showInputDialog("Por favor, digite o valor da compra para aplicar desconto: "));
		}
		return compraValor;
	}

	public static void mostraErroValor() {
		JOptionPane.showMessageDialog(null, "O Valor da compra digitado é INVALIDO");
	}
}