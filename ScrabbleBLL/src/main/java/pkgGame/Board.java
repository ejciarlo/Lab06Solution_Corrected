package pkgGame;

import java.util.ArrayList;

import eNum.eBonusType;

public class Board {

	private Space[][] puzzle;
	private ArrayList<BonusSquare> bonuses = new ArrayList<BonusSquare>();
	public Board()
	{
		SetBonus();
		puzzle = new Space[15][15];
		for (int Row = 0; Row < 15; Row++)
		{
			for (int Col = 0; Col < 15; Col++)
			{
				Space s = new Space(findBonus(Row,Col));
				puzzle[Row][Col] = s;
			}
		}
	}

	public Space[][] getPuzzle() {
		return puzzle;
	}
	
	private BonusSquare findBonus(int Row, int Col)
	{
		for (BonusSquare bs: this.bonuses)
		{
			if (bs.getRow() == Row && bs.getCol() == Col)
			{
				return bs;
			}
		}
		return null;
	}
	
	private void SetBonus()
	{
		bonuses.add(new BonusSquare(0,0,eBonusType.TripleWord));
		bonuses.add(new BonusSquare(0,7,eBonusType.TripleWord));
		bonuses.add(new BonusSquare(0,14,eBonusType.TripleWord));
		bonuses.add(new BonusSquare(7,0,eBonusType.TripleWord));
		bonuses.add(new BonusSquare(7,14,eBonusType.TripleWord));		
		bonuses.add(new BonusSquare(14,0,eBonusType.TripleWord));
		bonuses.add(new BonusSquare(14,7,eBonusType.TripleWord));
		bonuses.add(new BonusSquare(14,14,eBonusType.TripleWord));		
		
		bonuses.add(new BonusSquare(0,3,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(0,11,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(2,6,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(2,8,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(3,0,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(3,7,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(3,14,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6,2,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6,6,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6,8,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(6,12,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(7,3,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(7,11,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8,2,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8,6,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8,8,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(8,12,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(11,0,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(11,7,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(11,14,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(12,6,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(12,8,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(14,3,eBonusType.DoubleLetter));
		bonuses.add(new BonusSquare(14,11,eBonusType.DoubleLetter));
		
		bonuses.add(new BonusSquare(1,5,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(1,9,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5,1,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5,5,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5,9,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(5,13,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9,1,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9,5,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9,9,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(9,13,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(13,5,eBonusType.TripleLetter));
		bonuses.add(new BonusSquare(13,9,eBonusType.TripleLetter));
		
		
		bonuses.add(new BonusSquare(1,1,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(1,13,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(2,2,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(2,12,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(3,3,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(3,11,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(4,4,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(4,10,eBonusType.DoubleWord));
		
		bonuses.add(new BonusSquare(10,4,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(10,10,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(11,3,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(11,11,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(12,2,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(12,12,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(13,1,eBonusType.DoubleWord));
		bonuses.add(new BonusSquare(13,13,eBonusType.DoubleWord));

		bonuses.add(new BonusSquare(7,7,eBonusType.Star));
	}
	
}
