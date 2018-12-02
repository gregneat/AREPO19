/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class starter
{

	public static void main(String[] args)
	{
		// put your code here
		System.out.print(findKeyword("I love school", "love",0));
		

	}
	public static int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

		}

		return -1;
	}


}
