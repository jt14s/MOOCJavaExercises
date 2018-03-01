package exercise49.wormgame.domain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import exercise49.wormgame.Direction;

public class Worm {

	private List<Piece> wormPieces;
	private Direction direction;
	private boolean growFlag;
	
	public Worm(int originalX, int originalY, Direction originalDirection) {
		wormPieces = new LinkedList<>(Arrays.asList(new Piece(originalX, originalY)));
		this.direction = originalDirection;
		growFlag = false;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public int getLength() {
		return getPieces().size();
	}
	
	public List<Piece> getPieces() {
		return wormPieces;
	}
	
	public void move() {
		if (wormPieces.size() < 3)
			grow();
		
		if (growFlag == false)
			wormPieces.remove(0);
		
		Piece headPiece = wormPieces.get(wormPieces.size() - 1);
		if (direction == Direction.LEFT) {
			wormPieces.add(new Piece(headPiece.getX() - 1, headPiece.getY()));
		} else if (direction == Direction.RIGHT) {
			wormPieces.add(new Piece(headPiece.getX() + 1, headPiece.getY()));
		} else if (direction == Direction.UP) {
			wormPieces.add(new Piece(headPiece.getX(), headPiece.getY() - 1));
		} else if (direction == Direction.DOWN) {
			wormPieces.add(new Piece(headPiece.getX(), headPiece.getY() + 1));
		}
		
		growFlag = false;
	}
	
	public void grow() {
		growFlag = true;	
	}
	
	public boolean runsInto(Piece piece) {		
		if (wormPieces.get(0).runsInto(piece))
				return true;
		
		return false;
	}
	
	public boolean runsIntoItself() {
		boolean ranIntoItself = false;
		
		for (int i = 0; i < wormPieces.size() - 1; ++i) {
			for (int j = i + 1; j < wormPieces.size(); ++j) {
				if (wormPieces.get(i).runsInto(wormPieces.get(j))) {
					ranIntoItself = true;
					break;
				}
			}
			if (ranIntoItself)
				break;
		}
		
		return ranIntoItself;
	}
}
