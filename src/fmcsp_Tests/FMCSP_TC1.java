package fmcsp_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class FMCSP_TC1 {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setup Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void quit() {
		
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
	
	@Test
	public void FM_Test1() throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		driver.get("https://ceva-snapshot.mydevcloud.io/fmcsp/login.xhtml");
//	Login......	
		driver.findElement(By.id("loginPage:frm_login:txt_login_loginid")).sendKeys("sysadmin");
		driver.findElement(By.id("loginPage:frm_login:pwd_login_password")).sendKeys("AAFAdmin1$");
		driver.findElement(By.id("loginPage:frm_login:btn_login_loginbutton")).click();
		Thread.sleep(5000);
		
//  Logout: 
		WebElement lnkLogout = driver.findElement(By.linkText("(Logout)"));
		wait.until(ExpectedConditions.elementToBeClickable(lnkLogout));
		lnkLogout.click();
		Thread.sleep(5000);
		
		
	}

}
