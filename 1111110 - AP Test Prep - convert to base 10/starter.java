import java.util.ArrayList;

class starter{

	public static void main(String[] args)
    {
		EasyReader in = new EasyReader();
		System.out.print("Please enter a number in binary: ");
		int num = in.readInt();
		System.out.print("The number in base 10 is: "+convertToBase10(num));
	}
	
	private static int convertToBase10(int num)
	{
		//array of digits in reverse order
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while(num > 0)
		{
			digits.add(num % 10);
			num /= 10;
		}
		int sum = 0;
		for(int i=0; i<digits.size(); i++)
			sum += digits.get(i) * Math.pow(2, i);
		return sum;
	}
}