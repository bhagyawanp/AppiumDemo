package testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import pageObjects.Preferences;
import pageObjects.animationPageObj;

public class ApiDemoTest extends Base{

@Test
public void apiDemoTest() throws IOException, InterruptedException
{
		// TODO Auto-generated method stub
	
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
     Preferences p=new Preferences(driver);
     p.getPreferences().click();
     p.getDependencies().click();
     p.getCheckbox().click();
     driver.pressKey(new KeyEvent(AndroidKey.BACK));
     driver.pressKey(new KeyEvent(AndroidKey.BACK));
     animationPageObj an=new animationPageObj(driver);
     an.animation.click();
     an.Flip.click();
     an.FlipButton.click();
     
	}




}



