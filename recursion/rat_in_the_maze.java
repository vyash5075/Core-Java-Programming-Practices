    package strings;
    import java.util.*;

    /*
    input=>{abc}
    output=> "","a","b","c","abc","ac,"bc","ab"
    */
     class newbie {
         public static void main(String args[]){
         int a[][]={{1,0,1,1,1,0,0,1},
                    {1,1,1,0,1,1,1,1},
                    {1,0,1,0,0,0,9,0},
                    {0,0,1,1,1,0,1,1},
                    {1,1,1,0,1,0,0,1},
                    {1,0,1,0,1,1,1,1},
                    {1,0,0,0,0,1,0,0},
                    {1,1,1,1,1,1,1,1}};
         boolean vis[][]=new boolean[a.length][a[0].length];
         if(maze(a,0,0,9,vis)){
             System.out.println("found");
         }
         else{
             System.out.println("not found");
         }
         }
         static boolean maze (int a[][],int i,int j,int find,boolean vis[][]){
             if(!isvalid(a,i,j,vis)){
                 return false;
             }
             if(a[i][j]==find){
                // System.out.println(i+"-"+j);
                 display(vis);
                 return true;
             }
             if(a[i][j]==1){
                 vis[i][j]=true;
                 boolean down=maze(a,i+1,j,find,vis);
                  boolean right=maze(a,i,j+1,find,vis); 
                   boolean left =maze(a,i,j-1,find,vis);
                  boolean up=maze(a,i-1,j,find,vis);
                    vis[i][j]=false;
                    return down||right||left||up;
             }
             return false;
         }
         public static void display(boolean vis[][]){
             for(int i=0;i<vis.length;i++){
                 for(int j=0;j<vis[0].length;j++){
                     if(vis[i][j]==true){
//                         System.out.print("("+i+","+j+")");
                     }
                 }
                
             }
             System.out.println();
         }
         public static boolean isvalid(int a[][],int i,int j,boolean vis[][]    ){
             int rows=a.length;
             int cols=a[0].length;
             return i>=0&&j>=0&&i<rows&&j<cols&&!vis[i][j];
         }
          
        
    }
