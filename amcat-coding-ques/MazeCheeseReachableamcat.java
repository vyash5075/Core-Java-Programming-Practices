
public class MazeCheeseReachableamcat
 {

	private boolean isPath(int[][] matrix, int ROWS, int COLS, int row, int col) {
		if(matrix[row][col] == 9){
			return true;
		}

		// visit this path
		matrix[row][col] = 2;
		boolean exist = false;

		// right
		if(!exist && col+ 1 < COLS && (matrix[row][col+1] == 1 || matrix[row][col+1] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row, col+1);
		}


		// down
		if(!exist && row+1 < ROWS && (matrix[row+1][col] == 1 || matrix[row+1][col] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row+1, col);
		}

		
		// left
		if(!exist && col-1 >=0 && (matrix[row][col-1] == 1 || matrix[row][col-1] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row, col-1);
		}
		
		// top
		if(!exist && row-1 >=0 && (matrix[row-1][col] == 1 || matrix[row-1][col] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row-1, col);
		}

		// un-visit this path
		matrix[row][col] = 1;
		return exist;
	}
	
	public static void main(String[] args) {
		MazeCheeseReachable mcr = new MazeCheeseReachable();
		
		int matrix[][] = {{1, 0, 1, 1, 1, 0, 0, 1},
						  {1, 0, 0, 0, 1, 1, 1, 1},
						  {1, 0, 0, 0, 0, 0, 0, 0},
						  {1, 0, 1, 0, 9, 0, 1, 1},
						  {1, 1, 1, 0, 1, 0, 0, 1},
						  {1, 0, 1, 0, 1, 1, 0, 1},
						  {1, 0, 0, 0, 0, 1, 0, 1},
						  {1, 1, 1, 1, 1, 1, 1, 1}};
		
		
		System.out.println(mcr.isPath(matrix, matrix.length, matrix[0].length, 0, 0));
	}

}