package underseaTravel;

public class Submarine {

	private Position position = new Position();

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void move(String commands) {
		if (commands != null && !commands.isEmpty()) {
			char[] commandsCharArray = commands.toCharArray();
			executeCommands(commandsCharArray);
		}
	}

	private void executeCommands(char[] commandsCharArray) {
		for (char command : commandsCharArray) {
			// decidir aqui o que cada comando faz (fazer um switch-case) 
			System.out.println("comando: " + command);
		}
	}

}
