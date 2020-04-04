package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DragAndDropPageObj {
	public DragAndDropPageObj(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	private WebElement views;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Drag and Drop']")
	private WebElement dragAndDrop;

	@AndroidFindBy(className="android.view.View")
	private WebElement drag;
	
	@AndroidFindBy(className="android.view.View")
	private WebElement drop;
	

	
	public WebElement getViews()
	{
		return views;
	}


	public WebElement getDragAndDrop()
	{
		return dragAndDrop;
	}
	public WebElement getDrag()
	{
		return drag;
	}
	
	public WebElement getDrop()
	{
		return drop;
	}
}
