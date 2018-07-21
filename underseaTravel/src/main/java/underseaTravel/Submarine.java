package underseaTravel;

public class Submarine {

	private SubmarineController controller = new SubmarineController(this);
	private Position position = new Position();
	private String errorMessage;
	private int maxDepth = -11034;
	private int minDepth = 0;

	public Position getPosition() {
		return position;
	}

	public String getErrorMessage() {
		String returnMessage = this.errorMessage;
		this.setErrorMessage(null);
		return returnMessage;
	}

	private void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public int getMaxDepth() {
		return maxDepth;
	}

	public void setMaxDepth(int maxDepth) {
		this.maxDepth = maxDepth;
	}

	public int getMinDepth() {
		return minDepth;
	}

	public void setMinDepth(int minDepth) {
		this.minDepth = minDepth;
	}

	public void move(String commands) {
		if (commands != null && !commands.isEmpty()) {
			char[] commandsCharArray = commands.toCharArray();
			executeCommands(commandsCharArray);
		}
	}

	private void executeCommands(char[] commandsCharArray) {
		StringBuilder invalidCommands = new StringBuilder();
		for (char command : commandsCharArray) {
			switch(command) {
				case 'L': 
					controller.turnLeft();
					break;
				case 'R':
					controller.turnRight();
					break;
				case 'M':
					controller.moveStraight();
					break;
				case 'U':
					controller.moveUp();
					break;
				case 'D':
					controller.moveDown();
					break;
				default:
					invalidCommands.append(command);
			}
		}
		if(!invalidCommands.toString().isEmpty()) {
			this.setErrorMessage("Comando(s) \"" + invalidCommands + "\" não reconhecido(s)");
		}
	}
}
