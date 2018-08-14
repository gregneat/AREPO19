import java.util.ArrayList;

class starter {
	
	public static void main(String[] args)
	{
		EasyReader infile = new EasyReader("mobydick.txt");
		//System.out.print("\nThere are "+countWhales(infile)+" whale occurances in Moby Dick.\n#Savethewhales\n");
		System.out.println(getRandomWord(infile));
	}
	public static int countWhales(EasyReader file)
	{
		int numOfWhales = 0;
		while(!file.eof())
		{
			String currentWord = file.readWord();
			if(currentWord!=null && (currentWord.contains("whale") || currentWord.contains("Whale") || currentWord.contains("whaling") || currentWord.contains("Whaling")))
			   numOfWhales++;
		}
		return numOfWhales;
	}
	//good time for arraylists?
	public static String getRandomWord(EasyReader file)
	{
		ArrayList<String> words = new ArrayList<String>();
		while(!file.eof())
		{
			String currentWord = file.readWord();
			if(currentWord != null)
			   words.add(currentWord);
		}
		String randomWord = "";
		System.out.println("there are "+words.size()+" words.");
		int num = 0;
		//while loop that checks condition at the end
		do
		{
			num = (int)(Math.random()*words.size())+1;
			randomWord = words.get(num);
		}
		while(!checkPunctaution(randomWord));
		System.out.print("the magic word is in the "+num+" position: ");
		return randomWord;
	}
	//checks for excess punctuation and empty words
	public static boolean checkPunctaution(String word)
	{
		return !word.contains(",") && !word.contains(".") && 
		       !word.contains("!") && !word.contains("?") &&
			   !word.contains("--") && word.length() > 0;
	}
}