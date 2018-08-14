import java.util.ArrayList;

class starter{

	public static void main(String[] args)
    {
		EasyReader in = new EasyReader();
		System.out.print("Please enter a number in base 10: ");
		int num = in.readInt();
		System.out.println("The number in binary is: "+convertToBinary(num));
	}
	
	private static String convertToBinary(int num)
	{
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int c = 0;
		//"shopping cart" method
		//adds 1's where necessary to create the sum
		while(num > 0)
		{
			int greatest = getGreatestPower(num);
			num -= Math.pow(2, greatest);
			//first iteration creates the array with the proper length
			if(c == 0)
			{
				for(int i=0; i<7; i++)
					digits.add(0);
			}
			//other iterations simply set the correct 0's to 1's
			digits.set(digits.size() - (greatest + 1), 1);
			c++;
		}
		return ArrayToInt(digits);
	}
	//gets greatest power of two less than or equal to number
	private static int getGreatestPower(int number)
	{
		int[] Powers_Of_2 = new int[8];
		//creates array of the powers of 2
		for(int i=0; i<Powers_Of_2.length; i++)
			Powers_Of_2[i] = (int)Math.pow(2, i);
		int upperBound = 0;
		while(upperBound < Powers_Of_2.length && number >= Powers_Of_2[upperBound])
			upperBound++;
		return upperBound - 1;
	}
	//returns an int that is the combined digits of the array arr
	private static String ArrayToInt(ArrayList<Integer> arr)
	{
		String nums = "";
		for(int i=0; i<arr.size(); i++)
			nums += arr.get(i).toString();
		return nums;
	}
}