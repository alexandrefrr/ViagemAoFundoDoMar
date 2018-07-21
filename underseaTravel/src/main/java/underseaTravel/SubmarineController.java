package underseaTravel;

public class SubmarineController {
	
	Submarine submarine;
	SubmarineController(Submarine submarine) {
		this.submarine = submarine;
	}

	public void turnRight() {
		Position position = submarine.getPosition();
		Position.Direction newDirection = null;
		Position.Direction actualDirection = position.getDirection();
		
		if(actualDirection == Position.Direction.NORTE)
			newDirection = Position.Direction.LESTE;
		else if(actualDirection == Position.Direction.LESTE)
			newDirection = Position.Direction.SUL;
		else if(actualDirection == Position.Direction.SUL)
			newDirection = Position.Direction.OESTE;
		else if(actualDirection == Position.Direction.OESTE)
			newDirection = Position.Direction.NORTE;
		
		position.setDirection(newDirection);
	}
	
	public void turnLeft() {
		Position position = submarine.getPosition();
		Position.Direction newDirection = null;
		Position.Direction actualDirection = position.getDirection();
		
		if(actualDirection == Position.Direction.NORTE)
			newDirection = Position.Direction.OESTE;
		else if(actualDirection == Position.Direction.OESTE)
			newDirection = Position.Direction.SUL;
		else if(actualDirection == Position.Direction.SUL)
			newDirection = Position.Direction.LESTE;
		else if(actualDirection == Position.Direction.LESTE)
			newDirection = Position.Direction.NORTE;
		
		position.setDirection(newDirection);
	}

	public void moveStraight() {
		Position position = submarine.getPosition();
		Position.Direction actualDirection = position.getDirection();
		int actualX = position.getX();
		int actualY = position.getY();
		
		if(actualDirection == Position.Direction.NORTE)
			position.setY(++actualY);
		else if(actualDirection == Position.Direction.SUL)
			position.setY(--actualY);
		else if(actualDirection == Position.Direction.LESTE)
			position.setX(++actualX);
		else if(actualDirection == Position.Direction.OESTE)
			position.setX(--actualX);
	}
	
	public void moveUp() {
		Position position = submarine.getPosition();
		int actualZ = position.getZ();
		if(actualZ < submarine.getMinDepth())
			position.setZ(++actualZ);
	}
	
	public void moveDown() {
		Position position = submarine.getPosition();
		int actualZ = position.getZ();
		if(actualZ > submarine.getMaxDepth())
			position.setZ(--actualZ);
		
	}
}
