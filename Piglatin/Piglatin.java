import java.util.Scanner;
class Piglatin 
{
	public static void main(String Args[]) 
	{
		
		String input; //declare new string
		String[] WordArray; //declare new array for each seperate word
		
		Scanner in = new Scanner(System.in);

		System.out.println("Input what you want translated");
		input = in.nextLine(); //ask for user input
	
		String delims = "[ ]"; //Split input for spaces
		String[] tokens = input.split(delims);

		//System.out.println(input);  //Diagnostics
		//System.out.println(tokens[0]);
		//System.out.println(tokens[2]);

		int length = tokens.length;  //Set amount of words to length
		//System.out.println(length);  //Print length

		for (int i = 0; i < length; i++) 
		{
			System.out.println(tokens[i]);
		}
	}
}
