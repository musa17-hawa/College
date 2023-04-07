public class Tester{

	public static void main(String[] args) {
		ChessBoard board = new ChessBoard();
		Knight night1 = new Knight(new Position(3,3));
		Knight night2 = new Knight(new Position(4,5));
		Knight night3 = new Knight(new Position(5,6));
		Knight night4 = new Knight(new Position(6,7));
		Rook rook1 = new Rook(new Position(5,4));
		Rook rook2 = new Rook(new Position(6,6));
		board.addPiece(night1);
		board.addPiece(night2);
		board.addPiece(night3);
		board.addPiece(night4);
		board.addPiece(rook1);
		board.addPiece(rook2);
		System.out.println(board);
		System.out.println(board.threats(1,0));
		System.out.println(board.threats(1,5));
		System.out.println(board.threats(0,1));
		System.out.println(board.threats(0,4));
		System.out.println(board.whoThreatsWho());
		Position[] p = night1.moves(night1.getPosition());
		for(Position elem : p){
			System.out.println(elem.toString());
		}
		System.out.println(" ");
		Position[] r = rook1.moves(rook1.getPosition());
		for(Position elem : r){
			System.out.println(elem.toString());
		}
	}
}
