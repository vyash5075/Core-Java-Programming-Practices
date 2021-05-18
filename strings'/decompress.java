/*
3[abc][ab]c= abcabcabcababc
10[a]= aaaaaaaaaa
2[3[a]b]= aaabaaab
 */
package strings;

import java.util.*;
public class decompress {
    public static void main(String args[]){
        String s="3[abc]2[ab]c";
        decompress(s);
    }
    
    public static void decompress(String str){
        
        Stack<Integer>st=new Stack<>();
        Queue<String>q=new LinkedList<>();
        String fg="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(Character.isDigit(ch)){
               
                int d=0;
                while(str.charAt(i)!='['){
                     d=d*10+Integer.parseInt(str.charAt(i)+"");
                     i++;
                }
                    st.push(d);     
            }
            else{
               if(ch!=']'){
                   
                   q.add(ch+"");
               }
               else{
                   String tem="";
                   while(q.size()>0){
                       tem=tem+q.remove();
                   }
                   int s=st.pop();
                   for(int j=0;j<s;j++){
                       fg=fg+tem;
                   }
                   if(st.size()!=0){
                       q.add(fg);
                       fg="";
                   }
               }
            }   
        }
         if(q.size()>0){
               String tem="";
                   while(q.size()>0){
                       tem=tem+q.remove();
                   }
                    fg=fg+tem;
            }
        System.out.println(fg);
    }
}
