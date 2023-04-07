public class ChessBoard{
	private ChessPiece[] pieces;

	public ChessBoard(){
		this.pieces = new ChessPiece[10];
	}

	// this method will add p to ChessPiece List, if it is already full, it wont do anything
	public void addPiece(ChessPiece p){
		int i = 0;
		while(i < this.pieces.length){
			if (this.pieces[i] == null){
				break;
			}
			i++;
		}
		this.pieces[i] = p;
		
	}

	public boolean threats(int p1, int p2){
		if(p1 >= this.pieces.length || p2 >= this.pieces.length){
			return false;
		}

		ChessPiece pieceOne = this.pieces[p1];
		ChessPiece pieceTwo = this.pieces[p2];
		if (pieceOne == null || pieceTwo == null){
			return false;
		}
		int row = pieceTwo.getPosition().getRow();
		int col = pieceTwo.getPosition().getCol();
		Position[] possibleMoves = pieceOne.moves(pieceOne.getPosition());
		for(Position possibleMove : possibleMoves){
			if (possibleMove.getRow() == row && possibleMove.getCol() == col){
				return true;
			}
		}
		return false;
	}

	public String whoThreatsWho(){
		String result = "";
		for(int i = 0; i < this.pieces.length; i++){
			for(int j = 0; j < this.pieces.length; j++){
				if (i == j){
					continue;
				}
				else if(threats(i,j))
					result = result + this.pieces[i].toString() + " threats " + this.pieces[j].toString() + "\n";
			}
		}
		return result;


	}
	// will print out a list of all the pieces in the chess board and for each piece it will print out he type of the piece
	// in addition it will print out the possible moves it could perform, new line for each piece 
	public String toString(){
		String result = "";
		for (ChessPiece chessPiece : pieces) {
			if (chessPiece == null){
				break;
			}
			result = result + chessPiece + "\n";

		}
		return result;
	}
}