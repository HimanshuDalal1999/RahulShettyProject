package RahulShettyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RSDriverFactory 
{
	static WebDriver driver;
	public WebDriver LaunchBrowser(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		// code of opening the browser will get trigger from another class hence we return the driver here
		return driver;
		
	}
	
	// Here we mention static since we have easily call the object of driver in another class
	public static WebDriver GetDriver()
	{
		return driver;
	}

}
