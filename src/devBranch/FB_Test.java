package devBranch;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class FB_Test extends Base{
 
  @Test
  public void f() throws Exception {
	  
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("SAmpleEmailID");
	  driver.findElement(By.id("pass")).sendKeys("SamplePassword");
	  driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.findElement(By.id("email")).clear();
	  
  }
  
}
