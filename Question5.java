import java.util.Scanner;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int integerNum = in.nextInt();
    int numList[] = new int[integerNum];
    int mode = 0;
    for (int i = 0; i < integerNum; i++){
      System.out.println("Number input " + (i+1) +":");
      int userNum = in.nextInt();
      numList[i] = userNum;
    }
    int highestCount = 0 ;
    for (int i = 0; i < integerNum; i++){
      int newCount = 0 ;
      for (int y = 0; y < integerNum; y++){
        if (numList[i] == numList[y]){
          newCount++;
        }
      }
      if (newCount > highestCount){
        highestCount = newCount;
        mode = numList[i];
      }
    }
    System.out.println(mode);

    in.close();
  }
}
