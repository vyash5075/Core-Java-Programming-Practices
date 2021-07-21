
//https://github.com/vyash5075/Core-Java-Programming-Practices/new/master/Algorithms/greedy

import java.util.*;
public class abc{
    public static void main(String args[]){
        char s[]={'b','a','n','a','n','a'};
        int n=s.length;
        int k=2;
        char t[]=new char[n];
        subsequence(s,t,n-1,k);
        for(int i=0;i<t.length;i++){
            if(t[i]!=0){
                System.out.print(t[i]);
            }
        }
    }
        
        public static void subsequence( char s[],char t[],int n,int k){
            int last=0;
            int newlast=0;
            int cnt=0;
            int size=0;
            for(char ch='z';ch>='a';ch--){
                cnt=0;
                
                for(int i=last;i<n;i++){
                    if(s[i]==ch){
                        cnt++;
                    }
                }
                if(cnt>=k){
                    for(int i=last;i<n;i++){
                        if(s[i]==ch){
                            t[size++]=ch;
                            newlast=i;
                        }
                    }
                    
                    last=newlast;
                }
                
            }
            
            t[size] = '\0';
        }
    
}
