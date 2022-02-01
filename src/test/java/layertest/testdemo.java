package layertest;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.pomdemo;
import pakagebase.baseTestNG;

public class testdemo extends baseTestNG {

	//Create constructor of this class
	
		pomdemo store;
	
		public testdemo() {
			super();	
		} 
		
		@BeforeSuite
		public void initsetup() {
			initiate();
			
			store=new pomdemo();
			 
		
			}
		
		@Test(priority=1)
		public void Title() {
			
		 String actual=store.verify();
		 System.out.println(actual);
		 Assert.assertEquals(actual, "STORE"); 
		 	
		}
		
		
		@Test(priority=2)
		public void Signup() throws InterruptedException {
			
			Thread.sleep(2000);
			store.signupmain();
			
			Thread.sleep(2000);
			store.signupusername(prop.getProperty("Username"));
			store.signuppassword(prop.getProperty("password"));
			
			Thread.sleep(1000);
			store.signupbutton();
			
			
		}
		
		@Test(priority=3)
		public void alert() throws InterruptedException {
			
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			Thread.sleep(1000);
			al.accept();
			
			Thread.sleep(1000);
			store.cancelbutton();
			
			
		}
		
		
		@Test(priority=4)
		public void login() throws InterruptedException {
			
		
			Thread.sleep(2000);
			store.loginmain();
			
			Thread.sleep(2000);
			store.loginusername(prop.getProperty("Username"));
			store.loginpassword(prop.getProperty("password"));
			
			Thread.sleep(1000);
			store.loginbutton();
		}
		
		@Test(priority=5)
		public void laptop() throws InterruptedException {
			
			Thread.sleep(2000);
			store.laptopoption();
			
			Thread.sleep(2000);
			store.laptopName();
		}
		
		
		@Test(priority=6)
		public void cart() throws InterruptedException {
			
			Thread.sleep(1000);
			store.addcart();
			
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			Thread.sleep(1000);
			al.accept();
			Thread.sleep(1000);
			
			store.cartbtn();
			Thread.sleep(2000);
		}
		
		
	@AfterTest
		public void close() {
			driver.close();
			
	}
	
}
