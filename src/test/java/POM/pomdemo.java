package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pakagebase.baseTestNG;

public class pomdemo extends baseTestNG {

	//object repository
	
	 
	//Sign up
		@FindBy(id="signin2") //driver.findElement(By.
		WebElement signup ;

		@FindBy(id="sign-username") //driver.findElement(By.
		WebElement Username;

		@FindBy(id="sign-password")
		WebElement Password;
		
	    @FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
		WebElement Signupbtn; 
	    
	    @FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[1]/button/span")
		WebElement cancelbtn;
	    
	//Log in
	    @FindBy(id="login2")
	    WebElement login;
	    
	    @FindBy(id="loginusername") //driver.findElement(By.
		WebElement Username1;
	    
	    @FindBy(id="loginpassword")
		WebElement Password1;
	    
	    @FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
		WebElement loginbtn; 
	    
	    
	//Laptop option
	    @FindBy(xpath="/html/body/div[5]/div/div[1]/div/a[3]") 
	    WebElement laptop;
	    
	    @FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a") 
	    WebElement laptopname;
	    
	    
	//Add to cart
	    @FindBy(partialLinkText="Add to cart") 
	    WebElement addtocart;
	    
	    @FindBy(id="cartur") 
	    WebElement cart;
	   
	    
	    //initiate page elements
	    //Create constructor of this class
	    //Constructor name and class name should be same
	    

	    public pomdemo() {
	    	
	    	PageFactory.initElements(driver, this);
	    	
	    }
	    
  //Sign up
	    
	    public void signupmain() {
	    	signup.click();
	    }
	    
	    public void signupusername(String name) {
	    	Username.sendKeys(name);
	    }
	    
	    public void signuppassword(String pass) {
	    	Password.sendKeys(pass);
	    }
	    
	    public void signupbutton() {
	    	Signupbtn.click();
	    }
	    
	    public void cancelbutton() {
	    	cancelbtn.click();
	    }
	    
	    public String verify() {
			return driver.getTitle();
	    
	    }
	    
  //Log in
	    
	    public void loginmain() {		
	    login.click();
	    		
	    }
	    
	    public void loginusername(String name) {
	    	Username1.sendKeys(name);
	    }
	    
	    public void loginpassword(String pass) {
	    	Password1.sendKeys(pass);
	    }
	    
	    public void loginbutton() {
	    	loginbtn.click();
	    	
	    }

  //Laptop option
	    
	    public void laptopoption() {
	    	laptop.click();
	    	
	    }
	
	    public void laptopName() {
	    	laptopname.click();
	    }
	    
  //add to cart
	    
	    public void addcart() {
	    	addtocart.click();
	    	
	    }
	    
	    public void cartbtn() {
	    	cart.click();
	    }
}
