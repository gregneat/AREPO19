import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class starter
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie5 maggie = new Magpie5();
		
		System.out.println (maggie.getGreeting());
		EasyReader in = new EasyReader();
		String statement = in.readLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.readLine();
		}
	}

}
