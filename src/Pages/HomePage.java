package Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionUtil;
public class HomePage extends BasePage
{	
	@FindBy(className="rd_logout")
	private WebElement logoutButton;
	
	@FindBy(id="inp_search_box")
	private WebElement searchButton;
	
	@FindBy(xpath="//ul[@id='boxscroll']/li/a")
	private WebElement dropDownList;
	
	@FindBy(className="rd_write")  
	private WebElement writeMailLink;
	
	@FindBy(id="TO_IDcmp2")
	private WebElement clickOnToButton;   
	
	@FindBy(xpath="//input[contains(@class,'rd_subject_datacmp2')]")  
	private WebElement subButton;
	
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")
	private WebElement writeFeedBack;
	
	@FindBy(xpath="//body[contains(@class,'cke_editable')]")  
	private WebElement editButton;
	
	@FindBy(xpath="Send")  
	private WebElement sendButton;
	
	public HomePage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logoutButton);
	}
	
	public void clickOnSearchButton() {
		
		webActionUtil.clickOnElement(searchButton);
	}
	
	public void elemtToSearch(String text) {
		webActionUtil.enterKeys(searchButton, text);
		
	}
	
	public void selectTextInDropDown(String element) {
		webActionUtil.selectDropDownText(dropDownList, element);
		
	}
	
	public void clickOnWriteMail() {
		webActionUtil.clickOnElement(writeMailLink);
		
	}
	public void clickOnToButton(String ele1) {
		webActionUtil.enterKeys(clickOnToButton,ele1);
		
	}
	public void subButton(String ele2) {
		webActionUtil.enterKeys(subButton,ele2);  
		
	}
	
	public void writeFeedBack(String ele3) {
		webActionUtil.enterKeys(writeFeedBack,ele3);
		
	}
	public void editButton(String ele4) {
		webActionUtil.enterKeys(editButton,ele4);
		
	}
	public void sendButton() {
		webActionUtil.clickOnElement(sendButton);
		
	}
	
}




