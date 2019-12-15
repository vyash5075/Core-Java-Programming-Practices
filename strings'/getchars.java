import java.uil.*;
public class getchars {
    public static void main(String args[])
    {
        String s1="yash is verma is boy";
        int n=s1.indexOf("verma");
        System.out.println(n);
        int m=s1.indexOf("is",7);      //return the index of is after 4th index
        System.out.println(m);
        char ch[]=new char[15];// ize of array doesnt matter
        try{
            s1.getChars(2,4,ch,0);
             System.out.println(ch);  
        }
        catch(Exception ex){System.out.println(ex);}
        } 
    }

