package underseaTravel;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Submarine submarine = new Submarine();
		
		boolean finished = false;
		
		do {
			String input = JOptionPane.showInputDialog("Digite as coordenadas para o submarino");
			submarine.move(input);
			
			String message = "A posição do submarino é: \n"
					+ submarine.getPosition()
					+ "\n\n\n deseja enviar novas coordenadas?";
			
			int dialogResult = JOptionPane.showConfirmDialog(null, message, "Resultado", JOptionPane.YES_NO_OPTION);
			
			if(dialogResult == JOptionPane.NO_OPTION) {
				finished = true;
			}
		} while (!finished);

	}

}
