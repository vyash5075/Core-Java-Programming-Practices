import java.util.*;
/**
 *
 * @author yash verma
 */
class student{
    int age;
    int rollno;
    String name;
    student(int age,String name,int rollno )
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
}
    class Agecomparator implements Comparator<student>
    {
    public int compare (student s1,student s2){
        if(s1.age==s2.age)
        {
            return 0;
        }
        else if(s1.age>s2.age)
        {
            return 1;
        }
        else{
            return -1;
        }
}   
}   
class rollnoComparator implements Comparator<student>
    {
    public int compare (student s1,student s2){
        if(s1.rollno==s2.rollno)
        {
            return 0;
        }
        else if(s1.rollno>s2.rollno)
        {
            return 1;
        }
        else{
            return -1;
        }
}   
}   
class nameComparator implements Comparator<student>
    {
    public int compare (student s1,student s2){
        return s1.name.compareTo(s2.name);
        
}   
}   
public class comparatorexample {
    public static void main(String args[])
    {
        ArrayList<student>al=new ArrayList<student>();
        al.add(new student(1,"yashhhh",10));
         al.add(new student(3,"arun",7));
         al.add(new student(8,"vinay",15));
         al.add(new student(4,"tushar",5));
         Collections.sort(al,new Agecomparator());
         System.out.println("");
         System.out.println("sort by age:");
         for(student st:al)
         {
             System.out.println(st.age+" "+st.name+" "+st.rollno);  
  
         }
         System.out.println("");
          System.out.println("sort by rollno:");
          
  Collections.sort(al,new rollnoComparator());
         for(student st:al)
         {
             System.out.println(st.age+" "+st.name+" "+st.rollno);  
  
         }
         System.out.println("");
         System.out.println("sort by name:");
  Collections.sort(al,new nameComparator());
         for(student st:al)
         {
             System.out.println(st.age+" "+st.name+" "+st.rollno);  
  
         }
    }    
}
