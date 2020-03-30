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
	public WebElement Views;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Drag and Drop']")
	public WebElement DragAndDrop;

	@AndroidFindBy(className="android.view.View")
	public WebElement Drag;
	
	@AndroidFindBy(className="android.view.View")
	public WebElement Drop;
	

	
	public WebElement getViews()
	{
		return Views;
	}


	public WebElement getDragAndDrop()
	{
		return DragAndDrop;
	}
	public WebElement getDrag()
	{
		return Drag;
	}
	
	public WebElement getDrop()
	{
		return Drop;
	}
}
