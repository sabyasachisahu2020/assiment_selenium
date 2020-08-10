package TestCases;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelLibrary;
import library.GenericLibrary;
import Pages.HomePage;
import Pages.LoginPage;
public class TC002 extends BaseTest 
{
	@DataProvider
	public Object[][] getData()
	{
		return ExcelLibrary.getExcelData(XL_PATH1, "Sheet1");
	}
	
	
//	@Test(dataProvider="getData")
//	public void addProductToCartFromExcel(String productId, String size, String color)
//	{
//		productId=Generic.removeDecimal(productId);
//		HomePage home = new HomePage(driver, webActionUtil);
//		home.clickOnDressesLink();
//		home.selectProduct(productId);
//		ProductPage productPage = home.clickMoreButton(productId);
//		productPage.clickPlusButton(4);
//		productPage.clickMinusButton(2);
//		productPage.selectSize(size);
//		productPage.selectColor(color);
//		productPage.clickOnAddToCart();
//		OrderPage orderPage = productPage.clickOnProceedToCheckOut();;
//		Assert.assertTrue(orderPage.verifyProductIsDiplayed(productId));
//	}
	
	
	
	
//	@Test(dataProvider="getData")
//	public void login1(String un,String pwd) {
//		LoginPage log=new LoginPage(driver,webActionUtil);
//		log.login(un,pwd);
//		
//	}
	
	@Test(dataProvider="gteData")
	public void searchField() {
		HomePage home=new HomePage(driver,webActionUtil);
		home.elemtToSearch("Rediff");
		home.selectTextInDropDown("Bulk");
		
		
	}
}
