package devBranch;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class LinkedIn_Test extends Base{
 
  @Test
  public void f() throws Exception {
	  
	  driver.get("https://www.linkedin.com/");
	  
	  driver.findElement(By.linkText("Sign in")).click();
	  
	  driver.findElement(By.id("username")).sendKeys("SAmpleEmailID");
	  driver.findElement(By.id("password")).sendKeys("SamplePassword");
	  driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.id("username")).clear();
	  driver.findElement(By.id("password")).clear();
	  
  }
  
}
