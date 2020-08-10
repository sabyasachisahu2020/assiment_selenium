package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.WebActionUtil;
public class LoginPage extends BasePage
{
	@FindBy(className="signinbtn")
	private WebElement signInButton;
	
	@FindBy(id="login1")
	private WebElement Usernamebtn;
	
	@FindBy(id="password")
	private WebElement passwordbtn;
	
	
	

	public LoginPage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public HomePage login(String un, String pwd)
	{
//		webActionUtil.clickOnElement(signInButton);
		webActionUtil.enterKeys(Usernamebtn, un);
		webActionUtil.enterKeys(passwordbtn, pwd);
		
		webActionUtil.clickOnElement(signInButton);
		
		return new HomePage(driver,webActionUtil);
	}
	
	
	public void login(CharSequence[]  row, CharSequence[] col)
	{
//		webActionUtil.clickOnElement(signInButton);
		webActionUtil.enterKeys1(Usernamebtn, row);
		webActionUtil.enterKeys1(passwordbtn, col);
		
		webActionUtil.clickOnElement(signInButton);
	}
	
	
}
