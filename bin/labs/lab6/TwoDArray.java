public class TwoDArray{
	private int[][] mat;

	public TwoDArray(int a, int b){
		this.mat = new int[a][b];
		for(int i = 0 ; i < a; i++){
			for(int j = 0; j < b; j++){
				this.mat[i][j] = (int)(Math.random()*100);
			}
		}
	}
	public TwoDArray(int[][] mat){
		int matrowlength = mat.length;
		int matcollength = mat[0].length;
		this.mat = new int[matrowlength][matcollength];
		for(int i = 0; i < matrowlength; i++){
			for(int j = 0; j < matcollength; j++){
				this.mat[i][j] = mat[i][j];
			}
		}
	}

	public TwoDArray add(int[][] a){
		int rowlength = a.length;
		int collength = a[0].length;
		if(rowlength != this.mat.length && collength != this.mat[0].length){
			return null;
		}
		int[][] result = new int[rowlength][collength];
		for(int i = 0; i < rowlength; i++){
			for(int j = 0; j < collength; j++){
				result[i][j] = a[i][j] + this.mat[i][j];
			}
		}
	return new TwoDArray(result);
	}

	public boolean isBiggerThanDiagonal(int n){
		int result = 0;
		for(int i = 0; i < this.mat.length && this.isSquared(); i++){
			result+=this.mat[i][i];
		}
		return result == n;
	}

	public boolean isUpperTriangular(){
		for(int i = 1; i < this.mat.length; i++){
			for(int j = 0; j < this.mat[0].length - i; j++){
				if(this.mat[i][j] != 0){
					return false;
				}
			}
		}
		return true;
	}

	public boolean isLowerTriangular(){
		return false;
	}

	public boolean isSquared(){
		return this.mat[0].length == this.mat.length;
	}

	public boolean isUnitMatrix(){
		return false;
	}

	public boolean isInMat(int n){
		return false;
	}

	public int biggerRowSum(){
		return 0;
	}
}