import javax.swing.JOptionPane;

public class atividade8 {
//Faça um programa que carregue os valores das vendas de uma loja no primeiro semestre do ano. 
//Considere para tal uma matriz [6,4], sendo que são 06 meses e 04 semanas por mês. Ao final, mostre na tela: 
//Total de vendas do semestre
//Total vendido em cada mês

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] somaMes = new int[6];
		int somaSemestre = 0;

		for (int l = 0; l < 6; l++) {
			JOptionPane.showMessageDialog(null, "Por favor digite as vendas da " + (l + 1) + "º mês:", "Vendas do Mês",
					JOptionPane.INFORMATION_MESSAGE);
			for (int c = 0; c < 4; c++) {
				int[][] valores = new int[6][4];
				valores[l][c] = Integer.parseInt(JOptionPane.showInputDialog(
						"Por favor digite as vendas da " + (c + 1) + "º semana: ", "Vendas da Semana!"));
				somaMes[l] = somaMes[l] + valores[l][c];
			}
			somaSemestre = somaSemestre + somaMes[l];
		}
		for (int contadora = 0; contadora < 4; contadora++) {
			JOptionPane.showMessageDialog(null,
					"Total de vendas/lucro no " + (contadora + 1) + "º mês: " + (somaMes[contadora]),
					"Total de vendas/lucro no Mês!", JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, "Total de vendas/lucro Semestral: ",
				"Total de vendas/lucro Semestral!" + somaSemestre, JOptionPane.INFORMATION_MESSAGE);
	}
}
