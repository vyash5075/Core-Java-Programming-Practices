 /*
 
 Input : S = 10 N = 16 M = 2 
Output : Yes 2 
https://www.geeksforgeeks.org/survival/
 */
import java.io.*;
 
class GFG {
    static void survival(int S, int N, int M)
    {
        if (((N * 6) < (M * 7) && S > 6) || M > N)
            System.out.println("No");
 
        else {
  
            int days = (M * S) / N;
 
            if (((M * S) % N) != 0)
                days++;
 
            System.out.println("Yes " + days);
        }
    }
    public static void main(String[] args)
    {
        int S = 10, N = 16, M = 2;
 
        survival(S, N, M);
    }
}
