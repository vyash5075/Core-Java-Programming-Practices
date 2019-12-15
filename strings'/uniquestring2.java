import java.util.*;
public class uniquestring2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.next();
        String s1="";
        int n=s.length();
        System.out.println(n);
        int count=0;
        for(int i=0;i<n;i++) {
			if(i==n-1) { 
				if(count==0)
				s1=s1+s.charAt(n-1);
				break;}
			
			if(s.charAt(i)!=s.charAt(i+1) ) {
				if(count>0)
				count=0;
				else
				s1=s1+s.charAt(i);
			}
			else {
				count++;
			}
		}
		System.out.println("After removing Adjecent Duplicates");
		System.out.println(s1);
    }
}