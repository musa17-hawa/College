// A simple Tester for ChessBoard implementation.

public class Tester{
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        Knight knight1 = new Knight(new Position(3,3));
        Knight knight2 = new Knight(new Position(4,5));
        Knight knight3 = new Knight(new Position(5,6));
        Knight knight4 = new Knight(new Position(6,7));
        Rook rook1 = new Rook(new Position(5,4));
        Rook rook2 = new Rook(new Position(6,6));
        Knight knight5 = new Knight(new Position(6,6)); // will not add a Knight due to its position being taken
        board.addPiece(knight1);
        board.addPiece(knight2);
        board.addPiece(knight3);
        board.addPiece(knight4);
        board.addPiece(rook1);
        board.addPiece(rook2);
        System.out.println(board);
        System.out.println(board.threats(1,0));
        System.out.println(board.threats(1,5));
        System.out.println(board.threats(0,1));
        System.out.println(board.threats(0,4));
        System.out.println(board.whoThreatsWho());
        Position[] p = knight1.moves(knight1.getPosition());
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