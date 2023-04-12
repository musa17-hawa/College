public class Knight implements ChessPiece{
	private int row, col;
    // Constructor takes a Position object and sets the initial position of the Knight
    public Knight(Position p){
        this.row = p.getRow();
        this.col = p.getCol();
    }

    // Helper function to check if the given position is valid on the chessboard.
    private boolean isValidMove(int row, int col) {
    // Check that the position is within the bounds of the chessboard
        return row >= 1 && row <= 8 && col >= 1 && col <= 9;
    }

    // Helper function to add a new element to an array of Positions.
    private void addElement(Position[] arr, Position p){
        for(int i = 0; i < arr.length; i ++){
            if (arr[i] == null){
                arr[i] = p;
                break;
            }
        }
    }

    // Returns an array of all the possible moves that the Knight can make from the given position.
    public Position[] moves(Position p) {
    // Initialize an array to hold all the possible moves.
        Position[] tmp = new Position[8];

    // Define all the possible moves that a Knight can make.
        int[][] possibleMoves = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

    // Check each possible move and add it to the array if it is valid.
        for (int[] possiblePosition : possibleMoves) {
            int newRow = p.getRow() + possiblePosition[0];
            int newCol = p.getCol() + possiblePosition[1];
            if (isValidMove(newRow, newCol)) {
                addElement(tmp, new Position(newRow, newCol));
            }
        }

    // Copy the non-null elements of the temporary array to a new array that will be returned.
        int i = 0;
        while (i < tmp.length) {
            if (tmp[i] == null) {
                break;
            }
            i++;
        }
        Position[] moves = new Position[i];
        for (int j = 0; j < i; j++) {
            moves[j] = tmp[j];
        }
        return moves;
    }
    
    // Returns the current position of the Knight.
    public Position getPosition(){
        return new Position(this.row, this.col);
    }

    // Retruns the Knight piece informaiton including its position as a string
    public String toString(){
        return "knight at " + getPosition().toString();
    }
}