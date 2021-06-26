/*

input= a1[1,2,2,3,4]
       a2[1,1,3,5]
       
       output= [1,2,3,4,5]
*/


import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr1[]={1,2,2,3,4};
        int arr2[]={1,1,3,5};
        System.out.println(union(arr1,arr2));
    }
    public static ArrayList<Integer> union(int a1[],int a2[]){
        ArrayList<Integer>al=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a1.length&&j<a2.length){
            if(a1[i]==a2[j]){
                if(al.size()>0&& al.get(al.size()-1)!=a1[i]){
                     al.add(a1[i]); 
                }
                else if(al.size()==0){
                     al.add(a1[i]); 
                }
            i++;
            j++;
            }
            else if(a1[i]<a2[j]){
                if( al.size()>0&& al.get(al.size()-1)!=a1[i]){
                     al.add(a1[i]);
                }
                else if(al.size()==0){
                     al.add(a1[i]);
                }
               
                i++;
            }
            else{
                 if( al.size()>0&& al.get(al.size()-1)!=a2[j]){
                     al.add(a2[j]);
                }
                else if(al.size()==0){
                     al.add(a2[j]); 
                }
                j++;
            }
        }
        
        while(i<a1.length){
             if( al.size()>0&& al.get(al.size()-1)!=a1[i]){
                     al.add(a1[i]);
                }
                i++;
        }
      
        while(j<a2.length){
            if( al.size()>0&& al.get(al.size()-1)!=a2[j]){
                     al.add(a2[j]);
                }
                 j++;
        }
        return al;
        
    }
}
