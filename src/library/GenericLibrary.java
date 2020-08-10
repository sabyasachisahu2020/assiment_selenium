package library;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class generallibrary
{
	static {
		System.out.println("GenericPropertyLib class");
	}
	public static String getValue(String path, String key)
	{
		System.out.println("getValue Method");
		String value="";
		try
		{
			FileInputStream fin = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fin);
			value=prop.getProperty(key);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}	
		return value;
	}
}
