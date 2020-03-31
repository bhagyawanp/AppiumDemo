package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VoiceRecognPageObj {
	public VoiceRecognPageObj(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='App']")
	public WebElement App;
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Voice Recognition']")
	public WebElement voiceRecognition;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/supported_languages")
	public WebElement supportedLanguage;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='uk-UA']")
	public WebElement seletLanguage;
	
	
	public WebElement getApp()
	{
		return App;
	}
	public WebElement getVoiceRecognition()
	{
		return voiceRecognition;
	}
	public WebElement getSupportedLanguage()
	{
		return supportedLanguage;
	}
	public WebElement getseletLanguage()
	{
		return seletLanguage;
	}
	
	
}
