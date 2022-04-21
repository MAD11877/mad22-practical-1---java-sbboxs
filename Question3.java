import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner userInteger = new Scanner(System.in);  
    System.out.println();
    int integer = userInteger.nextInt();
    int multiplies = integer * integer;
    System.out.println(multiplies);
    userInteger.close();
  }
}
