package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Resources.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pageObjects.accessbalityDemoPageObj;

public class accessbalityDemo extends Base{
	
	
@Test
	public void  accessbalityDemoTest() throws IOException, InterruptedException {
		
		AndroidDriver<AndroidElement>driver=capabilities("apiDemo");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 accessbalityDemoPageObj acd=new  accessbalityDemoPageObj(driver);
		 acd.getAccessbility().click();
		 acd.getNodeQuerying().click();
		 acd.getSetting().click();
		 acd.getSearch().click();
		 acd.getsearchText().sendKeys("h");
		    driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		    driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		    driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		    
		
		// TODO Auto-generated method stub

	}

}
