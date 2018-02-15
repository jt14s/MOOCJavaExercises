package exercise33.dungeon;

public class DungeonPawn {

	private int 	x,
					y;
	private char symbol;
	
	public DungeonPawn(int x, int y, char symbol) {
		this.x = x;
		this.y = y;
		this.symbol = symbol;
	}
	
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	@Override
	public String toString() {
		return symbol + " " + x + " " + y;
	}
}
