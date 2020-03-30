package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// All th objects belonging to one page will be defined in java class
public class animationPageObj {
// 1. Is to call the driver object from testcase to Pageobject file
	
	//Concatenate driver
	public animationPageObj(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Animation']")
	public WebElement animation;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='View Flip']")
	public WebElement Flip;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/button")
	public WebElement FlipButton;
	
	

	public WebElement getAnimation()
	{
		return animation;
	}
	public WebElement getFiip()
	{
		
		return Flip;
	}
	public WebElement getFiipButton()
	{
		
		return  FlipButton;
	}
	
	
	
}
