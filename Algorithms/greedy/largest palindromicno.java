/*
Input : 313551
Output : 531135
*/


import java.util.*;
class GFG{
  
// Function to check if a number can be
// permuted to form a palindrome number
static boolean possibility(HashMap<Integer,
                                   Integer> m,
                           int length, String s)
{
  // counts the occurrence of number
  // which is odd
  int countodd = 0;
   
  for (int i = 0; i < length; i++)
  {
    // if occurrence is odd
    if (m.get(s.charAt(i) - '0') % 2 == 1)
      countodd++;
 
    // if number exceeds 1
    if (countodd > 1)
      return false;
  }
 
  return true;
}
  
// function to print the largest
// palindromic number by permuting
// digits of a number
static void largestPalindrome(String s)
{
  // String length
  int l = s.length();
 
  // map that marks the occurrence
  // of a number
  HashMap<Integer,
          Integer> m = new HashMap<>();
   
  for (int i = 0; i < l; i++)
    if(m.containsKey(s.charAt(i) - '0'))
      m.put(s.charAt(i) - '0',
      m.get(s.charAt(i) - '0') + 1);
  else
    m.put(s.charAt(i) - '0', 1);
 
  // check the possibility of a
  // palindromic number
  if (possibility(m, l, s) == false)
  {
    System.out.print("Palindrome cannot be formed");
    return;
  }
 
  // String array that stores
  // the largest permuted
  // palindromic number
  char []largest = new char[l];
 
  // pointer of front
  int front = 0;
 
  // greedily start from 9 to 0
  // and place the greater number
  // in front and odd in the middle
  for (int i = 9; i >= 0; i--)
  {
    // if the occurrence of
    // number is odd
    if (m.containsKey(i) &&
        m.get(i)%2==1)
    {
      // place one odd occurring
      // number in the middle
      largest[l / 2] = (char)(i + 48);
 
      // decrease the count
      m.put(i, m.get(i)-1);
 
      // place the rest of
      // numbers greedily
      while (m.get(i) > 0)
      {
        largest[front] = (char)(i + 48);
        largest[l - front - 1] =
                    (char)(i + 48);
        m.put(i, m.get(i) - 2);
        front++;
      }
    }
    else
    {
      // if all numbers occur even
      // times, then place greedily
      while (m.containsKey(i) &&
             m.get(i) > 0)
      {
        // place greedily at front
        largest[front] = (char)(i + 48);
        largest[l - front - 1] =
               (char)(i + 48);
 
        // 2 numbers are placed,
        // so decrease the count
        m.put(i, m.get(i) - 2);
 
        // increase placing position
        front++;
      }
    }
  }
 
  // print the largest String
  // thus formed
  for (int i = 0; i < l; i++)
    System.out.print(largest[i]);
}
 
// Driver Code
public static void main(String[] args)
{
  String s = "313551";
  largestPalindrome(s);
}
}
 
// This code is contributed by Rajput-Ji
