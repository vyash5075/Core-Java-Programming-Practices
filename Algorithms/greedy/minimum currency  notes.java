import java.util.*;
public class abc{
    public static void main(String args[]){
        Integer notes[]={500,1000,2000,1,5,10,20,50,100};
        int amount=868;
        
         
        countnotes(amount,notes);
    }
    public static void countnotes(int amount,Integer notes[]){
         Arrays.sort(notes, Collections.reverseOrder());
         
        int noteCounter[]=new int[9];
         for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        
        
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }
}

//output:
Currency Count ->
500 : 1
100 : 3
50 : 1
10 : 1
5 : 1
1 : 3
