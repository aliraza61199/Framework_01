package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertyUtility {
         
         private Properties property;
	public void pathfile(String path) {
		FileInputStream fis=null;
		 try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 property=new Properties();
		 try {
			
			 property.load(fis);
		 }catch(Exception e1) {
			 e1.printStackTrace();
		 }
		 
		 
	}

	
	public String getproperty(String Key) {
		return property.getProperty(Key);
		
	}
}
