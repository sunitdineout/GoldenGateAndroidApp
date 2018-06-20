package pageobjects.home;

import org.openqa.selenium.By;

import com.goldengate.utils.SetCapability;

public class HomeScreen extends SetCapability{
	
	
	private static HomeScreen instance = new HomeScreen();

	    
    public static By individual_Offerings = By.id("com.paytm.goldengate.debug:id/fragment_tv_my_task");
    
    public static By sign_out_link = By.id("com.paytm.goldengate.debug:id/footer_nav_signout");
    
    public static By navigation_bar = By.className("android.widget.ImageButton");

    
    

    
    
    public static  HomeScreen getInstance() {
        return instance;
    }
    
  
    public boolean verifyLogin()
    {
    	if(driver.findElement(individual_Offerings).isDisplayed())
    	{
    		return true;
    	}
		return false;
    }
    
    
    public void signout()
    {
    	if(driver.findElement(sign_out_link).isDisplayed())
    	{
    		driver.findElement(sign_out_link).click();
    	}
		
    }
    
    
    
    public void clickOnNavigate()
    
    {
    	if(driver.findElement(navigation_bar).isDisplayed())
    	{
    		driver.findElement(navigation_bar).click();
    	}
    	
    	else
    		
    	{
    		System.out.println("navigation bar not showing " + navigation_bar);
    	}
		
    }
    
    
    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
