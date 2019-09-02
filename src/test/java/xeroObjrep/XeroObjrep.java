package xeroObjrep;

import org.openqa.selenium.By;

public class XeroObjrep {
	
	public static final By LOGIN=By.linkText("Login");
	public static final By EMAIL=By.id("email");
	public static final By PASSWORD=By.id("password");
	public static final By SIGNIN=By.id("submitButton");
	public static final By AUTHCODE=By.cssSelector("input[data-automationid='auth-onetimepassword--input']");
	public static final By AULOGIN=By.cssSelector("button[data-automationid='auth-submitcodebutton']");
	public static final By ACCOUNTING=By.xpath("//ol[1]//li[3]//button");
	public static final By BANKACCOUNT=By.linkText("Bank accounts");
	public static final By AddAccount=By.xpath("//a[@href='/Banking/Account/#find']");
	public static final By SEARCHBANK=By.id("xui-searchfield-1018-inputEl");
	public static final By SELECTBANK=By.linkText("Show 1 result from other countries...");
	public static final By CHOOSEBANK=By.cssSelector("ul#dataview-1025 li:nth-of-type(1)");
	public static final By ACCOUNTNAME=By.id("accountname-1037-inputEl");
	public static final By ACCOUNTTYPE=By.id("accounttype-1039-bodyEl");
	public static final By SELECTACCTTYPE=By.cssSelector("ul#boundlist-1076-listEl li:nth-of-type(1)");
	public static final By ACCOUNTNUMBER=By.id("accountnumber-1068-inputEl");	
	public static final By CONTINUE=By.xpath("//span[contains(text(), 'Continue')]");
	public static final By GOTFORM=By.xpath("//a[@data-automationid='connectbank-buttonIHaveAForm']");
	public static final By DOLATER=By.xpath("//a[@data-automationid='uploadForm-uploadLaterButton']");
	public static final By DASHBOARD=By.xpath("//a[@data-automationid='uploadFormLater-goToDashboardButton']");

}
