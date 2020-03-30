package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// All th objects belonging to one page will be defined in java class
public class accessbalityDemoPageObj{
// 1. Is to call the driver object from testcase to Pageobject file
	
	//Concatenate driver
	public accessbalityDemoPageObj(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility']")
	
	public WebElement accessbility;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility Node Querying']")
	public WebElement NodeQuerying;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/button")
	public WebElement setting;
	

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Search settings']")
	public WebElement search;
	
	@AndroidFindBy(id="android:id/search_src_text")
	public WebElement searchText;
	

	public WebElement getAccessbility()
	{
		return  accessbility;
	}
	public WebElement getNodeQuerying()
	{
		
		return NodeQuerying;
	}
	public WebElement getSetting()
	{
		
		return  setting;
	}
	public WebElement getSearch()
	{
		
		return  search;
	}
	public WebElement getsearchText()
	{
		
		return  searchText;
	}

	
	
	
	
}
