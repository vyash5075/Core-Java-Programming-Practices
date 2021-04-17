    package strings;
    import java.util.*;

    /*
    input=>{2,4,6,8,10}
    31
    output=>2
    */
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int arr[]={2,4,6,8,9};
           System.out.println(gcd(arr));
        }
        public static int gcd(int arr[]){
            int result=0;
            for(int i=0;i<arr.length;i++){
                result=findgcd(result,arr[i]);
            }
            return result;
        }
        public static int findgcd(int a,int b){
            if(a==0)return b;
            if(b==0)return a;
        return     findgcd(b%a,a);
        }
        
     }
