package library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebActUtil
{
	static {
		System.out.println("WebActUtil class");
	}
	
	public WebDriver driver;
	public long ETO;
	public WebDriverWait wait;
	
	public WebActionUtil(WebDriver driver,long ETO)
	{
		System.out.println("WebActUtil Constructor");
		this.driver = driver;
		this.ETO=ETO;
		wait = new WebDriverWait(driver,ETO);
	}
	
	public void clickOnElement(WebElement target)
	{
		System.out.println("clickOnElement Method");
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.elementToBeClickable(target));
		 target.click();
	}
	
	
	
	public void enterKeys(WebElement target, String keysToSend)
	{
		System.out.println("enterKeys Method");
		wait.until(ExpectedConditions.visibilityOf(target));
		target.clear();
		target.sendKeys(keysToSend);
	}
	public void enterKeys1(WebElement target, CharSequence[] row)
	{
		System.out.println("enterKeys Method");
		wait.until(ExpectedConditions.visibilityOf(target));
		target.clear();
		target.sendKeys(row);
	
	}
	
	
	
	
	public void selectDropDownText(WebElement target, String text)
	{
		System.out.println("selectDropDownText Method");
		Select select = new Select(target);
		select.selectByVisibleText(text);
	}
	
	public void mouseHover(WebElement target)
	{
		System.out.println("mouseHover Method");
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();
	}
	
	
	
	
	
}
