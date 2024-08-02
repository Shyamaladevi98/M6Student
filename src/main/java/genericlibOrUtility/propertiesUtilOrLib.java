package genericlibOrUtility;

import java.io.FileInputStream;

import java.util.Properties;

public class propertiesUtilOrLib 
{
	/*
	  
	  
	 */
	
		public String getDataFromProperties(String data) throws Exception
		{
			FileInputStream fis=new FileInputStream(IconStantUtility.propertiespath);
			Properties pobj=new Properties();
			pobj.load(fis);
			String info=pobj.getProperty(data);
			return info;
		}
}
