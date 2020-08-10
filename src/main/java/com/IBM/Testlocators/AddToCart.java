package com.IBM.Testlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class AddToCart {
	
	void AddCart() throws InterruptedException {
	
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\AhmedNasserKhamis\\Downloads\\Gecko\\geckodriver.exe " );  
	    
	   WebDriver driver = new FirefoxDriver ();
	   
	   driver.navigate().to("http://automationpractice.com/index.php");
	   
	   WebElement signIn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));	   
	   signIn.click();
	   
	   WebElement Email_address = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	   
	   Email_address.sendKeys("ahmed.nasser739@gmail.com");
	   
	   WebElement Password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	   
	   Password.sendKeys("1234567");
	   
	   WebElement signin = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
	   signin.click();
	   
	   WebElement search_field = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
	   
	   search_field.sendKeys("dress");
	   
	   WebElement search_Button = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
	   search_Button.click();
	   
	   //Hover on the first item
	   Actions action = new Actions(driver);
	   WebElement we = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
	   action.moveToElement(we).perform();
	   
	   //Add the first item to the cart 
	   WebElement add_firstitem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
	   add_firstitem.click();
	   Thread.sleep(3000);
	   WebElement continue_shopping = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span"));
	   continue_shopping.click();
	   
	   //Hover on the second item
	   Actions action2 = new Actions(driver);
	   WebElement we2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
	   action2.moveToElement(we2).perform();
	   
	   //Add the second item to the cart and Assert that displayed total price equals First Item Price + Second Item Price + 2$ shipping fee.
	   WebElement add_seconditem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
	   add_seconditem.click();
	   Thread.sleep(3000);
	   String expected_totalPrice = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[3]/span")).getText();
	   WebElement proceed_to_checkout = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
	   proceed_to_checkout.click();
	   Thread.sleep(3000);
	   double item1_Price = 28.98;
	   double item2_Price = 50.99;
	   double total_Shipping = 2.00;
	   
	   
	   double actual_totalPrice = item1_Price + item2_Price + total_Shipping ;
	   String result = "$" + String.valueOf(actual_totalPrice);
	   
	   Assert.assertEquals(result, expected_totalPrice);
	   
	   System.out.println(" The displayed total price equals First Item Price + Second Item Price + 2$ shipping fee.");
	   
	   
	   		
	   
	  
	
	}

}
