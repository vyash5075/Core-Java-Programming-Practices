/*

 */
package amcat;

/**
 Mooshak the mouse has been placed in a maze.There is a huge chunk of cheese somewhere in the maze. The maze is represented as a two-dimensional array of integers, where 0 represents walls.1 represents paths where mooshak can move and 9 represents the huge chunk of cheese.
 EX: 8 by 8(8*8) matrix maze where Mooshak can get the cheese.

1 0 1 1 1 0 0 1
1 0 0 0 1 1 1 1
1 0 0 0 0 0 0 0
1 0 1 0 9 0 1 1
1 1 1 0 1 0 0 1
1 0 1 0 1 1 0 1
1 0 0 0 0 1 0 1
1 1 1 1 1 1 1 1
* Test Cases:
Case 1:
Input:[[1,1,1,][9,1,1],[0,1,0]]

Expected return value :1

Explanation:
The piece of cheese is placed at(1,0) on the grid Mooshak can move from (0,0) to (1,0) to reach it or can move from (0,0) to (0,1) to (1,1) to (1,0)

Test case 2:
Input: [[0,0,0],[9,1,1],[0,1,1]]

Expected return value: 0
 */
import java.util.*;
public class mooshak {
   public int path(int matrix[][])
   {
       int ROWS=matrix.length;
       int COLS= matrix[0].length;
       int row=0;
       int col=0;
       return(isPath(matrix, matrix.length, matrix[0].length, 0, 0));
       
   }
	private int isPath(int[][] matrix, int ROWS, int COLS, int row, int col) {
           
		if(matrix[row][col] == 9){
			return 1;
		}

		// visit this path
		matrix[row][col] = 2;
		int exist = 0;

		// right
		if(exist==0 && col+ 1 < COLS && (matrix[row][col+1] == 1 || matrix[row][col+1] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row, col+1);
		}


		// down
		if(exist==0 && row+1 < ROWS && (matrix[row+1][col] == 1 || matrix[row+1][col] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row+1, col);
		}

		
		// left
		if(exist==0 && col-1 >=0 && (matrix[row][col-1] == 1 || matrix[row][col-1] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row, col-1);
		}
		
		// top
		if(exist==0 && row-1 >=0 && (matrix[row-1][col] == 1 || matrix[row-1][col] == 9)) {
			exist = isPath(matrix, ROWS, COLS, row-1, col);
		}

		// un-visit this path
		matrix[row][col] = 1;
		return exist;
	}
	
	public static void main(String[] args) {
		mooshak  mcr = new mooshak ();
		
		int matrix[][] = {{1, 0, 1, 1, 1, 0, 0, 1},
						  {1, 0, 0, 0, 1, 1, 1, 1},
						  {1, 0, 0, 0, 0, 0, 0, 0},
						  {1, 0, 1, 0, 9, 0, 1, 1},
						  {1, 1, 1, 0, 1, 0, 0, 1},
						  {1, 0, 1, 0, 1, 1, 0, 1},
						  {1, 0, 0, 0, 0, 1, 0, 1},
						  {1, 1, 1, 1, 1, 1, 1, 1}};
		
		System.out.println(mcr.path(matrix));
//		System.out.println(mcr.isPath(matrix, matrix.length, matrix[0].length, 0, 0));
              
	}

}
