package week1.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Softwares\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NMKL", Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		WebElement train = driver.findElementByXPath("//table[contains(@class,'DataTable TrainList TrainListHeader')]");
		List<WebElement> listCount = train.findElements(By.tagName("tr"));
		int size = listCount.size();
		System.out.println(size);
		driver.close();
		

	}

}
