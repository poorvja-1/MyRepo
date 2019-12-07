package week5.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.ExcelFinal;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelfilename = "CreateLead";
	}
@Test
	public void runCreateLead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
}


}






