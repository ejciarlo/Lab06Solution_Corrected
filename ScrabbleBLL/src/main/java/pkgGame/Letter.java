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
		switch (letter) {
		case 'A':
			iScore = 1;
			break;
		case 'B':
			iScore = 3;
			break;
		case 'C':
			iScore = 3;
			break;
		case 'D':
			iScore = 2;
			break;
		case 'E':
			iScore = 1;
			break;
		case 'F':
			iScore = 4;
			break;
		case 'G':
			iScore = 2;
			break;
		case 'H':
			iScore = 4;
			break;
		case 'I':
			iScore = 1;
			break;
		case 'J':
			iScore = 8;
			break;
		case 'K':
			iScore = 5;
			break;
		case 'L':
			iScore = 1;
			break;
		case 'M':
			iScore = 3;
			break;
		case 'N':
			iScore = 1;
			break;
		case 'O':
			iScore = 1;
			break;
		case 'P':
			iScore = 3;
			break;
		case 'Q':
			iScore = 10;
			break;
		case 'R':
			iScore = 1;
			break;
		case 'S':
			iScore = 1;
			break;
		case 'T':
			iScore = 1;
			break;
		case 'U':
			iScore = 1;
			break;
		case 'V':
			iScore = 4;
			break;
		case 'W':
			iScore = 4;
			break;
		case 'X':
			iScore = 8;
			break;
		case 'Y':
			iScore = 4;
			break;
		case 'Z':
			iScore = 10;
			break;
		case default:
			iScore = 0;
			break;
		}
	}
	
	
	
}
