
//https://www.geeksforgeeks.org/divide-cuboid-cubes-sum-volumes-maximum/
import java.util.*;
public class gfg{
    
    public static void main(String args[]){
        int l=2;
        int b=6;
        int h=6;
        maximizecube(l,b,h);
    }
    
    public static int gcd(int m,int n){
        if(n==0)
        return m;
        else if(n>m){
            return gcd(n,m);
        }
        else{
            return gcd(n,m%n);
        }
    }
    public static void maximizecube(int l,int b,int h){
        int side=gcd(l,gcd(b,h));
        int num=l/side;
        num=(num*b/side);
        num = (num * h / side);
        
        System.out.println("no of cubes: "+num+" of side "+ side);
    }
}
