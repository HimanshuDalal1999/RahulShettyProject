package RahulShettyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_Page 
{
	WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Practice'])[1]") private WebElement buttonpractice;
	@FindBy(xpath = "//input[@name='name']") private WebElement namefield;
	@FindBy(xpath = "//input[@name='email']") private WebElement emailfield;
	@FindBy(xpath = "//button[@id='form-submit']") private WebElement submitbutton;
	
	
	public POM_Page(WebDriver driver)
	{
		this.driver = driver; // 
		PageFactory.initElements(driver, this);
	}
	
	public void Practicebutton()
	{
		buttonpractice.click();
	}
	public void NameField()
	{
		namefield.sendKeys("");
	}
	
	

}
