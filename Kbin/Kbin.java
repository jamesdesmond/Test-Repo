import java.util.Scanner;

class Kbin
{
	public static void main(String[] Args)
		throws java.io.IOException
		{
			String  input;

			Scanner in = new Scanner(System.in);

			System.out.println("Input a string.");

			input = in.nextLine();

			System.out.println("Your String is: " + input);
		}
}
