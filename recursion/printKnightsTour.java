    package strings;
   //3
  //[111, 12, 21, 3] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
        
          
          System.out.println("enter the coordinates of starting position");
          int r=sc.nextInt();
          int c=sc.nextInt();
          int chess[][]=new int[n][n];
          printKnightsTour(chess,r,c,1);
        }
          
        
        
        public static void printKnightsTour(int chess[][],int r, int c,int move){
            
            if(r<0||c<0||r>=chess.length||c>=chess.length||chess[r][c]>0){
                return;
            }
            else if(move==chess.length*chess.length){
                chess[r][c]=move;
                displaychessboard(chess);
                chess[r][c]=0;
                return;
            }
            chess[r][c]=move;
               printKnightsTour(chess,r-2,c+1,move+1);
                printKnightsTour(chess,r-1,c+2,move+1);
                printKnightsTour(chess,r+1,c+2,move+1);
                printKnightsTour(chess,r+2,c+1,move+1);
                 printKnightsTour(chess,r+2,c-1,move+1);
                printKnightsTour(chess,r+1,c-2,move+1);
                printKnightsTour(chess,r-1,c+2,move+1);
                printKnightsTour(chess,r-2,c+1,move+1);
                chess[r][c]=    0;
                
               
           
      
        }
        
        public static void displaychessboard(int chess[][]){
            System.out.print(" s");
            for(int i=0;i<chess.length;i++){
                for(int j=0;j<chess.length;j++){
                    System.out.print(chess[i][j]+" ");
                }
            }
        }
        public static boolean isItSafePlaceForTheQueen(int chess[][],int row,int col){
            for(int i=row-1,j=col;i>=0;i--){
                if(chess[i][j]==1){
                    return false;
                }
            }
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(chess[i][j]==1){
                    return false;
                }
            }
            for(int i=row-1,j=col+1;i>=0&&j<chess.length;i--,j++){
                if(chess[i][j]==1){
                    return false;
                }
            }
            return true;
        }
