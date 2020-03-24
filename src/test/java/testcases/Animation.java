package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import pageObjects.HomePage;
import pageObjects.Preferences;
import pageObjects.animationPageObj;

public class Animation extends Base{

@Test
public void Flips() throws IOException, InterruptedException
{
		// TODO Auto-generated method stub

	
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
    animationPageObj an=new animationPageObj(driver);
     an.animation.click();
     an.Flip.click();
     an.FlipButton.click();
     
     
    // Preferences p=new Preferences(driver);
    // driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
     //p.dependencies.click();
     
     
   
     
   //  driver.findElementById("android:id/checkbox").click();
   //  driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
   //  driver.findElementByClassName("android.widget.EditText").sendKeys(input);
    // driver.findElementsByClassName("android.widget.Button").get(1).click();
   //  p.buttons.get(1).click();
  
     
     
	}




}
