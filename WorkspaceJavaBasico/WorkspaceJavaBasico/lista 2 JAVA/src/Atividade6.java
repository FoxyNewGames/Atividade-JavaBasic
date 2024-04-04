import javax.swing.JOptionPane;

public class Atividade6 {
	// Uma empresa deseja saber alguns dados sobre suas vendas no passado.
	// Fa�a um programa que armazene em um vetor o valor total das vendas de cada um
	// dos 12 meses do ano (que dever� ser informado pelo usu�rio) e mostre:
	// O m�s com a maior venda;
	// O m�s com a menor venda;
	// A m�dia das vendas do ano todo;
	// A m�dia das vendas dos meses pares;
	// A m�dia das vendas do 2� semestre.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menorVenda = 0;
		int maiorVenda = 0;
		int mediaPares = 0;
		double mediaAno = 0;
		boolean achei = false;
		int media2semestre = 0;
		int[] vendas = new int[12];
		for (int i = 0; i < 12; i++) {
			vendas[i] = Integer.parseInt(JOptionPane.showInputDialog(
					"Por favor digite as Vendas de cada M�s que deseja an�lisar:" + "\n M�s " + (i + 1) + "�: "));
			if (vendas[i] > maiorVenda) {
				maiorVenda = vendas[i];
			}
			if (i == 0) {
				menorVenda = vendas[0];
			}
			if (vendas[i] < menorVenda) {
				menorVenda = vendas[i];
			}
			mediaAno = mediaAno + vendas[i];
			if (i % 2 == 0) {
				mediaPares = mediaPares + vendas[i];
			}
			if (i > 5) {
				media2semestre = media2semestre + vendas[i];
			}
		}
		mediaAno = mediaAno / 12;
		mediaPares = mediaPares / 6;
		media2semestre = media2semestre / 6;
		for (int i = 0; i < 12; i++) {
			if (vendas[i] == maiorVenda && achei == false) {
				JOptionPane.showMessageDialog(null, "R$" + maiorVenda, "M�s com a maior venda:" + "\n M�s:" + (i + 1) + "�",
						JOptionPane.INFORMATION_MESSAGE);
				achei = true;
			}
		}
		achei = false;
		for (int i = 0; i < 12; i++) {
			if (vendas[i] == menorVenda && achei == false) {
				JOptionPane.showMessageDialog(null, menorVenda, "M�s com a menor venda: " + "\n M�s:" + (i + 1) + "�",
						JOptionPane.INFORMATION_MESSAGE);
				achei = true;
			}
		}
		JOptionPane.showMessageDialog(null, mediaAno, "M�dia das vendas do ano todo:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaPares, "M�dia das vendas dos meses pares: ",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, media2semestre, "M�dia das vendas do 2� semestre: ",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
