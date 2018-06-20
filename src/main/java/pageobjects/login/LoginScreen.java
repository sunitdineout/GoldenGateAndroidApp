package pageobjects.login;

import org.openqa.selenium.By;

import com.goldengate.testBase.BaseTest;
import com.goldengate.utils.ActionHelper;
import com.goldengate.utils.SetCapability;

public class LoginScreen extends SetCapability  {
	
    public static By login_mobile_no = By.id("com.paytm.goldengate.debug:id/fragment_login_et_mobile");
    public static By login_password = By.id("com.paytm.goldengate.debug:id/fragment_login_et_password");
    public static By login_button = By.id("com.paytm.goldengate.debug:id/button_login");
    public static By invalid_login_message = By.id("android:id/message");
    
    public static By password_validation = By.xpath("//android.widget.TextView[contains(@resource-id,'com.paytm.goldengate.debug:id/textinput_error') and @text ='Please enter your Paytm password']");
	 
    public static By mobile_validation =  By.xpath("//android.widget.TextView[contains(@resource-id,'com.paytm.goldengate.debug:id/textinput_error') and @text ='Please enter your mobile number']");

    

    
    
    
    
    
    private static LoginScreen instance = new LoginScreen();

    public static  LoginScreen getInstance() {
        return instance;
    }
    
      
    public void fill_mobile(String mobile_no){
    	
    	driver.findElement(login_mobile_no).clear();
        driver.findElement(login_mobile_no).sendKeys(mobile_no);
        ActionHelper.getInstance().dismissKeypad();
    	    	   
    }
    
    public void fill_password(String password){
    	
    	driver.findElement(login_password).clear();
        driver.findElement(login_password).sendKeys(password);
        ActionHelper.getInstance().dismissKeypad();

     }
    
    public void tap_login_button(){
    	
        driver.findElement(login_button).click();
        
    }

    public void do_login(String mobile_no, String password)
    
    {
    	fill_mobile(mobile_no);
    	fill_password(password);
    	tap_login_button(); 	
    	
    }
    
    
    public String invalidLogin()
    {
    	if(driver.findElement(invalid_login_message).isDisplayed())
    	{
    		   String invalidlogin_message = driver.findElement(invalid_login_message).getText();
    		   return invalidlogin_message;
    	}
		return null;
    }
    
    
    public String mobileValidation()
    {
    	if(driver.findElement(mobile_validation).isDisplayed())
    	{
    		   String mobileValidation= driver.findElement(mobile_validation).getText();
    		   return mobileValidation;
    	}
		return null;
    }

    
    public String passwordValidation()
    {
    	if(driver.findElement(password_validation).isDisplayed())
    	{
    		   String passwordValidation = driver.findElement(password_validation).getText();
    		   return passwordValidation;
    	}
		return null;
    }
    
   
    
    
    
    
    
    
    
   

}
