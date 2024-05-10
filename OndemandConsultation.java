package Medyaan;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OndemandConsultation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://development.medyaan.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

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
		driver.findElement(By.xpath("//*[@class=\"card type-of-consulation v-step-3\"]")).click();
		Thread.sleep(2000);

		//Patient-ON-Demand Consultation-GetStart Page
		//driver.findElement(By.xpath("(//*[@class=\"icon\"])[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("complaintInfo")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("complaintDescriptionInfo")).sendKeys("Bone infections (osteomyelitis), appendicitis, skin infections or cellulitis, and meningitis\r\n"
				+ "Respiratory infections such as colds or flu-like illnesses, sore throats, ear infections, sinus infections, mononucleosis, bronchitis, pneumonia, and tuberculosis\r\n"
				+ "Urinary tract infections\r\n"
				+ "Viral gastroenterit");
		Thread.sleep(2000);
		JavascriptExecutor Scroll = (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.id("speciality"));
		Thread.sleep(2000);
		WebElement DropdownSpeciality=driver.findElement(By.id("speciality"));
		Select Speciality=new Select(DropdownSpeciality);
		Thread.sleep(2000);
		Speciality.selectByValue("General Physician");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")).sendKeys("Test");
		Thread.sleep(2000);
		WebElement companyname=driver.findElement(By.xpath("(//*[@type=\"text\"])[4]"));
		Thread.sleep(2000);
		companyname.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"text\"])[4]")).sendKeys("Datayaan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"text\"])[5]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text()) = 'No']")).click();
		Thread.sleep(2000);
		JavascriptExecutor down = (JavascriptExecutor) driver;
		down.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@type=\"button\"])[4]")).click();
		Thread.sleep(2000);
		JavascriptExecutor down4 = (JavascriptExecutor) driver;
		down4.executeScript("window.scrollBy(0,1000)");
		//Patient-ON-Demand Consultation-Your Visit.
		/*driver.findElement(By.xpath("(//*[text()='Yes'])[1]")).click();
			Thread.sleep(2000);
			JavascriptExecutor down1 = (JavascriptExecutor) driver;
			down1.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
			driver.findElement(By.id("medicationInput")).sendKeys("Test1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='col-4 topcss1']//button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("medicationInput")).sendKeys("Test2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='col-4 topcss1']//button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("medicationInput")).sendKeys("Test3");	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),\"Add\")]")).click();
			Thread.sleep(2000);
			JavascriptExecutor down2 = (JavascriptExecutor) driver;
			down2.executeScript("window.scrollBy(0,300)");
			driver.findElement(By.xpath("(//div[@class='margin-right']//button)[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[contains(@class,'btn border-rad')])[3]")).click();
			Thread.sleep(2000);

			//Heart disease
			driver.findElement(By.xpath("//label[text()='Stents in heart']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Heart Murmurs']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Irregular heart beat problem']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Hospitalized for heart attack']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
			Thread.sleep(2000);

			//Respiratory problems
			driver.findElement(By.xpath("//label[text()='COPD']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Asthma']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Sinus Allergies']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Home oxygen use']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Sleep Apnea']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
			Thread.sleep(2000);
			JavascriptExecutor down3 = (JavascriptExecutor) driver;
			down3.executeScript("window.scrollBy(0,300)");

			//Liver disease
			driver.findElement(By.xpath("//label[text()='Hepatitis A']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Hepatitis B']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Hepatitis C']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Liver failure']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Liver transplant']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");

			//Kidney disease
			driver.findElement(By.xpath("//label[text()='Dialysis']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Kidney stones']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
			Thread.sleep(2000);
			JavascriptExecutor down4 = (JavascriptExecutor) driver;
			down4.executeScript("window.scrollBy(0,300)");

			//Gastrointestinal disease
			driver.findElement(By.xpath("//*[text()=\"Bleeding in stool\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Blood vomiting\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Chronic Diarrhea']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Constipation']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='Others'])[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
			Thread.sleep(2000);

			//Brain Stork:
			driver.findElement(By.xpath("(//input[@value='Yes']/following-sibling::label)[2]")).click();
			Thread.sleep(2000);

			//Hyper tension
			driver.findElement(By.xpath("(//input[@value='Yes']/following-sibling::label)[3]")).click();
			Thread.sleep(2000);
			JavascriptExecutor down5 = (JavascriptExecutor) driver;
			down5.executeScript("window.scrollBy(0,300)");

			//Diabetes
			driver.findElement(By.xpath("(//input[@value='Yes']/following-sibling::label)[4]")).click();
			Thread.sleep(2000);

			//Any Cancer
			driver.findElement(By.xpath("(//input[@value='Yes']/following-sibling::label)[5]")).click();

			//Diabetes Mellitus - Details
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[1]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[1]")).sendKeys("Test");

			//Subclinical Hypothyroidism
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[2]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[2]")).sendKeys("Test");
			Thread.sleep(2000);

			//Asthma
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[3]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[3]")).sendKeys("Test");
			Thread.sleep(2000);

			//Dyslipidemia
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[4]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[4]")).sendKeys("Test");
			Thread.sleep(2000);

			//Coronary Artery Disease
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[5]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[5]")).sendKeys("Test");
			Thread.sleep(2000);

			//Tuberculosis
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[6]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[6]")).sendKeys("Test");
			Thread.sleep(2000);
			JavascriptExecutor down6 = (JavascriptExecutor) driver;
			down6.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);

			//Symptoms
			driver.findElement(By.xpath("//*[text()=\"Palpitations\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Weakness of hands or legs\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Cough\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Abdominal pain\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Back pain\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Weight Loss\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Suicidal ideation\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Chest pain\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Frequent Urinations\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Fever\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()=\"Constipation\"])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Skin Rash\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Shortness of breath\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Dizzy spells\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Headache\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Vomiting/Diarrhea\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Joint pain\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Depression\"]")).click();
			Thread.sleep(2000);

			//Drug allergy
			driver.findElement(By.xpath("//*[text()=\"Penicillin\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Bactrim\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Tetracycline\"]")).click();
			Thread.sleep(2000);

			//Allergy
			driver.findElement(By.xpath("//*[text()=\"Pollen\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Dust Mites\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Mold\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Animal Dander and Cockroaches\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Insect Sting\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=\"Latex\"]")).click();
			Thread.sleep(2000);

			//Vitals
			WebElement BP=driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
			BP.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("97");
			Thread.sleep(2000);
			WebElement BPS=driver.findElement(By.xpath("(//*[@type=\"number\"])[2]"));
			BPS.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type=\"number\"])[2]")).sendKeys("88");
			Thread.sleep(2000);
			WebElement Hight=driver.findElement(By.xpath("(//*[@class=\"profile-input form-control\"])[1]"));
			Hight.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class=\"profile-input form-control\"])[1]")).sendKeys("179");
			Thread.sleep(2000);
			WebElement Weight=driver.findElement(By.xpath("(//*[@class=\"profile-input form-control\"])[2]"));
			Weight.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@class=\"profile-input form-control\"])[2]")).sendKeys("89");
			Thread.sleep(2000);
			WebElement Temp=driver.findElement(By.xpath("(//*[@type=\"text\"])[10]"));
			Temp.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type=\"text\"])[10]")).sendKeys("102");
			Thread.sleep(2000);
			WebElement PulseRate=driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
			PulseRate.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("90");
			Thread.sleep(2000);
			WebElement SPOT=driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
			SPOT.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("90");
			Thread.sleep(2000);

			//On-Examination
			driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[1]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[2]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[3]")).sendKeys("Test");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[4]")).sendKeys("Test");
			Thread.sleep(2000);

			//Immunizations

			WebElement Year=driver.findElement(By.xpath("(//*[@class='el-input__icon'])[1]"));
			Thread.sleep(2000);
			Actions MoveOn = new Actions(driver);
			Thread.sleep(2000);
			MoveOn.moveToElement(Year).perform();
			driver.findElement(By.name("datepicker")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()='2012']")).click();
			Thread.sleep(2000);

			WebElement Year1=driver.findElement(By.xpath("(//*[@class='el-input__icon'])[2]"));
			Thread.sleep(2000);
			Actions GoTo = new Actions(driver);
			Thread.sleep(2000);
			GoTo.moveToElement(Year1).perform();
			driver.findElement(By.name("datepicker")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()='2019'] ")).click();
			Thread.sleep(2000);*/
		driver.findElement(By.id("test")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"button\"])[5]")).click();

		//Summary Page
		JavascriptExecutor down9 = (JavascriptExecutor) driver;
		down9.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"button\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Razor pay\"]")).click();
		Thread.sleep(2000);

		//Payment:
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[text()='Netbanking']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='HDFC']")).click();
		Thread.sleep(2000);
		WebElement Payment=driver.findElement(By.xpath("//*[text()='Pay Now']"));
		Payment.click();
		Set<String> PaymentWindow=driver.getWindowHandles();
		for (String ConfirmationWindow : PaymentWindow) {

			driver.switchTo().window(ConfirmationWindow);

		}
		Thread.sleep(2000);
		driver.findElement(By.className("success")).click();
		Thread.sleep(2000);
		driver.close();
			

	}
}
