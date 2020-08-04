package com.IBM.Testlocators;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class testlocators {

	public static void main(String[] args) throws InterruptedException {
		
		
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\AhmedNasserKhamis\\Downloads\\Gecko\\geckodriver.exe " );  
	    
	   WebDriver driver = new FirefoxDriver ();
	   
	   driver.navigate().to("http://automationpractice.com/index.php");
	   
	   WebElement signIn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
	   
	   signIn.click();
	   
	   WebElement emailaddress = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
	   
	   emailaddress.sendKeys("ahmed.nasserr1234@gmail.com");
	   
	   
	   WebElement create_Button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span"));
	   
	   create_Button.click();
	   Thread.sleep(3000);
	   
	 //  WebElement popupmessage = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li"));
	 //  assertEquals(popupmessage.getText(), "An account using this email address has already been registered. Please enter a valid password or request a new one.");
	   
	   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	   
	   WebElement gender_RadioButton = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
	   
	   gender_RadioButton.click();
	   
	   WebElement first_Name = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
	   
	   first_Name.sendKeys("Ahmed");
	   
	   WebElement last_Name = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
	   
	   last_Name.sendKeys("Nasser");
	   
	   WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	   
	   password.sendKeys("1234567");
	   
	   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	   
	   WebElement select_Day = driver.findElement(By.xpath("//*[@id=\"days\"]"));
	   
	   select_Day.click();
	   
	   Select day = new Select (driver.findElement(By.id("days")));
	   day.selectByValue("1");
	   
	   WebElement select_Month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
	   
	   select_Month.click();
	   
	   Select Month = new Select (driver.findElement(By.id("months")));
	   Month.selectByValue("8");
	   
	   WebElement select_Year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
	   
	   select_Year.click();
	   
	   Select year = new Select (driver.findElement(By.id("years")));
	   year.selectByValue("1993");
	   
	   WebElement check_box = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
	   
	   check_box.click();
	   
	   WebElement company_Name = driver.findElement(By.xpath("//*[@id=\"company\"]"));
	   
	   company_Name.sendKeys("IBM");
	   
	   WebElement company_Addersse = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
	   
	   company_Addersse.sendKeys("Smart Village, Cairo");
	   
	   WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
	   
	   city.sendKeys("Alexandria");
	   
	   WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
	   state.click();
	   
	   Select select_state = new Select (driver.findElement(By.id("id_state")));
	   select_state.selectByValue("5");
	   
	   WebElement zip_code = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
	   
	   zip_code.sendKeys("00500");
	   
	   WebElement phone_Number = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
	   
	   phone_Number.sendKeys("01210344362");
	   
	   WebElement another_Addersee = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
	   
	   another_Addersee.sendKeys("Cairo, 6 october city");
	   
	   WebElement register_Button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span"));
	   register_Button.click();
	   
	   
	   
		
		

	}

}
   