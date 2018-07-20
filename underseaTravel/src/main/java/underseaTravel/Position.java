package underseaTravel;

public class Position {
	
	public enum Direction {
		NORTE,
		SUL,
		LESTE,
		OESTE;
	}
	
	private int x, y, z;
	private Direction direction = Direction.NORTE;

	
//	public Position(int x, int y, int z, Direction direction) {
//		this.x = x;
//		this.z = z;
//		this.z = z;
//		this.setDirection(direction);
//	}
	
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
		this.direction = direction;
	}
	
	@Override
	public String toString() {
		return x + " " + y + " " + z + " " + direction;
	}

}
