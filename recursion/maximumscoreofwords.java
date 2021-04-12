    package strings;
    import java.util.*;
    
    /*
    input=>
    4
    dog,cat,dad,good
    9
    a b c  d d d g o o
    1 0 9 5 0 0 3 0 0 0 0 0 0 0 2 0 0 0 0 0 0 0 0 
    
    output=>
    
    */
     class newbie {
         
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int noofwords=sc.nextInt();
             String words[]=new String[noofwords];
             for(int i=0;i<words.length;i++){
                 words[i]=sc.next();
             }
             int noofletters=sc.nextInt();
             char letters[]=new char[noofletters];
             for(int i=0;i<letters.length;i++){
                 letters[i]=sc.next().charAt(0);
             }
             int score[]=new int[26];
             for(int i=0;i<score.length;i++){
                 score[i]=sc.nextInt();
             }
             
             if(words.length==0||letters.length==0||score.length==0){
                 return;
             }
             
             int frequencyarr[]=new int [score.length];
             for(char ch:letters){
                 frequencyarr[ch-'a']++;
             }
             System.out.println(solution(words,frequencyarr,score,0));
         }
         
         public static int solution(String words[],int far[],int score[],int idx){
            if(idx==words.length)
            {
                return 0;
            }
             int sno=0+solution(words,far,score,idx+1);     //current not included
             int sword=0;
             boolean flag=true;
                     String word=words[idx];
                     for(int i=0;i<word.length();i++ )
                     {
                         char ch =word.charAt(i);
                         if(far[ch-'a']==0){
                             flag=false;
                         }
                         far[ch-'a']--;
                         sword+=score[ch-'a'];
                     }
                     int syes=0;
                     if(flag){
                         syes=sword+solution(words,far,score,idx+1);
                     }
                      for(int i=0;i<word.length();i++ ){
                           char ch =word.charAt(i);
                          far[ch-'a']++;
                      }
                      return Math.max(sno,syes);
         }
     }
