package faceBookTest;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import faceBookPages.LoginPage;
import faceBookPages.WaitPage;

public class TestPage {

	WebDriver driver;
	LoginPage loginPage;

	@BeforeClass(alwaysRun=true)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/musaates/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");

	}

	@Test(groups = { "t1", "field" })
	public void test1() throws InterruptedException {
		loginPage = new LoginPage(driver);
		String email = "masum@gmail.com";
		WaitPage.waitForElement(loginPage.emailId, 10);
		loginPage.emailId.sendKeys(email);
		Thread.sleep(3000);
		Assert.assertEquals(email, loginPage.emailId.getAttribute("value"));
		
		System.out.println(loginPage.emailId.getAttribute("value"));

	}

	@Test(groups = { "t2", "field" })
	public void test2() throws InterruptedException {
		loginPage = new LoginPage(driver);
		String pasword = "1234";
		loginPage.passId.sendKeys(pasword);
		
		Thread.sleep(3000);
		Assert.assertEquals(pasword, loginPage.passId.getAttribute("value"));
		System.out.println(loginPage.passId.getAttribute("value"));
		
		WaitPage.waitForClickable(loginPage.login, 10);
		loginPage.login.click();
	}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}

}
