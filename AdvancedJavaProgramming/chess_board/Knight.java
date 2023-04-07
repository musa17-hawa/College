public class Knight implements ChessPiece{
	private int row, col;
	public Knight(Position p){
		this.row = p.getRow();
		this.col = p.getCol();
	}

    private boolean isValidMove(int row, int col) {
        // Check that the position is within the bounds of the chessboard
        return row >= 1 && row <= 8 && col >= 1 && col <= 9;
    }

    private void addElement(Position[] arr, Position p){
    	for(int i = 0; i < arr.length; i ++){
    		if (arr[i] == null){
    			arr[i] = p;
    			break;
    		}
    	}
    }

	public Position[] moves(Position p){
		Position[] tmp = new Position[8];

     	int[][] possibleMoves = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        for (int[] possiblePosition : possibleMoves) {
            int newRow = p.getRow() + possiblePosition[0];
            int newCol = p.getCol() + possiblePosition[1];
            if (isValidMove(newRow, newCol)) {
                addElement(tmp, new Position(newRow, newCol));
            }
        }
        
        int i = 0;
        while (i < tmp.length){
        	if(tmp[i] == null){
        		break;
        	}
        	i++;
        }

        Position[] moves = new Position[i];
        for(int j = 0; j<moves.length; j++){
        	moves[j] = tmp[j];
        } 
        return moves;
    }
    

	public Position getPosition(){
		return new Position(this.row, this.col);
	}

	public String toString(){
		return "Knight at " + getPosition().toString();
	}
}