package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PreferencesPageObj {
	public PreferencesPageObj(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	private WebElement Preferences;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	private WebElement dependencies;

	@AndroidFindBy(className="android.widget.Button")
	private List<WebElement> buttons;
	
	@AndroidFindBy(id="android:id/checkbox")
	private WebElement checkbox;
	

	

	public WebElement getPreferences()
	{
		return Preferences;
	}


	public WebElement getDependencies()
	{
		return dependencies;
	}
	public List<WebElement> getButtons()
	{
		return buttons;
	}
	
	public WebElement getCheckbox()
	{
		return checkbox;
	}
}
