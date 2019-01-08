import pkg.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Traffic {
	private Vehicle[] Vs;
	private int xStart;
	private int yStart;
	
	public Traffic(String fName,int ex, int why)throws IOException, InterruptedException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException, IllegalAccessException
	{
		xStart = ex;
		yStart = why;
		BufferedReader Read = new BufferedReader(new FileReader(new File("pkg/"+fName)));
		int Count = 0;
		String Temp;
		while((Temp =Read.readLine())!=null)
		{
				if(Temp.indexOf(".class")>0)
					Count++;
		}
			// System.out.println(Count);
			Vs = new Vehicle[Count];
			Read = new BufferedReader(new FileReader(new File("pkg/"+fName)));
			for(int a =0; a<Vs.length; a++){
				Temp = Read.readLine();
				if(Temp.indexOf(".class")>0){
					Temp = Temp.substring(0,Temp.indexOf("."));
					// System.out.println(Temp);
					
					Class<?> clazz = Class.forName("pkg."+Temp);
					Constructor<?> constructor = clazz.getConstructor(int.class, int.class);
					Object instance = constructor.newInstance(xStart,yStart);
					Vs[a] = (Vehicle)instance;
				}
			}
			for(int a=0; a<Vs.length;a++){
				Vs[a].draw();
			}
	}
	public void parade()
	{
		// you write this
	}
		
		
}