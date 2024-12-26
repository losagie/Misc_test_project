package Selenium_Prj;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TravelbyTrain {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/railways/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement Train = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Train).perform();
		Train.sendKeys("Mumbai");
		Train.sendKeys(Keys.ARROW_DOWN);
		Train.sendKeys(Keys.ENTER);
		driver.quit();
		
		
		
			


	}


	}


