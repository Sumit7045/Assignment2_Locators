package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 // Get Url
		 driver.get("http://zero.webappsecurity.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.className("search-query")).sendKeys("Online Banking");
		 
		 driver.findElement(By.id("signin_button")).click();
		 
		 driver.findElement(By.partialLinkText("Forgot")).click();
		 
		 driver.findElement(By.linkText("Zero Bank")).click();
		 
		 driver.findElement(By.tagName("button")).click();
		 Thread.sleep(2000);
		  
		 // Sign In
		 driver.findElement(By.cssSelector("input#user_login")).sendKeys("username");
		 
		 driver.findElement(By.cssSelector("#user_password")).sendKeys("password");
		 
		 driver.findElement(By.cssSelector("[class='icon-question-sign']")).click();
		 
		 driver.findElement(By.name("submit")).click();
		 
		 driver.findElement(By.id("details-button")).click();
		 
	     driver.findElement(By.id("proceed-link")).click();
	     Thread.sleep(2000);
	     
		 driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Add New Payee')]")).click();
		 Thread.sleep(2000);
				 
		 driver.findElement(By.xpath("//input[contains(@id,'np_new_payee_name')]")).sendKeys("abcd");
		
		 driver.findElement(By.cssSelector("textarea#np_new_payee_address")).sendKeys("Mumbai");
		 
		 driver.findElement(By.cssSelector("input[name='account']")).sendKeys("500");
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/article[1]/fieldset[1]/div[4]/div[1]/input[1]")).sendKeys("xyz");
		
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("add_new_payee")).click();
		 
		//Logging out

		 driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("logout_link")).click();
		 
		//Feedback
		 driver.findElement(By.id("feedback")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sumit kadam");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumitkadam616@gmail.com");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Test");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Good site");
		 Thread.sleep(1000);

		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(3000);
		 
		 //close browser
	     driver.close();

	     driver.quit();
			

	}

}
