package underseaTravel;


public class Position {
	
	public static enum Direction {
		NORTE,
		LESTE,
		SUL,
		OESTE;
	}
	
	private int x, y, z;
	private Direction direction = Direction.NORTE;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		if (direction != null)
			this.direction = direction;
	}
	
	@Override
	public String toString() {
		return x + " " + y + " " + z + " " + direction;
	}

}
