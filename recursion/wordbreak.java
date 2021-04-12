    package strings;
    import java.util.*;
    
    /*
    input=> 
    6
micro
soft
hi
ring
microsoft
hiring
    output=>
microsofthiring
micro soft hi ring 
micro soft hiring 
microsoft hi ring 
microsoft hiring 
    */
     class newbie {
         
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            HashSet<String>dict=new HashSet<>();
            for(int i=0;i<n;i++){
                dict.add(sc.next());
            }
            String sentence=sc.next();
            wordbreak(sentence,"",dict);
         }
         public static void wordbreak(String str,String asf,HashSet<String>dict){
             
             if(str.length()==0){
                 System.out.println(asf);
                 return;
             }
             for(int i=0;i<str.length();i++){
                 String left=str.substring(0,i+1);  
                 if(dict .contains(left)){
                      String ros=str.substring(i+1);
                     wordbreak(ros,asf+left+" ",dict);
                 }
             }
         }
        
     }
         
     
