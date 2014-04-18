class Kbin
{
	public static void main(String[] Args)
		throws java.io.IOException
		{
			char input;

			System.out.print("Type something followed by ENTER: ");

			input = (char)  System.in.read(); //get a string

			System.out.println("Your string is: " + input);
		}
}
