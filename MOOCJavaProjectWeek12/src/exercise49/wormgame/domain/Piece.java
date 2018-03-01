package exercise49.wormgame.domain;

public class Piece {

	private int x;
	private int y;
	
	public Piece(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean runsInto(Piece piece) {
		return this.equals(piece);
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		
		Piece otherPiece = (Piece) obj;
		if (x == otherPiece.x && y == otherPiece.y)
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder outValue = new StringBuilder("(");
		outValue.append(x).append(",").append(y).append(")");
		
		return outValue.toString();
	}
}
