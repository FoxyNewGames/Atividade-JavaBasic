import javax.swing.JOptionPane;

public class atividade1 {

//Fa�a um algoritmo que pe�a para o usu�rio inserir uma quantidade em horas, 
//outra em minutos e mais uma em segundos e mostre quantos segundos esse hor�rio cont�m.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSegundos = 0;
		int horas;
		int minutos;
		int segundos;

		do {
			horas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe as horas:"));
		} while (horas < 0);

		do {
			minutos = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe os minutos:"));
		} while (minutos < 0);

		do {
			segundos = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe os segundos:"));
		} while (segundos < 0);

		totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
		
		JOptionPane.showMessageDialog(null, "O total de segundos �: " + totalSegundos, "Total de Segundos", JOptionPane.INFORMATION_MESSAGE);
	}
}