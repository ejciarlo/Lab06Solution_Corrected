package pkgGame;

public class Space {

	private BonusSquare bonusSquare;
	private Letter letter;
	
	public Space(Letter Letter)
	{
		this.letter = Letter;
	}
	public Space(BonusSquare bs) {
		super();
		this.bonusSquare = bs;
	}

	public Space() {
		super();
	}
	public BonusSquare getBonusSquare() {
		return bonusSquare;
	}
	public Letter getLetter() {
		return letter;
	}


	
	
}
