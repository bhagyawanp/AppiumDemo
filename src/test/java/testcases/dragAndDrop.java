package testcases;

import org.testng.annotations.Test;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import Resources.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pageObjects.AccessbalityPageObj;
import pageObjects.DragAndDropPageObj;


public class DragAndDrop extends Base{

@Test(priority=1)
public void apiDemoTest() throws IOException, InterruptedException
{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities("apiDemo");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
     DragAndDropPageObj Dp= new DragAndDropPageObj(driver);
     Dp.getViews().click();
     Dp.getDragAndDrop().click();
     WebElement source=Dp.getDrag();
     WebElement destination=Dp.getDrop();
	 TouchAction t=new TouchAction(driver);
	 t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();



}

}



