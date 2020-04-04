package testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Resources.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.VoiceRecognPageObj;

public class VoiceRecognization extends Base {

	@Test
	public void voiceRecognizationtest() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     Thread.sleep(5000);
     VoiceRecognPageObj vrp=new VoiceRecognPageObj(driver);
     vrp.getApp().click();
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Voice Recognition\"));");
	 vrp.getVoiceRecognition().click();
	 vrp.getSupportedLanguage().click();
	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"uk-UA\"));");
	 vrp.getseletLanguage().click();
	}

}


