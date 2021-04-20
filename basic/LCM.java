public class Main {
  public static void main(String[] args) {

    int n1 = 72, n2 = 120, lcm;
    lcm = (n1 > n2) ? n1 : n2;
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}
//------------------------------------------------------------------
//another way
public class lcm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int o1=n1;
        int o2=n2;
        while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
        //lcm formula   gcd*lcm=n1*n2
        //              LCM=(n1*n2)/gcd;
        int lcm=  (o1*o2)/gcd;
        
        System.out.println(gcd);
    }
}
