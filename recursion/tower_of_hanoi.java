    package strings;
    /*
    input 1
    output 111
    
    input 2
    output 211121112
    
    input 3
    output 321112111232111211123
    */
    import java.util.*;
    public class newbie {

           public static void main(String args[]){
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               int t1d=sc.nextInt();
               int t2d=sc.nextInt();
               int t3d=sc.nextInt();
               toh(n,t1d,t2d,t3d);
           }
           public static void toh(int n,int t1id,int t2id,int t3id){
               
               if(n==0)return;
               //toh(item,source,destination,helper);
               toh(n-1,t1id,t3id,t2id);//will print instructions to move n-1 disks from t1 to t3  usng t2
               System.out.println(n+" [ "+t1id+" -> "+t2id+" ] ");
               toh(n-1,t3id,t2id,t1id);// will print instructions to move n-1 disks from t3 to t2  using t1
               
           }
    }
