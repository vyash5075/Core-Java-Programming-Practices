    package strings;
    import java.util.*;

    /*
    input=>20
    31
    output=>1 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 2 , 20 , 3 , 4 , 5 , 6 , 7 , 8 , 9 
    */
     class newbie {
         static String max;
         public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(int i=1;i<=9;i++){
              dfs(i,n);
          }
     }
         public static void dfs(int i,int n){
             if(i>n)return;
             System.out.print(i+" , ");
             for(int j=0;j<10;j++){
                 dfs(10*i+j,n);
             }
         }
        
     }

