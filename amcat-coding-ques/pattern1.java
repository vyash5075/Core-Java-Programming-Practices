Input  : 4 
Output :
1*2*3*4*17*18*19*20
  5*6*7*14*15*16
    8*9*12*13
      10*11


Input : 2
Output :
1*2*5*6
  3*4



  public class pattern1 { 
  
    public void trapeziumPattern(int num) 
    { 
  
        int firsthalf = 1; 
        int secondhalf = (num * num) + 1; 
        int numOfSpaces = 0; 
  
        // numOfLines is the line number 
        for (int numOfLines = num; numOfLines >= 1; numOfLines--) { 
  
            // Prints the spaces for each line 
            for (int numOfSpacesCounter = numOfSpaces;  
                  numOfSpacesCounter >= 1; numOfSpacesCounter--) { 
                System.out.print(" "); 
            } 
  
            // Prints the first half of the trapezium 
            for (int firstHalfCounter = 1;  
                firstHalfCounter <= numOfLines; firstHalfCounter++) { 
                  
                // If it is the last number for a line then we don't print '*' 
                if (firstHalfCounter == numOfLines) 
                    System.out.print((firsthalf++)); 
  
                else
                    System.out.print((firsthalf++) + "*"); 
            } 
  
            // Prints the second half of the trapezium 
            for (int secondHalfCounter = 1; 
                secondHalfCounter <= numOfLines; secondHalfCounter++) { 
                System.out.print("*" + (secondhalf++)); 
            } 
  
            System.out.println(); 
  
            // Calculates the number of Spaces for the next line 
            numOfSpaces += 2; 
  
            // Calculates the first number of the  
            // second half for the next iteration/line 
            secondhalf = (secondhalf - 1) - ((numOfLines - 1) * 2); 
        } 
    } 
} 