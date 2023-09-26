import java.util.Scanner;

public class OOP_Act_1
{
	public static void main(String[] args)
	{
		//Attributes
		String num1;
		String num2;
		
		// Methods
		// Get input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer 1: ");
		num1 = in.nextLine();
    Integer.parseInt(num1);
		System.out.print("Enter integer 2: ");
		num2 = in.nextLine();
    Integer.parseInt(num2);
		
		//Addition
		System.out.println(num1 + num2);
		
	}
}