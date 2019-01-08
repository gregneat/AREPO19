import pkg.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class starter   
{
    public static void main(String args[]) throws IOException, InterruptedException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
		Traffic joe = new Traffic("Cars.txt",-100,50);
		joe.parade();
	}
	
}