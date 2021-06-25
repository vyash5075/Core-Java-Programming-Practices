/*sort the array in ascendig order acc to physics Marks
once ,this done sort the students having same marks in physics in descending order of chemistry marks
once this done sort the students having same marks in physics and chemistry in ascending order of maths Marks

input: physics   9 5 9 8 5
       chemistry 3  4   3  7  6 
       Maths     15 10 11 13 12
       
       output:   
5-6-12
5-4-10
8-7-13
9-3-11
9-3-15
        */

import java.util.*;
public class abc{
    
    public static class Marks implements Comparable<Marks>{
        int phy;
        int chem;
        int math;
        Marks(){}
        Marks(int phy,int chem,int math){
            this.phy=phy;
            this.chem=chem;
            this.math=math;
        }
        
        public int compareTo(Marks o){
            if(this.phy!=o.phy){
                return this.phy-o.phy;
            }
            else if(this.chem!=o.chem){
                return o.chem-this.chem;
            }
            else{
                return this.math-o.math;
            }
        }
    }
    
    public static void sort(int phy[],int chem[],int math[]){
        int n=phy.length;
        Marks arr[]=new Marks[n];
        
        for(int i=0;i<n;i++){
            arr[i]=new Marks(phy[i],chem[i],math[i]);
        }
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            phy[i]=arr[i].phy;
            chem[i]=arr[i].chem;
            math[i]=arr[i].math;
        }
        
        
        for(int i=0;i<arr.length;i++){
            System.out.println(phy[i]+"-"+chem[i]+"-"+math[i]);
        }
    }
    public static void main(String args[]){
        int phy[]={9,5,9,8,5};
        int math[]={15,10,11,13,12};
        int chem[]={3,4,3,7,6};
        sort(phy,chem,math);
        
    }
    
}
