package pakagebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import utility.TimeUtils;

public class baseTestNG {

	//browser info  WebDriver driver=new chromeDriver();
		//url info
		//username and password 
		
		public static Properties prop=new Properties();
		public static WebDriver driver;

		//step 1  creating constructor  of this class (FileInputStream)
		//If you want to handle exception I can use try catch
		
		public baseTestNG()
		 {
		  try {
			  
			FileInputStream file=new FileInputStream("C:\\Users\\HARDIK\\eclipse-workspace\\TestNGproject\\src\\test\\java\\environmnet\\configg.property");
	        prop.load(file);
	        
			}
			  
		   catch(FileNotFoundException e) {
			    	e.printStackTrace(); 

		   }
		  		catch(IOException a ) {
		    	a.printStackTrace();
		    	
		    }
		 }
		  
		  //step2 create a method
		
		  public static void initiate() {
			  
			  //driver path  webdriver.chromedriver 
			  //maximize pagload,implicit,getting url
			 
			  
	      	String browsername= prop.getProperty("browser"); 
	      	
	      	if(browsername.equals("Chrome")) {
	      		System.setProperty("webdriver.chrome.driver","C:\\Users\\HARDIK\\eclipse-workspace\\chromedriver.exe");
	      		driver=new ChromeDriver();
	      		}
	      		
	      		else if (browsername.equals("Firefox")) {
	      			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	      			driver=new FirefoxDriver();
	      			}
	      	
	      	driver.manage().window().maximize();
	      	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      	driver.get(prop.getProperty("url")); 
		  }
		  
		  

		  } 
		  

