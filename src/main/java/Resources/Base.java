package Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {

	  public static AndroidDriver<AndroidElement>  driver;
	
	public static  AndroidDriver<AndroidElement> capabilities(String appName) throws IOException, InterruptedException
	{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Resources/global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		

		// TODO Auto-generated method stub
	 File appDir = new File("src");
     File app = new File(appDir, (String) prop.get(appName));
     
     DesiredCapabilities capabilities = new DesiredCapabilities();

     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Bhagyawan");
    
     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
     capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
     
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    return driver;
	}
	
	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	
	}
	
	

}



