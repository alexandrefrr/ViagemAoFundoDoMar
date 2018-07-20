package underseaTravel;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		boolean finished = false;
		
		do {
			 
			String input = JOptionPane.showInputDialog("Digite as coordenadas para o submarino");
			
			String message = "A posição do submarino é: "
					+ "POSICAO AQUI"
					+ "\n\n\n deseja enviar novas coordenadas?";
			
			int dialogResult = JOptionPane.showConfirmDialog(null, message, "Warning", JOptionPane.YES_NO_OPTION);
			
			if(dialogResult == JOptionPane.NO_OPTION) {
				finished = true;
			}
		} while (!finished);

	}

}
