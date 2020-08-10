package TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
public class TC001 extends BaseTest 
{
	@Test
	public void m1() 
	{
		HomePage home = new HomePage(driver, webActionUtil);
		home.clickOnSearchButton();
		home.elemtToSearch("Rediff");
		home.selectTextInDropDown("Junk");
	}
}
