package com.goldengate.utils;

import org.openqa.selenium.By;

public class ActionHelper extends SetCapability {
	
	
	
	public static By permission_popup = By.xpath("//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_allow_button') and @text='Allow']");

    private static ActionHelper instance = new ActionHelper();

	
	public static ActionHelper getInstance() {
        return instance;
    }
	


    public void dismissKeypad() {
   	 
    try{
    driver.hideKeyboard();
   	 }
    
    catch(Exception e){
   	 log.debug("keypad is not showing");
   	 
    }
    }
    	
    
    public void allowStoragePermission()
    
    {
    	
    	if(driver.findElement(permission_popup).isDisplayed())
    	{
    	driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_allow_button') and @text='Allow']")).click();;
    	}
    	
    	else
    	{
    		return;
    	}
    		
    	}
	
    
    public void allowLocationPermission()
    
{
    	
    	if(driver.findElement(permission_popup).isDisplayed())
    	{
    	driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_allow_button') and @text='Allow']")).click();;
    	}
    	
    	else
    	{
    		return;
    	}
    		
    	}
	
     public void allowPhoneCallPermission()
    
     {
     	
     	if(driver.findElement(permission_popup).isDisplayed())
     	{
     	driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_allow_button') and @text='Allow']")).click();;
     	}
     	
     	else
     	{
     		return;
     	}
     		
     	}
 	
     public void allowSmsPermission()
     
     {
      	
      	if(driver.findElement(permission_popup).isDisplayed())
      	{
      	driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_allow_button') and @text='Allow']")).click();;
      	}
      	
      	else
      	{
      		return;
      	}
      		
      	}
     
     public void allowCaptureImagesPermission()
     
     {
      	
      	if(driver.findElement(permission_popup).isDisplayed())
      	{
      	driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'com.android.packageinstaller:id/permission_allow_button') and @text='Allow']")).click();;
      	}
      	
      	else
      	{
      		return;
      	}
      		
      	}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
}
