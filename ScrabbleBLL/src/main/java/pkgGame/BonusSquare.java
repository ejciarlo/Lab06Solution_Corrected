package pkgGame;

import eNum.eBonusType;

public class BonusSquare {

	private int Row;
	private int Col;
	private eBonusType BonusType;
	private boolean Used;
	public BonusSquare(int row, int col, eBonusType bonusType) {
		super();
		Row = row;
		Col = col;
		BonusType = bonusType;
		Used = false;
	}
	public int getRow() {
		return Row;
	}
	public int getCol() {
		return Col;
	}
	public eBonusType getBonusType() {
		return BonusType;
	}
	public boolean isUsed() {
		return Used;
	}
	public void setUsed(boolean used) {
		Used = used;
	}
	
	
	
}
