package devBranch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import or_OF.ObjectRepository;

public class OF_TC1 extends Base{
	
	ObjectRepository or_obj = new ObjectRepository();
  
  @Test
  public void OF_FirstTest() throws Exception {
	  
	  PageFactory.initElements(driver, or_obj);
	  WebDriverWait wait = new WebDriverWait(driver,60);
//	  driver.get("https://ceva-snapshot.mydevcloud.io/one-freight/");
	  driver.get(DevURL);
	  
	  or_obj.Login(Username, Password);
	  
// Click on Calendar:	  
	  wait.until(ExpectedConditions.elementToBeClickable(or_obj.Calendar_ReadyDate));
	  or_obj.Calendar_ReadyDate.click();
	  
// Click on Next Month arrow:
	  wait.until(ExpectedConditions.elementToBeClickable(or_obj.lnk_NextMonth));
	  or_obj.lnk_NextMonth.click();
	  
//	Select a Date from the Calendar:
	  wait.until(ExpectedConditions.elementToBeClickable(or_obj.SelectDatefromCalendar));
	  or_obj.SelectDatefromCalendar.click();
	  Thread.sleep(5000);
	  
// => Select Containers: 
	  wait.until(ExpectedConditions.elementToBeClickable(or_obj.SelectContainerDetails));
	  or_obj.SelectContainerDetails.click();
	  Thread.sleep(5000);
	  
// Add Container1 by clicking on "+" for "40' Hi Cube"
	  wait.until(ExpectedConditions.elementToBeClickable(or_obj.Container1));
	  or_obj.Container1.click();
	 	  
// Assert the Selected container details displayed:
	 WebElement selectedContainers = driver.findElement(By.id("selected_containers_form:selected_containers:0:j_id_5c_content"));
	 wait.until(ExpectedConditions.visibilityOf(selectedContainers));
	 String text_SelectedContainers = selectedContainers.getText();
	 System.out.println("Selected Containers are: " + text_SelectedContainers);
	 
	 Assert.assertEquals(text_SelectedContainers, "1x 40' Hi Cube");
	       
// Add Container2 by clicking on "+" for "40' Hi Cube"
	 wait.until(ExpectedConditions.elementToBeClickable(or_obj.Container2));
	 or_obj.Container2.click();
	 Thread.sleep(2000);
	 	  
// Add Container3 by clicking on "+" for "40' Hi Cube"
	 wait.until(ExpectedConditions.elementToBeClickable(or_obj.Container3));
	 or_obj.Container3.click();
	 Thread.sleep(2000);
	 
// Add Container4 by clicking on "+" for "40' Hi Cube"
	 wait.until(ExpectedConditions.elementToBeClickable(or_obj.Container4));
	 or_obj.Container4.click();
	 Thread.sleep(2000);
	
	 
//	 Click on Confirm button: 
	 wait.until(ExpectedConditions.elementToBeClickable(or_obj.btnConfirm));
	 or_obj.btnConfirm.click();
	 Thread.sleep(5000);
	 
//Wait for the Container Details text box and Assert the text in it.
	 wait.until(ExpectedConditions.elementToBeClickable(or_obj.SelectContainerDetails));
	 
	 String ContainersCount = or_obj.SelectContainerDetails.getAttribute("value");
	 System.out.println("Containers Count = "+ContainersCount);
	 Assert.assertEquals(ContainersCount, "1x 40' Hi Cube		+3");

	  
  }

}
