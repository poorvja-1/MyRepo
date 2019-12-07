package week1.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Softwares\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.findElementById("FromTag").sendKeys("MAA", Keys.TAB);
		driver.findElementById("ToTag").sendKeys("NYC", Keys.TAB);
		WebElement adults = driver.findElementById("Adults");
		Select sel = new Select(adults);
		sel.selectByVisibleText("1");
		WebElement child = driver.findElementById("Childrens");
		Select sel1 = new Select(child);
		sel1.selectByValue("1");
		driver.findElementById("SearchBtn").click();
		WebElement err = driver.findElementByXPath("//*[@id=\"homeErrorMessage\"]");
		System.out.println(err.getText());
		
		
	}

}
