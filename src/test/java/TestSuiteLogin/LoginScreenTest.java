package TestSuiteLogin;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.goldengate.common.Constants;
import com.goldengate.testBase.BaseTest;
import com.goldengate.utils.ActionHelper;
import pageobjects.home.HomeScreen;
import pageobjects.login.LoginScreen;

public class LoginScreenTest extends BaseTest {
	
	 SoftAssert sa= new SoftAssert();
	
	 @Test(priority =0, enabled = false)
	 public  void validLogin() {
		 
         LoginScreen.getInstance().do_login("8010630022", "paytm1");
         ActionHelper.getInstance().allowStoragePermission();
         ActionHelper.getInstance().allowLocationPermission();
         ActionHelper.getInstance().allowPhoneCallPermission();
         ActionHelper.getInstance().allowSmsPermission();
         ActionHelper.getInstance().allowStoragePermission();
         ActionHelper.getInstance().allowLocationPermission();
         ActionHelper.getInstance().allowCaptureImagesPermission();
       
         boolean LoginSuccess = HomeScreen.getInstance().verifyLogin();
         sa.assertEquals(LoginSuccess, true);
           
         HomeScreen.getInstance().clickOnNavigate();
         HomeScreen.getInstance().signout();
               
         
	 }
	
	 
	 @Test(priority =1, enabled = true)
	 public  void mobileValidation() {
		 
         LoginScreen.getInstance().do_login("801063002", "paytm2");       
         String Actual_mobile_validation = LoginScreen.getInstance().mobileValidation();
         sa.assertEquals(Actual_mobile_validation, Constants.expected_mobile_validation);    
         
	 }
	 
	 @Test(priority =2, enabled = false)
	 public  void passwordValidation() {
		 
         LoginScreen.getInstance().do_login("8010630022", "");       
         String Actual_password_validation = LoginScreen.getInstance().passwordValidation();
         sa.assertEquals(Actual_password_validation, Constants.expected_password_validation);    
         
	 }
	 
	 
	 @Test(priority =3, enabled = false)
	 public  void invalidLogin() {
		 
         LoginScreen.getInstance().do_login("8010630022", "paytm2");  
         ActionHelper.getInstance().allowStoragePermission();
         ActionHelper.getInstance().allowLocationPermission();
         ActionHelper.getInstance().allowPhoneCallPermission();
         ActionHelper.getInstance().allowSmsPermission();
        
         String Actual_invalid_login_message = LoginScreen.getInstance().invalidLogin();
         sa.assertEquals(Actual_invalid_login_message, Constants.expected_invalid_login_message);    
         
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
}
