import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner user = new Scanner(System.in);  
    System.out.println("Enter your height(m) and weight(kg): ");
    double height = user.nextDouble();
    double weight = user.nextDouble();
    double BMI = weight / (height * height);
    System.out.println("Your BMI is:" +BMI);
    user.close();
  }
}
