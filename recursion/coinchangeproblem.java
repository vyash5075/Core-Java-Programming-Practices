    package strings;
    import java.util.*;
   
    /*
    input=>
    5
    2
    3
    4
    5
    6
    12

    
    output=>
    2 - 4 - 6 -  .
    3 - 4 - 5 -  .
    
    */


//no duplicate coins allowed
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
              
               if( currentamount==totalamount){
                  
                   System.out.println(asf+" .");
               }
               return;
           }
           coinchange(i+1,coins,currentamount+coins[i],totalamount,asf+ coins[i]+" - ");
           coinchange(i+1,coins,currentamount,totalamount,asf);
       }
     }
