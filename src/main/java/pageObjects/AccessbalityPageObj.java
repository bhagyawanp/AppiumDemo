package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccessbalityPageObj{

	
	//Concatenate driver
	public AccessbalityPageObj(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility']")
	
	
	private WebElement accessbility;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility Node Querying']")
	public WebElement nodeQuerying;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/button")
	private WebElement setting;
	

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc='Search settings']")
	private WebElement search;
	
	@AndroidFindBy(id="android:id/search_src_text")
	private WebElement searchText;
	
	
	
	

	public WebElement getAccessbility()
	{
		return  accessbility;
	}
	public WebElement getNodeQuerying()
	{
		
		return nodeQuerying;
	}
	public WebElement getSetting()
	{
		
		return  setting;
	}
	public WebElement getSearch()
	{
		
		return  search;
	}
	public WebElement getSearchText()
	{
		
		return  searchText;
	}

	
	
	
	
}
