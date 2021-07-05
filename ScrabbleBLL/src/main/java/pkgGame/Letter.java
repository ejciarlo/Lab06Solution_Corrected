package pkgGame;

public class Letter {

	private Character chLetter;
	private int iScore;
	
	public Letter(Character chLetter) {
		super();
		this.chLetter = chLetter;
		SetDefaultScore(chLetter);
	}
	
	public Character getChLetter() {
		return chLetter;
	}

	public int getiScore() {
		return iScore;
	}

	private void SetDefaultScore(Character letter)
	{
//		0 Points - Blank tile.
//		1 Point - A, E, I, L, N, O, R, S, T and U.
//		2 Points - D and G.
//		3 Points - B, C, M and P.
//		4 Points - F, H, V, W and Y.
//		5 Points - K.
//		8 Points - J and X.
//		10 Points - Q and Z.
		
		//TODO: Set iScore based on the given letter.  A = 1, B = 3, etc
	}
	
	
	
}
