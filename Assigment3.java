package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment3 {

	public static void main(String[] args) throws InterruptedException {
		
		  // set system path for browser driver
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");

        // open browser
        WebDriver driver = new ChromeDriver();       

        //open url
        driver.get("http://zero.webappsecurity.com/");
        
        driver.manage().window().maximize();
        
        // Sign In
        driver.findElement(By.id("signin_button")).click();
        
        driver.findElement(By.cssSelector("input#user_login")).sendKeys("username");
		 
		driver.findElement(By.cssSelector("#user_password")).sendKeys("password");

		driver.findElement(By.name("submit")).click();
		 
		driver.findElement(By.id("details-button")).click();
		 
	    driver.findElement(By.id("proceed-link")).click();
	    Thread.sleep(2000);
	     
		driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Purchase Foreign Currency')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("purchase_cash")).click();
		
		Alert ZbAlert = driver.switchTo().alert();
		String Alert = ZbAlert.getText();
	    System.out.println("The text on Zb alert is = '" + Alert + "'");
	    
	    ZbAlert.accept();
	    Thread.sleep(2000);
	    
	 
	    
	    // Confirmation 
	    
	    driver.get("https://www.naukri.com/");
	    Thread.sleep(2000);
	    
//	    driver.findElement(By.id("geoLocPopUp")).click();
//	    Thread.sleep(1000);
//	    Alert NAlert = driver.switchTo().alert();
//	    String Alert1 = NAlert.getText();
//	    System.out.println("The text on Naukri alert is = '" + Alert1 + "'");

//	    NAlert.accept();
	    
	    // Working With Handles
	    
	    
        String pHandle = driver.getWindowHandle();
        System.out.println(pHandle);
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")).click();
        Thread.sleep(1000);
        
        Thread.sleep(2000);
        
        Set <String> handles = driver.getWindowHandles();
        System.out.println(handles);
        Thread.sleep(2000);
        
        for (String h : handles) {
        	driver.switchTo().window(h);
        	
        	System.out.println(driver.getTitle());
        	Thread.sleep(2000);
        	
        }
        driver.switchTo().defaultContent();
       
        //close browser
        driver.close();

        // kill/quit driver
        driver.quit();
		
	}

}
