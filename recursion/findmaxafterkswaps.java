    package strings;
    import java.util.*;
    
    /*
    input=> 
    1234567
    4
    output=>
    7654321
    */
     class newbie {
         static String max;
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
            String s=sc.next();
            
            int k=sc.nextInt();
            max=s;
            findmaxafterkswaps(s,k);
            System.out.println(max);
     }
         public static String swap(String str,int i,int j){
             char arr[]=str.toCharArray();
             char temp;
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
              String sr = String.valueOf(arr);
             
             return sr;
                     }
         public static void findmaxafterkswaps(String str,int k){
             if(Integer.parseInt(str)>Integer.parseInt(max)){
                 max=str;
             } 
             if(k==0){
                 return;
             }
             
            
             for(int i=0;i<str.length()-1;i++){
                 for(int j=i+1;j<str.length();j++){
                     if(str.charAt(j)>str.charAt(i)){
                         String swapped=swap(str,i,j);
                         findmaxafterkswaps(swapped,k-1);
                     }
                 }
             }
         }
     }
         
     
