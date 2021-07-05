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
		// TODO: Create the default puzzle
		// TODO: Loop through each place in the puzzle, insert a 'space' object, value
		// the BonusSquare
		// object if there's a bonus in that cell.
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
	}

}
