package TestCases;

import org.testng.annotations.Test;

import Pages.HomePage;

public class TC003 extends BaseTest{
	
	@Test
	public void writeMail() {
		HomePage home=new HomePage(driver,webActionUtil);
		home.elemtToSearch("Rediff");
		home.selectTextInDropDown("Write mail");
		home.clickOnWriteMail();
		home.clickOnToButton("suresh");
		home.subButton("Assignment");
//		home.editButton("suresh has failed to get job");
		home.sendButton();
	}

}
