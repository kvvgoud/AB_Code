package or_OF;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository{  // OBJECT REPOSITORY for ONE_FREIGHT application:
	
//------------	
//Login Page: 
//------------	
	@FindBy(id="frm_Login:loginId")
	public WebElement txtUserName;
	
	@FindBy(id="frm_Login:pwd_login_password")
	public WebElement txtPassword;
	
	@FindBy(id="frm_Login:btn_login_loginbutton")
	public WebElement btnLogin;
	
	public void Login(String Username, String Password) throws Exception {
		txtUserName.clear();
		txtUserName.sendKeys(Username);
		txtPassword.clear();
		txtPassword.sendKeys(Password);
		btnLogin.click();
		Thread.sleep(5000);
		
	}
	
//*****************************************************************************************	
//----------
// Log Out: 	
//----------
	
	@FindBy(id="")
	public WebElement logout;

//*****************************************************************************************	
//--------------------------------
//Calcualte and Book New Shipment:	
//--------------------------------

	@FindBy(id="frm_rate:j_id_1k:daterangeinput")
	public WebElement Calendar_ReadyDate;
	
	@FindBy(xpath="//a[@title='Next']")
	public WebElement lnk_NextMonth;
	
	@FindBy(xpath="//a[text()='15']")
	public WebElement SelectDatefromCalendar;
	
//*****************************************************************************************	
//---------------------------
// Container Details Section:	
//---------------------------
	
	@FindBy(id="frm_rate:container_details")
	public WebElement SelectContainerDetails;
	
	@FindBy(xpath="//button[@id='containers_display_form:container_selector_dataGrid:0:add_container']")
	public WebElement Container1;
	
	@FindBy(xpath="//button[@id='containers_display_form:container_selector_dataGrid:1:add_container']")
	public WebElement Container2;
	
	@FindBy(xpath="//button[@id='containers_display_form:container_selector_dataGrid:2:add_container']")
	public WebElement Container3;
	
	@FindBy(xpath="//button[@id='containers_display_form:container_selector_dataGrid:3:add_container']")
	public WebElement Container4;
	
	@FindBy(xpath="//button/span[text()='CONFIRM']")
	public WebElement btnConfirm;
	
}
	
	
	
	


