package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Softwares\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		Thread.sleep(2000);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Aspire");
		driver.findElementById("createLeadForm_firstName").sendKeys("Poorvja");
		driver.findElementById("createLeadForm_lastName").sendKeys("Narayanam Kumaar");
		driver.findElementByClassName("smallSubmit").click();
		String title = driver.getTitle();
		System.out.println(title);
		String lead = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(lead);
		
		//driver.close();
		
}
}
