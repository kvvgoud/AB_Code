package devBranch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import or_OF.ObjectRepository;

public class Base {
	
	public static WebDriver driver;

	public String Username = "aaf.admin";
	public String Password = "AAFAdmin1$";
	
	public String ChromeDriverPath = "D:\\Setup Files\\chromedriver.exe";
//	public String FFdriverPath = "";
	
//	Dev URL: 
	public String DevURL = "https://ceva-snapshot.mydevcloud.io/one-freight/";
	
	ObjectRepository or_obj = new ObjectRepository();
	
	
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.manage().deleteAllCookies();
	  driver.quit();
  }

}
