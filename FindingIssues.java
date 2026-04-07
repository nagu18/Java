//Each of the Java files on this page represents a complete source file. 
// Your job is to play compiler and determine whether each of these files will compile. 
// If they won’t compile, how would you fix them?


//A: issue is x++ is missing
/* 
class FindingIssues {
  public static void main(String [] args) {
    int x = 1;
    while ( x < 10 ) {
      x++; //it missed this line, so it will be an infinite loop.
        if ( x > 3) {
            System.out.println("big x");
            
        }
    }
  }
  
}
*/

//B: is fine and working 
/* 
public class FindingIssues {
  public static void main(String [] args) {
    int x = 5;
    while ( x > 1 ) {
      x = x - 1;
      if ( x < 3) {
        System.out.println("small x");
    }
  }
}
}
*/

//C: no main method in it 
/* 
class Exercise1b {
    int x = 5;
    while ( x > 1 ) {
      x = x - 1;
      if ( x < 3) {
        System.out.println("small x");
      }
    }
}
*/

