package Medyaan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class History {

	public static void main(String[] args) throws InterruptedException {
		
		//Chrome_Browser Launch
				WebDriver driver=new ChromeDriver();
				driver.get("https://development.medyaan.in/");
				driver.manage().window().maximize();
		//Login to Paitent Dashboard
		driver.findElement(By.xpath("//*[text()=\"Sign In\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu show']//a)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("9025269825");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn login-button btn-secondary btn-block\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn backnav-btn cancelbtn-color mt-4 btn-secondary\"]")).click();
		Thread.sleep(2000);
		
		//History
		driver.findElement(By.xpath("(//*[text()[normalize-space()='History']])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='View'])[3]")).click();
		JavascriptExecutor down = (JavascriptExecutor) driver;
		down.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"button\"])[9]")).click();
		Thread.sleep(2000);
		JavascriptExecutor down1 = (JavascriptExecutor) driver;
		down1.executeScript("window.scrollBy(0,500)");
		
		
		
	}

}
