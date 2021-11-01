package pkgGame;

import java.util.ArrayList;

import eNum.eBonusType;

public class Board {

	private Space[][] puzzle;
	private ArrayList<BonusSquare> bonuses = new ArrayList<BonusSquare>();

	/**
	 * Board - Constructor. Create the board, set the Space / Bonus Square for each
	 * square in the board
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 */
	public Board() {
		// TODO: Call SetBonus() to set the original bonus setup
		SetBonus();
		// TODO: Create the default puzzle
		puzzle = new Space[15][15];
		// TODO: Loop through each place in the puzzle, insert a 'space' object, value
		// the BonusSquare
		// object if there's a bonus in that cell.
		for (r = 0; r < 15; r++) {
			for (c = 0; c < 15; c++) {
				for (bon = 0; bon < bonuses.size(); bon++) {
					if (r == bonuses[bon].getRow() && c == bonuses[bon].getCol()) {
						puzzle[r][c] = Space(bonuses[bon]);
						break;
					}
					if (bon == bonuses.size() - 1) {
						puzzle[r][c] = Space(r, c);
					}
				}
			}
		}
	}

	public Space[][] getPuzzle() {
		return puzzle;
	}

	/**
	 * findBonus - interrogate the bonuses ArrayList and return the bonus square if
	 * there is one
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 * @param Row
	 * @param Col
	 * @return
	 */
	private BonusSquare findBonus(int Row, int Col) {
		for (BonusSquare bs : this.bonuses) {
			if (bs.getRow() == Row && bs.getCol() == Col) {
				return bs;
			}
		}
		return null;
	}

	/**
	 * SetBonus - This method will set the bonuses ArrayList with all the bonus
	 * squares in the game
	 * 
	 * @author BRG
	 * @version Lab #6
	 * @since Lab #6
	 */
	private void SetBonus() {
		// TODO: Set the bonus squares. Use the default / class Scrabble settings.
		bonuses.add(BonusSquare(0, 0, eBonusType.TripleWord));
		bonuses.add(BonusSquare(0, 3, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(0, 7, eBonusType.TripleWord));
		bonuses.add(BonusSquare(0, 11, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(0, 14, eBonusType.TripleWord));
		bonuses.add(BonusSquare(1, 1, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(1, 5, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(1, 9, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(1, 13, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(2, 2, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(2, 6, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(2, 8, eBonusType.eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(2, 12, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(3, 0, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(3, 3, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(3, 7, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(3, 11, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(3, 14, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(4, 4, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(4, 10, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(5, 1, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(5, 5, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(5, 9, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(5, 13, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(6, 2, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(6, 6, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(6, 8, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(6, 12, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(7, 0, eBonusType.TripleWord));
		bonuses.add(BonusSquare(7, 3, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(7, 7, eBonusType.Star));
		bonuses.add(BonusSquare(7, 11, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(7, 14, eBonusType.TripleWord));
		bonuses.add(BonusSquare(8, 2, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(8, 6, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(8, 8, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(8, 12, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(9, 1, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(9, 5, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(9, 9, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(9, 13, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(10, 4, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(10, 10, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(11, 0, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(11, 3, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(11, 7, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(11, 11, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(11, 14, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(12, 2, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(12, 6, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(12, 8, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(12, 12, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(13, 1, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(13, 5, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(13, 9, eBonusType.TripleLetter));
		bonuses.add(BonusSquare(13, 13, eBonusType.DoubleWord));
		bonuses.add(BonusSquare(14, 0, eBonusType.TripleWord));
		bonuses.add(BonusSquare(14, 3, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(14, 7, eBonusType.TripleWord));
		bonuses.add(BonusSquare(14, 11, eBonusType.DoubleLetter));
		bonuses.add(BonusSquare(14, 14, eBonusType.TripleWord));
	}

}
