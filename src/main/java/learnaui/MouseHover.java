package learnaui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Softwares\\drivers\\Chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Actions builder = new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		builder.moveToElement(electronics).perform();
		driver.findElement(By.xpath("(//a[@title='Mi'])[1]")).click();
		
	}

}
