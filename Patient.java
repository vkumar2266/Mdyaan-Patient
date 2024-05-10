package Medyaan;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import net.bytebuddy.asm.Advice.Enter;

public class Patient {

	public static void main(String[] args) throws InterruptedException {


		//Chrome_Browser Launch
		WebDriver driver=new ChromeDriver();
		driver.get("https://development.medyaan.in/");
		driver.manage().window().maximize();

		//Login to Paitent Dashboard
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu show']//a)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("9025269825");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn login-button btn-secondary btn-block\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@role='presentation'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='tablist']//header/a)[1]")).click();
		Thread.sleep(2000);

		//My profile-Basic Information	
		/*driver.findElement(By.xpath("//button[@title='Click here, to edit the form']")).click();
		WebElement Firstname=driver.findElement(By.id("firstnames"));
		Firstname.clear();		
		driver.findElement(By.id("firstnames")).sendKeys("Archana Devi");
		Thread.sleep(2000);
		WebElement Secondname=driver.findElement(By.id("lastname"));
		Secondname.clear();
		driver.findElement(By.id("lastname")).sendKeys("R");
		Thread.sleep(2000);
		driver.findElement(By.name("radioInline")).click();
		Thread.sleep(2000);
		WebElement dropdownElement=driver.findElement(By.name("radioInline"));
		Select dropdown =new Select(dropdownElement);
		dropdown.selectByValue("Others");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ssva2266@gmail.com");	
		Thread.sleep(2000);
		driver.findElement(By.id("maritalstatus")).click();
		WebElement maritialStatus=driver.findElement(By.id("maritalstatus"));
		Select Staus =new Select(maritialStatus);
		Staus.selectByValue("married");
		Thread.sleep(2000);

		//Date Picker clearance
		WebElement Dateclose=driver.findElement(By.xpath("//span[@class='el-input__suffix-inner']//i[1]"));
		Actions MoveOn = new Actions(driver);
		Thread.sleep(2000);
		MoveOn.moveToElement(Dateclose).perform();
		Dateclose.click();
		WebElement Calender=driver.findElement(By.id("dateofbirth"));
		Thread.sleep(2000);
		Calender.click();
		WebElement Year=driver.findElement(By.xpath("//span[text()='2024 ']"));
		Year.click();
		Thread.sleep(5000);
		WebElement PreviousButton=driver.findElement(By.xpath("//*[@class='el-picker-panel__icon-btn el-date-picker__prev-btn el-icon-d-arrow-left']"));
		PreviousButton.click();
		Thread.sleep(2000);
		int numberofClick=3;
		for (int i = 0; i < numberofClick; i++)
			PreviousButton.click();
		Thread.sleep(2000);
		WebElement SelectYear=driver.findElement(By.xpath("//a[contains(text(),'1989')]"));
		SelectYear.click();
		Thread.sleep(2000);
		WebElement SelectMonth=driver.findElement(By.xpath("//a[contains(text(),'Jul')]"));
		SelectMonth.click();
		Thread.sleep(2000);
		WebElement SelectDate=driver.findElement(By.xpath("//span[text()[normalize-space()='20']]"));
		SelectDate.click();
		Thread.sleep(2000); 
		JavascriptExecutor Scroll = (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000); 

		//Language:
		driver.findElement(By.id("language")).click();
		WebElement language=driver.findElement(By.id("language"));
		Select Lang=new Select(language);
		Lang.selectByValue("Tamil");
		driver.findElement(By.id("phonenumber")).sendKeys("phonenumber");
		WebElement Econtact=driver.findElement(By.xpath("//*[@class=\"form-control\"]"));
		Econtact.clear();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[@class=\"form-control\"]")).sendKeys("8072393160");
		WebElement Company=driver.findElement(By.xpath("//*[@class=\"profile-input mb-0 form-control\"]"));
		Company.clear();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//*[@class=\"profile-input mb-0 form-control\"]")).sendKeys("Datayaan");
		Thread.sleep(3000);
		WebElement Element1 = driver.findElement(By.xpath("(//a[@role='button'])[3]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"btn primary-btn submit-btn-size btn-secondary\"]")).click();
		Thread.sleep(2000);*/

		//Address	
		driver.findElement(By.xpath("(//div[@role='tablist']//header/a)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Add new address']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"profile-input profile-address-input form-control\"][1]")).sendKeys("5/172");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profile-input profile-address-input form-control'])[2]")).sendKeys("Tambaram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='autocomplete__results__item']/following-sibling::li)[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class=\"profile-address-input form-control\"])[2]")).sendKeys("7868851212");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class=\"profile-input profile-address-input form-control\"])[5]")).sendKeys("medyaan@gmail.com");
		Thread.sleep(5000);
		WebElement AddressType=driver.findElement(By.xpath("//select[@class='profile-address-input custom-select']"));
		Select Type=new Select(AddressType);
		Thread.sleep(5000);
		Type.selectByValue("Commercial");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class=\"custom-control-label\"][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(text(),\"Submit\")])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"action svg-inline--fa fa-edit fa-w-18\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@placeholder='example@gmail.com'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@placeholder='example@gmail.com'])[2]")).sendKeys("Datayaan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,'btn submitbtn-color')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"action svg-inline--fa fa-trash fa-w-14\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()[normalize-space()='Yes']]")).click();

		//Profile-Vitals:	
		driver.findElement(By.linkText("Vitals")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn backnav-btn submitbtn-color float-right btn-secondary\"]")).click();
		Thread.sleep(2000);
		WebElement BP=driver.findElement(By.xpath("(//*[@type=\"number\"])[1]"));
		BP.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"number\"])[1]")).sendKeys("97");
		Thread.sleep(2000);
		WebElement BPS=driver.findElement(By.xpath("(//*[@class=\"profile-input  form-control\"])[2]"));
		BPS.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"profile-input  form-control\"])[2]")).sendKeys("88");
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
		WebElement Temp=driver.findElement(By.xpath("(//*[@type=\"text\"])[3]"));
		Temp.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"text\"])[3]")).sendKeys("102");
		Thread.sleep(2000);
		WebElement PulseRate=driver.findElement(By.xpath("(//*[@type=\"number\"])[3]"));
		PulseRate.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"number\"])[3]")).sendKeys("90");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"No\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"No\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"No\"])[3]")).click();
		Thread.sleep(2000);
		WebElement SPOT=driver.findElement(By.xpath("(//*[@type=\"number\"])[4]"));
		SPOT.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type=\"number\"])[4]")).sendKeys("90");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"pull-right primary_btn submit_btn submitbtn-color pt-0\"]")).click();

		//Profile-Health History-Heart disease:	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Health history\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Medical history')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("editButtonID")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Stents in heart\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Heart murmurs\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Irregular heart beat problem\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Hospitalized for heart attack\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
		Thread.sleep(2000);

		//Profile-Health History-Respiratory problems:	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"COPD\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Asthma\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Sinus allergies\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Home oxygen use\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Sleep apnea\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
		Thread.sleep(2000);

		//Profile-Health History-Liver disease:	
		driver.findElement(By.xpath("(//*[text()=\"Hepatitis A\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Hepatitis B\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Hepatitis C\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Liver failure\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Liver transplant\"])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
		Thread.sleep(2000);

		//Profile-Health History-Kidney disease:	
		driver.findElement(By.xpath("//*[text()=\"Dialysis\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Kidney stones\"]")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
		Thread.sleep(2000);

		//Profile-Health History-Gastrointestinal problems:		
		driver.findElement(By.xpath("//*[text()=\"Bleeding in stool\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Blood vomiting\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Chronic diarrhea\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Constipation\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Others\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@id='validation']/preceding-sibling::input")).sendKeys("Test");
		Thread.sleep(2000);

		//Profile-Health History-Brain stroke:
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=\"Yes\"])[4]")).click();
		Thread.sleep(2000);
		WebElement Element2=driver.findElement(By.xpath("(//*[@class=\"btn pull-right primary_btn submit_btn submitbtn-color pt-1 btn-secondary\"])[1]"));
		JavascriptExecutor JS1=(JavascriptExecutor) driver;
		JS1.executeScript("arguments[0].scrollIntoView();", Element2);
		Thread.sleep(2000);
		WebElement DiabetesMellitus=driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[1]"));
		DiabetesMellitus.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[1]")).sendKeys("Test");
		Thread.sleep(2000);
		WebElement SubclinicalHypothyroidism=driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[2]"));
		SubclinicalHypothyroidism.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[2]")).sendKeys("Test");
		Thread.sleep(2000);
		WebElement Asthma=driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[3]"));
		Asthma.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[3]")).sendKeys("Test");
		Thread.sleep(2000);
		WebElement Dyslipidemia=driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[4]"));
		Dyslipidemia.clear();
		driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[4]")).sendKeys("Test");
		Thread.sleep(2000);
		WebElement CoronaryArteryDisease=driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[5]"));
		CoronaryArteryDisease.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[5]")).sendKeys("Test");
		Thread.sleep(2000);
		WebElement Tuberculosis=driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[6]"));
		Tuberculosis.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='label-profile ondemand-order']/following-sibling::input)[6]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"btn pull-right primary_btn submit_btn submitbtn-color pt-1 btn-secondary\"])[1]")).click();
		Thread.sleep(2000);

		//Profile-Health History-Family History Info:
		driver.findElement(By.xpath("//a[text()[normalize-space()='Family history info']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'col-sm-12 col-md-12')]//button)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Bleeding disorder\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Stroke\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Cancer\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Diabetes\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Heart disease\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"btn pull-right primary_btn submit_btn submitbtn-color pt-1 btn-secondary\"])[2]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//header[@role='tab']//a)[3]")).click();
		Thread.sleep(2000);

		//Profile-Health History-ON-Examination Info:
		driver.findElement(By.xpath("//a[text()[normalize-space()='On Examination info']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='text-end']//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[1]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[2]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[3]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()[normalize-space()='Per Abdomen']]/following::input)[4]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"submit_btn primary_btn submitbtn-color\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()[normalize-space()='On Examination info']]")).click();
		Thread.sleep(2000);

		//Profile-Reports
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()[normalize-space()='Reports']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn pull-right submitbtn-color attach_btn pt-1 btn-secondary\"]")).click();
		Thread.sleep(2000);
		WebElement down=driver.findElement(By.xpath("//*[text()=\"Cancel\"]"));
		JavascriptExecutor JS3=(JavascriptExecutor) driver;
		JS3.executeScript("arguments[0].scrollIntoView();", down);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Select\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Select\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"cancer\"]")).click();
		Thread.sleep(2000);
		WebElement UploadFile = driver.findElement(By.id("dropzone"));
		String filepath="\"C:\\Users\\VasanthakumarSekar\\Downloads\\Medyaan\\Vasanthakumar.pdf\"";
		UploadFile.sendKeys(filepath);
		Thread.sleep(9000);

		//Profile-Medical Info 
		driver.findElement(By.xpath("//p[text()='Medical info']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Allergy')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='btn submitbtn-color btn-secondary'])[1]")).click();
		Thread.sleep(2000);
		//Drug allergy ;
		driver.findElement(By.xpath("//*[text()=\"Penicillin\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Bactrim\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Tetracycline\"]")).click();
		//Allergies;
		driver.findElement(By.xpath("//*[text()=\"Pollen\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Dust mites\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Mold\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Animal dander and Cockroaches\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Insect sting\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Latex\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@varient='primary'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
		Thread.sleep(2000);

		//Medications
		driver.findElement(By.xpath("//a[contains(text(),'Medication')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),\"Add\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("searchInput")).sendKeys("Montel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='suggestions']//li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("custom-select")).click();
		WebElement Intake=driver.findElement(By.xpath("//*[@class=\"custom-select\"]"));
		Select Type1=new Select(Intake);
		Type1.selectByValue("Just before food");
		Thread.sleep(2000);
		driver.findElement(By.id("medicinecount")).sendKeys("10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[1]")).click();
		WebElement Tablet=driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[1]"));
		Select Morning=new Select(Tablet);
		Morning.selectByValue("4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[2]")).click();
		Thread.sleep(2000);
		WebElement Tablet1=driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[2]"));
		Select Afternoon=new Select(Tablet1);
		Afternoon.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[3]")).click();
		Thread.sleep(2000);
		WebElement Tablet2=driver.findElement(By.xpath("(//*[@class=\"custom-select rx-input\"])[3]"));
		Select Night=new Select(Tablet2);
		Night.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' Additional Comments']/following::textarea")).sendKeys("Take Rest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn mx-auto')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"deletemedication svg-inline--fa fa-pencil-alt fa-w-16\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-strength")).sendKeys("20ml");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn mx-auto')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"deletemedication svg-inline--fa fa-trash fa-w-14\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']/following-sibling::button[1]")).click();
		Thread.sleep(2000);
		//Profile-LifiStyle-Residence
		driver.findElement(By.xpath("//*[text()=\"Life style\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Life Style')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,'btn submitbtn-color')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Lives alone\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Private residence\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Assisted living\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Assisted living\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Nursing home\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(@class,'btn pull-right')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn collapse-btn')])[1]")).click();
		Thread.sleep(2000);

		//Profile-LifiStyle-Immunization
		driver.findElement(By.xpath("//a[contains(.,'Immunization')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col']//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='2021']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@name=\"datepicker\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'2011')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@varient='primary'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'btn collapse-btn')])[2]")).click();
		Thread.sleep(2000);

		driver.close();



	}
}


