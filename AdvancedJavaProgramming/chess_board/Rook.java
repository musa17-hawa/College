/*

File Description:

This code defines a class Rook that implements the ChessPiece interface.

The Rook class has a constructor that takes a Position object and sets the row and col variables of the Rook object accordingly.

The Rook class has a private method addElement that adds a Position object to an array of Position objects.

The Rook class also has a public method moves that takes a Position object and returns an array of all the valid moves that a Rook can make from that position.

The method first creates an array of Position objects called tmp that can hold up to 14 elements.

Then, the method checks all possible rook moves along the same row and adds them to tmp.

Next, the method checks all possible rook moves along the same column and adds them to tmp.

Finally, the method trims the tmp array to the number of non-null elements it contains and returns the resulting array of Position objects.

The Rook class also has a public method getPosition that returns a Position object representing the current position of the Rook object,

and a toString method that returns a string representation of the Rook object.

End of File Description

*/

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