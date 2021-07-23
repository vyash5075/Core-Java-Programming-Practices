/*
input : abc
output: { ,a,b,c,ab,ac,bc,abc}
*/

import java.util.*;
public class abc{
    public static void main(String args[]){
        String a="abc";
    ArrayList<String>al=getss(a);
    System.out.println(al);
    }
    public static ArrayList<String> getss(String s){
        if(s.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch=s.charAt(0);;
        String ros=s.substring(1);
        ArrayList<String>rres=getss(ros);
        
        ArrayList<String>mres=new ArrayList<>();
        for(String rstr:rres){
            mres.add(rstr);
            mres.add(ch+rstr);
        }
        return mres;
    }
}
