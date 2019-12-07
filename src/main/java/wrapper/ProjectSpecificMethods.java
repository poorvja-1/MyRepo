package wrapper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.ExcelFinal;

public class ProjectSpecificMethods {
	public String excelfilename;
	public ChromeDriver driver;
	
	@Parameters({"url", "uName", "pwd"})
	
	@BeforeMethod
public void login(String url, String uname, String pwd) {
	System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Softwares\\drivers\\Chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys(uname);
	driver.findElementById("password").sendKeys(pwd);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
}

@AfterMethod
public void logout() {
	driver.close();
}

@DataProvider
public String[][] sendData() throws IOException{
	
	/*
	 
	 */
	ExcelFinal eFinal = new ExcelFinal();
	return eFinal.finalExcel(excelfilename);
}
}
