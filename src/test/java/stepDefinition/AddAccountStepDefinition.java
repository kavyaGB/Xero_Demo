package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.jboss.aerogear.security.otp.Totp;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import xeroObjrep.XeroObjrep;

public class AddAccountStepDefinition {

	public WebDriver driver;
		
	@Given("^User is on the home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.xero.com");

	}

	@When("^^User clicks on Login button$")
	public void user_nagivates_to_Xero_login_page() throws InterruptedException {
		driver.findElement(XeroObjrep.LOGIN).click();
		Thread.sleep(7000);
	}

	@When("^User enters valid Username, Password$")
	public void user_enters_valid_Username_Password() throws Throwable {
	    driver.findElement(XeroObjrep.EMAIL).sendKeys("kavya.2481989@gmail.com");
	    driver.findElement(XeroObjrep.PASSWORD).sendKeys("Test1234");
	    driver.findElement(XeroObjrep.SIGNIN).click();
	}

	@Then("^Complete login with Authenticator app page displayed$")
	public void complete_login_with_Authenticator_app_page_displayed() throws Throwable {
	
	}

	@Given("^Authentication page loaded successfully$")
	public void authentication_page_loaded_successfully() throws Throwable {
	}

	@When("^User enters Authentication code$")
	public void user_enters_Authentication_code() throws Throwable {
		String AuthCode = "GY2T GULD GFRU OWSY O5GV UQKW IU"; // authentication key
	    Totp totp = new Totp(AuthCode);
		String code = totp.now(); 
		System.out.println(code);
		driver.findElement(XeroObjrep.AUTHCODE).sendKeys(code);
		driver.findElement(XeroObjrep.AULOGIN).click();
	}

	@Then("^Demo organisation landing page displayed$")
	public void demo_organisation_landing_page_displayed() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^User navigates to Accounting, Bank accounts,, using system tab$")
	public void user_navigates_to_Accounting_Bank_accounts_using_system_tab() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(XeroObjrep.ACCOUNTING).click();
		driver.findElement(XeroObjrep.BANKACCOUNT).click();
	  }

	@When("^User clicks on Add bank account, search for ANZ \\(NZ\\) bank$")
	public void user_clicks_on_Add_bank_account_search_for_ANZ_NZ_bank() throws Throwable {
		driver.findElement(XeroObjrep.AddAccount).click();
		driver.findElement(XeroObjrep.SEARCHBANK).sendKeys("ANZ (NZ)");
		driver.findElement(XeroObjrep.SELECTBANK).click();
		driver.findElement(XeroObjrep.CHOOSEBANK).click();
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User enters Account Name, Account Type, Account Number$")
	public void user_enters_Account_Name_Account_Type_Account_Number() throws Throwable {
		
		long number = (long) Math.floor(Math.random() * 900000000000000L) + 100000000000000L;
		String numberAsString = Long.toString(number);
		
		int usernumber = (int) Math.floor(Math.random() * 9000) + 1000;
		System.out.println(usernumber);
		
		driver.findElement(XeroObjrep.ACCOUNTNAME).sendKeys("XeroUser"+usernumber);
		driver.findElement(XeroObjrep.ACCOUNTTYPE).click();
		driver.findElement(XeroObjrep.SELECTACCTTYPE).click();
		driver.findElement(XeroObjrep.ACCOUNTNUMBER).sendKeys(numberAsString);
		driver.findElement(XeroObjrep.CONTINUE).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@When("^The user clicks on I've got a form, I'll do it later, Go to dashboard$")
	public void the_user_clicks_on_I_ve_got_a_form_I_ll_do_it_later_Go_to_dashboard() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(XeroObjrep.GOTFORM).click();
		Thread.sleep(3000);
		driver.findElement(XeroObjrep.DOLATER).click();
		Thread.sleep(3000);
		driver.findElement(XeroObjrep.DASHBOARD).click();
	   
	}

	@Then("^Account added succesfully$")
	public void account_added_succesfully() throws Throwable {
	 
	}
		
}
