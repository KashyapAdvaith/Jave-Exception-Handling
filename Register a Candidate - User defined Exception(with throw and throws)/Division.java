import java.util.*;
public class Division
{
    public String divideTwoNumbers(int number1,int number2)
    {
        String s="";
        try {
            
            int a = number1/number2;
            
            s="The answer is "+a+".";
            
        } catch(ArithmeticException e) {
            
            s="Division by zero is not possible.";
            
        } finally {
            
            return s+" Thanks for using the application.";
        }
    }
    
    public static void main (String[] args) {
        
        Division d = new Division();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        System.out.println(d.divideTwoNumbers(in.nextInt(),in.nextInt()));
    }
}