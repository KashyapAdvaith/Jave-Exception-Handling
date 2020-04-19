import java.util.*;
public class ArrayException {
 
	public static void main(String[] args) {
		 ArrayException a = new ArrayException();
	        String n = a.getPriceDetails();
	        System.out.println(n);

	}
	public String getPriceDetails() {
		Scanner sc=new Scanner(System.in);
		try {
			
		
		System.out.println("Enter the number of elements in the array");
		int a=sc.nextInt();
		int[] b=new int[a];
		System.out.println("Enter the price details");
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int c=sc.nextInt();
		
		
		
		return "The array element is "+b[c];
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
		catch(InputMismatchException f) {
			return "Input was not in the correct format";
		}
		
	}

}
