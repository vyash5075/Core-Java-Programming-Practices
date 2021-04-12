    package strings;
    import java.util.*;
    
    /*
    input=>
   3
1
2
1
2


    
    output=>
   2-
1-1-
    
    */
     class newbie {
         
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int noofwords=sc.nextInt();
             int coins[]=new int[noofwords];
             for(int i=0;i<coins.length;i++){
                 coins[i]=sc.nextInt();
             }
             int tamount=sc.nextInt();
            coinchange(0,coins,0,tamount,"");
         }
         
       public static void coinchange(int i,int coins[],int currentamount,int totalamount,String asf){
          
           if(i==coins.length){
               if(currentamount==totalamount){
                   System.out.println(asf);
               }
               return;
           }
        for(int j=totalamount/coins[i];j>=1;j--){
            String part="";
            for(int k=0;k<j;k++){
               part+=coins[i]+"-";
            }
            System.out.println(i+" "+coins[i]*j);
             coinchange(i+1,coins,currentamount+coins[i]*j,totalamount,asf+part);
        }
        coinchange(i+1,coins,currentamount,totalamount,asf);
       }
     }
