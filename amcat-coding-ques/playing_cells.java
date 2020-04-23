
package amcat;
import java.util.*;
/*
Question 1: There is a colony of 8 cells arranged in a straight line where each day every cell competes with its adjacent cells(neighbour).
Each day, for each cell, if its neighbours are both active or both inactive, the cell becomes inactive the next day, otherwise it becomes active the next day.

Assumptions:
The two cells on the ends have single adjacent cell, so the other adjacent cell can be assumsed to be always inactive.
Even after updating the cell state. consider its pervious state for updating the state of other cells. Update the cell information of all cells simultaneously.
Write a fuction cellCompete which takes takes one 8 element array of integers cells representing the current state of 8 cells and one integer days representing te number of days to simulate.
An integer value of 1 represents an active cell and value of 0 represents an inactive cell.

TEST CASES 1:

INPUT:
[1,0,0,0,0,1,0,0],1
EXPECTED RETURN VALUE:
[0,1,0,0,1,0,1,0]

TESTCASE 2:

INPUT:
[1,1,1,0,1,1,1,1,],2

EXPECTED RETURN VALUE:
[0,0,0,0,0,1,1,0]
*/
public class playing_cells {
 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[8];
	    for(int i=0;i<8;i++){
	        arr[i]=sc.nextInt();
	    }
	    int k = sc.nextInt();
        findFinalCell(arr, k);
    }
    private static void findFinalCell(int[] cell, int day) {
        int newCell[] = new int[8];
        for (int d = 0; d < day; d++) {
            for (int i = 0; i < cell.length; i++) {
                newCell[i] = cell[i];
            }
            if (newCell[1] == 1) {
                cell[0] = 1;
            } else {
                cell[0] = 0;
            }
            for (int j = 1; j <= 6; j++) {
                cell[j] = newCell[j-1] ^ newCell[j + 1];
            }
            if(newCell[6]==1){
                cell[7]=1;
            }else {
                cell[7]=0;
            }
        }
        Arrays.stream(cell).forEach(s-> System.out.print(s+" "));
    }
}   
