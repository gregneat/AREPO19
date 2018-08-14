class starter {
	
	public static void main(String[] args)
	{
		EasyReader infile = new EasyReader("mobydick.txt");
		System.out.print("\nThere are "+countWhales(infile)+" whale occurances in Moby Dick.\n#Savethewhales\n");
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
}