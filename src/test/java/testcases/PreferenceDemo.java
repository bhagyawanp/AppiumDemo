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

import pageObjects.PreferencesPageObj;
import pageObjects.AnimationPageObj;

public class PreferenceDemo extends Base{

@Test
public void apiDemoTest() throws IOException, InterruptedException
{
		// TODO Auto-generated method stub
	
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
     PreferencesPageObj p=new PreferencesPageObj(driver);
     p.getPreferences().click();
     p.getDependencies().click();
     p.getCheckbox().click();
     driver.pressKey(new KeyEvent(AndroidKey.BACK));
     driver.pressKey(new KeyEvent(AndroidKey.BACK));
     AnimationPageObj an=new AnimationPageObj(driver);
     
     an.animation.click();
     an.flip.click();
     an.flipButton.click();
     
	}





}



