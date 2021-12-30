package seleniumbasics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Confirmation {

	public static void main(String[] args) throws InterruptedException {
		
		  // set system path for browser driver
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");

        // open browser
        WebDriver driver = new ChromeDriver();    
        
        driver.manage().window().maximize();
        
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
        
        WebElement iFrame = driver.findElement(By.id("iframeResult"));
        
        driver.switchTo().frame(iFrame);
        
        WebElement tryit = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		
        tryit.click();
        
        Thread.sleep(2000);
        
        Alert JsConfirm = driver.switchTo().alert();
        String confirmtext = JsConfirm.getText();
        System.out.println("The text on the confirmation popup is - '" + confirmtext + "'");
        
        JsConfirm.accept();  
        Thread.sleep(2000);
        
        
        //close browser
        driver.close();

        // kill/quit driver
        driver.quit();
		

	}

}
