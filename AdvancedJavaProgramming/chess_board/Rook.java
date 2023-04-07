public class Rook implements ChessPiece{
	private int row, col;
	public Rook(Position p){
		this.row = p.getRow();
		this.col = p.getCol();

	}

    private void addElement(Position[] arr, Position p){
    	for(int i = 0; i < arr.length; i ++){
    		if (arr[i] == null){
    			arr[i] = p;
    			break;
    		}
    	}
    }

	// Position Object p will have p.getRow and p.getCol
    public Position[] moves(Position p) {
        Position[] tmp = new Position[14];
        
        // Check all possible rook moves along the same row
        for (int i = 1; i < 9; i++) {
            if (i != p.getCol()) {
                addElement(tmp, new Position(p.getRow(), i));
            }
        }
        
        // Check all possible rook moves along the same column
        for (int i = 1; i < 9; i++) {
            if (i != p.getRow()) {
                addElement(tmp, new Position(i, p.getCol()));
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
		return "Rook at " + this.getPosition().toString();
	}
}