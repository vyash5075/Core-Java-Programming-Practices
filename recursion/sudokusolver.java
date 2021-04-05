    package strings;
    //input  {1,2,3,4,5}
    //  2
    
    //output [4,5,1,2,3,]
    import java.util.*;
     class newbie {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int arr[][]=new int [9][9];
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    arr[i][j]=sc.nextInt();
                    
                }
            }
            sudokusolver(arr,0,0);
      
        
    }
        
        
       public static boolean isValid(int board[][],int x,int y, int val){
            for(int j=0;j<9;j++){
                if(board[x][j]==val){
                    return false;
                }
                    
                } 
            for(int i=0;i<9;i++){
                if(board[i][y]==val){
                    return false;
                }
                    
                }
            
            int smi=3*x/3;
            int smj=3*y/3;
            
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(board[i+smi][j+smj]==val){
                        return false;
                    }
                }
            }
            return true;  
        }
       
       public static void display(int board[][]){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                   System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
       }
        public static void sudokusolver(int board[][],int i,int j){
            if(i==board.length){
                display(board);
                return;
            }
            int ni=0;
            int nj=0;
            if(j==board[0].length-1){
                ni=i+1;
                j=0;
            }else{
                ni=i;
                nj=j+1;
            }
            if(board[i][j]!=0){
                sudokusolver(board,ni,nj);
            }
            else{
                for(int po=1;po<=9;po++){
                    if(isValid(board,i,j,po)==true){
                        board[i][j]=po;
                        sudokusolver(board,ni,nj);
                        board[i][j]=0;
                    }
                }
            }
        }
     }
