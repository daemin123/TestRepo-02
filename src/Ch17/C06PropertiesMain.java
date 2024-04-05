package Ch17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C06PropertiesMain {

	public static void main(String[] args) throws IOException {
		
		String classPath = System.getProperty("java.class.path");
//		System.out.println("ClassPath : " + classPath);
		String dirPath = System.getProperty("user.dir");
		System.out.println("DirPath : " + dirPath);
		String pakagePath = C06PropertiesMain.class.getPackageName();
//		System.out.println("PakagePath : " + pakagePath);
		String filePath = dirPath + File.separator + "src" + File.separator + pakagePath + File.separator + "application.properties";
//		System.out.println("filePath : " + filePath);
		
	
		
		Properties properties = new Properties();
		
		FileInputStream Fin = new FileInputStream("C:\\Emb_이동환\\worksapce\\05_JAVA_ECLIPSE\\src\\Ch17\\application.properties");
		properties.load(Fin);
		 
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.printf("%s\n%s\n%s\n", url, username, password);
		
	}
	
}
