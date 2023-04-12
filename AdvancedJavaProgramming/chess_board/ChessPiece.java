// interface ChessPiece yet to be implemented in Knight and Rook classes

public interface ChessPiece{
	public abstract Position[] moves(Position p);
	public abstract Position getPosition();
}