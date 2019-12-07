package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Softwares\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.findElementById("src").sendKeys("Chennai", Keys.TAB);
		driver.findElementById("dest").sendKeys("Trichy", Keys.TAB);
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		driver.findElement(By.xpath("(//td[@class='current day'])[2]")).click();
		driver.findElement(By.id("return_cal")).click();
		driver.findElement(By.xpath("(//td[@class='current day'])[2]")).click();
		driver.findElement(By.id("search_btn")).click();
	}
}

