package PrabhjotSinghMaini;

import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumScore {
	
	//Declare AndroidDriver class variable
	AndroidDriver driver;
	
	//ImplicitlyWait method deprecation
    @SuppressWarnings("deprecation")
    
	@Test
  
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{

		
		//Instantiating UIAutomator2Options class which will provide UI testing framework 
		UiAutomator2Options options = new UiAutomator2Options();
		
		//Which device emulaotor to target
		options.setDeviceName("PrabhjotPixel");
		
		//theScore apk file to execute on emulator
		options.setApp("//Users//neelakshitaldar//Documents//Eclipse//Appium//src//test//java//resources//com.fivemobile.thescore_2023-03-01.apk");
		
		//instantiate AndroidDriver class object and pass URL of local service (Appium Server) and UiAutomatorOptions2 capabilities object 
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options); 
			
		
		//Waiting to accommodate loading time for Welcome Login page 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click GetStarted button on Login page
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
		
		//Select NBA Basketball as a favorite league
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")).click();
        
		//Click on Continue button
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
        
		//Click on Allow Location button
		driver.findElement(By.id("com.fivemobile.thescore:id/btn_allow")).click();
		
		//Allow location while using the app
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		
		//Selecting Toronto Raptors as Favorite team
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")).click();
		
		//Click on Continue button
		driver.findElement(By.id("com.fivemobile.thescore:id/action_button_text")).click();
		
		//Switching Toggle on for Scoring updates
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.Switch")).click();
		
		//Click on Done button
		driver.findElement(By.id("com.fivemobile.thescore:id/action_button_text")).click();
		
		//Closing theScore BET popup
		driver.findElement(By.id("com.fivemobile.thescore:id/dismiss_modal")).click();
		
		//Click on Leagues tab/button from the bottom menu		
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Leagues\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
		
		//Click on Edit button
	    driver.findElement(By.id("com.fivemobile.thescore:id/header_right_text")).click();
	  
	    //Click on my favorite league - NBA 
	  	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView")).click();
		
	    //Close the S | BET Mode
		driver.findElement(By.id("com.fivemobile.thescore:id/scores_container")).click();
		
		//Click on the first match element Score stats 
		driver.findElement(By.id("com.fivemobile.thescore:id/close")).click();
		
		for (int i=0; i<2; i++) {
			
		//Navigate back twice by clicking on back button on top
		driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
		
		}
	}
		
		//Use AfterTest annotation to execute the tearDown method to quit automation session
        @AfterTest
		public void tearDown() {
		
		driver.quit();
		
		}
		//service.stop();
		//stop server
		
} 
	
	
